package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import entity.Employe;

@SuppressWarnings("serial")
public class MgmtEmp extends HttpServlet {
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url=request.getRequestURI();
		String path=url.substring(url.lastIndexOf("/"),url.lastIndexOf("."));
		if(path.equals("/list")){
			EmployeeDAO dao=new EmployeeDAO();
			try{
				List<Employe> employees=dao.list();
				
				request.setAttribute("employees",employees);
				request.getRequestDispatcher("emplist.jsp").forward(request,response);
			}catch(Exception e){
				e.printStackTrace();
				throw new ServletException(e);
			}
		}
		if(path.equals("/delEmp")){
			long id=Long.parseLong(request.getParameter("id"));
			EmployeeDAO dao=new EmployeeDAO();
			try {
				dao.del(id);
				List<Employe> employees=dao.list();
				
				request.setAttribute("employees", employees);
				request.getRequestDispatcher("emplist.jsp").forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		}
		if(path.equals("/addEmp")) {
			long id=Long.parseLong(request.getParameter("id"));
			EmployeeDAO dao=new EmployeeDAO();
			try {
				dao.add(id);
				List<Employe> employees=dao.list();
				
				request.setAttribute("employees", employees);
				request.getRequestDispatcher("emplist.jsp").forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		}
		if(path.equals("/loadEmp")) {
			long id=Long.parseLong(request.getParameter("id"));
			EmployeeDAO dao=new EmployeeDAO();
			try {
				dao.load(id);
				List<Employe> employees=dao.list();
				
				request.setAttribute("employees", employees);
				request.getRequestDispatcher("emplist.jsp").forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		}
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
