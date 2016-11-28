<%@ include file="admin_top.jsp" %>
<center><h3>Admin-Update Customer</h3>
    <form  action="submit" method="post">
        
        <table style="width:50%">
            
            <tr>
                <td>Account Number</td>
                <td>
                    
                    
                    <input type="text"  name="accountnumber" value='<%=request.getParameter("accountnumber")%>' placeholder="Account Number">
                </td>
            </tr>
            
            <tr>
                <td>Full Name</td>
                <td>
                    
                    
                    <input type="text"  name="fullname" value='<%=request.getParameter("fullname")%>' placeholder="FullName">
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    
                    
                    <input type="text"  name="address" value='<%=request.getParameter("address")%>' placeholder="Address">
                </td>
            </tr>
            <tr>
                <td>Contact Number</td>
                <td>
                    
                    
                    <input type="text"  name="contactnumber" value='<%=request.getParameter("contactnumber")%>' placeholder="Contact Number">
                </td>
            </tr>
             <tr>
                <td>Password</td>
                <td>
                    
                    
                    <input type="text"  name="password" value='<%=request.getParameter("pwd")%>' placeholder="Password">
                </td>
            </tr>
            <tr>
                <td><input type="submit" name="btn" Value="Admin_Update_Customer">
                </td>
            </tr>
        </table>
        
      
        
</form></center>