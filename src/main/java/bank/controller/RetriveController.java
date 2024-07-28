package bank.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bank.dao.RegisterDao;
import bank.dao.RegisterDaoImpl;
import bank.model.Register;

/**
 * Servlet implementation class RetriveController
 */
@WebServlet("/RetriveController")
public class RetriveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int regNo=Integer.parseInt(request.getParameter("regno"));
		RegisterDao regdao=new RegisterDaoImpl();
		List<Register> lstreg=regdao.retriveRecord(regNo);
		//new session is created
		HttpSession session=request.getSession();
		
		if(lstreg!=null)
		{
			session.setAttribute("data",lstreg);
			response.sendRedirect("RetriveView.jsp");
			//Register reg=lstreg.get(0);
			//System.out.println(reg.getRegNo()+"\t"+reg.getCustName());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
