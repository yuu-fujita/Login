//package jp.co.aforce.action;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import jp.co.aforce.beans.Login;
//import jp.co.aforce.dao.LoginDAO;
//
///**
// * Servlet implementation class LoginAction
// */
//@WebServlet("jsp/loginAction")
//public class LoginAction extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	
////	private LoginDAO loginDAO;
////	
////	@Override
////	public void init() throws ServletException{
////		loginDAO = new LoginDAO();
////	}
////       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LoginAction() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
////		HttpSession session=request.getSession();
//		Login login;
//		String id = request.getParameter("id");
//		String pass = request.getParameter("pass");
//		LoginDAO dao=new LoginDAO();
//		
//		try {
//			login = dao.search(id, pass);
//		} catch (Exception e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
//		
////		Login login = loginDAO.search(id, pass);
//
//		if(login != null) {
//			request.getSession().setAttribute("login", login);
//			response.sendRedirect("login-ok.jsp");
//		}else {
//			request.setAttribute("errorMassage", "IDもしくはパスワードが違います");
//			request.setAttribute("id", id);
//		}
////	}
//
//}
