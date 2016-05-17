package com.bankaccount;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bankaccount.AccountBean;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String ReceivingBalance=request.getParameter("rbalance");  
        double rbalance=Double.parseDouble(ReceivingBalance); 
        String DepositAmount=request.getParameter("damount");
        double damount=Double.parseDouble(DepositAmount);
        String WithdrawAmount=request.getParameter("wamount");
        double wamount=Double.parseDouble(WithdrawAmount);

        AccountBean bean = new AccountBean ();
        bean.setReceivingBalance(rbalance);  
        bean.setDepositAmount(damount);
        bean.setWithdrawAmount(wamount);
        request.setAttribute("bean",bean);  
          
        boolean status=bean.isValidWithdrawal();  
          
        if(status){  
            RequestDispatcher rd=request.getRequestDispatcher("login-succes.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }  
        
	}

}
