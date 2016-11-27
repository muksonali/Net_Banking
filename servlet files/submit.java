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
public class submit extends HttpServlet {
   
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
            out.println("<title>Servlet submit</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet submit at " + request.getContextPath () + "</h1>");
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
            HttpSession session =request.getSession();
		String accountnumber=request.getParameter("accountnumber");
		String pwd=request.getParameter("password");
		
		String dated=request.getParameter("dated");
		String fullname=request.getParameter("fullname");
		
                
                String address=request.getParameter("address");
                  String contactnumber=request.getParameter("contactnumber");
                    
                    
                    
                    String b=request.getParameter("btn");
                
		  // try
	      //  {
		if(b.equals("Admin_Add_Customer"))
		{
			try
			{
			connection c=new connection();
			Connection con=c.getConnection();
		Statement st=con.createStatement();
		st.executeUpdate("insert into tblcustomer(accountnumber,password,dated,fullname,address,contactnumber) values('"+accountnumber+"','"+pwd+"','"+dated+"','"+fullname+"','"+address+"','"+contactnumber+"')");
                
		con.close();
		//out.print("<script type='text/javascript'>alert('Data Saved Successfully');</script>");
		response.sendRedirect("admin_add_new_customer.jsp");
			}catch(Exception e1){out.print(""+e1);}
		}
                    try {
                if (b.equals("Admin_Update_Customer")) {

connection c=new connection();
			Connection con=c.getConnection();
                    Statement st = con.createStatement();
                    st.executeUpdate("update tblcustomer set fullname='" + fullname + "',address='" + address + "',contactnumber='" + contactnumber + "' where accountnumber='" + accountnumber + "'");

                    con.close();
                    //out.print("<script type='text/javascript'>alert('Data Saved Successfully');</script>");
                    response.sendRedirect("admin_view_customers.jsp");
                }
            } catch (Exception e1) {
                out.print("" + e1);
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
