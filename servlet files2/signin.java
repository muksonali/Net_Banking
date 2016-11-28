/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
/**
 *
 * @author PC
 */
public class signin extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signin</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signin at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       // processRequest(request, response);
        
          PrintWriter out=response.getWriter(); 
		String uns=request.getParameter("username");
                String accountnumber=request.getParameter("accountnumber");
		String pwds=request.getParameter("password");
		String b=request.getParameter("btn");
                HttpSession session=request.getSession();
		  // try
	      //  {
               
		if(b.equals("AdminLogin"))
		{
                   
			try
			{
			connection c=new connection();
                       
			Connection con=c.getConnection();
                        
		Statement st=con.createStatement();
              
		ResultSet rs=st.executeQuery("Select * from tbladmin where usernames='"+uns+"' and passwords='"+pwds+"'");
		
                if(rs.next())
		{
                    out.print("welcome");
			response.sendRedirect("admin_home.jsp");
		}
		else
		{out.print("wronge");
			//out.print("<script type='text/javascript'>alert('Wrong Credentials');</script>");
			response.sendRedirect("admin_login.jsp");
		}
			}catch(Exception e1){out.print(""+e1);}
		
		}
                
                if(b.equals("CustomerLogin"))
		{
			try
			{
			connection c=new connection();
			Connection con=c.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from tblcustomer where accountnumber='"+accountnumber+"' and password='"+pwds+"'");
		if(rs.next())
		{
                   session.setAttribute("customeraccoutnumber", accountnumber);
			response.sendRedirect("customer_home.jsp");
		}
		else
		{
			//out.print("<script type='text/javascript'>alert('Wrong Credentials');</script>");
			response.sendRedirect("customer_login.jsp");
		}
			}catch(Exception e1){out.print(""+e1);}
		
		}
                  
        
        
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
