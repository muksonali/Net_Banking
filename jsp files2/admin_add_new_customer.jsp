<%@ include file="admin_top.jsp" %>
<center><h3>Admin-Add New Customer</h3>
<form action="submit" method="post">
									
									<table style="width:50%">
                                                                             <tr>
                                                                                 <td>Account Number</td>
                                                                                 <td>
										<input type="text"   name="accountnumber" placeholder="Account Number" required>
                                                                         </td></tr>
                                                                         <tr>
                                                                             <td>Password</td>
                                                                             <td>
                                                                                 
									
										<input type="password"  name="password" placeholder="Password" required>
                                                                             </td>
                                                                         </tr>
                                                                         
                                                                          <tr>
                                                                             <td>Dated</td>
                                                                             <td>
                                                                                 
									
										<input type="date"  name="dated" placeholder="Date" required >
                                                                             </td>
                                                                         </tr>
                                                                           <tr>
                                                                             <td>Full Name</td>
                                                                             <td>
                                                                                 
									
										<input type="text"  name="fullname" placeholder="FullName" required>
                                                                             </td>
                                                                         </tr>
                                                                           <tr>
                                                                             <td>Address</td>
                                                                             <td>
                                                                                 
									
										<input type="text"  name="address" placeholder="Address" required>
                                                                             </td>
                                                                         </tr>
                                                                         <tr>
                                                                             <td>Contact Number</td>
                                                                             <td>
                                                                                 
									
										<input type="text"  name="contactnumber" placeholder="Contact Number" required>
                                                                             </td>
                                                                         </tr>
                                                                          <tr>
                                                                             <td>Initially Deposited Amount</td>
                                                                             <td>
                                                                                 
									
										<input type="text"  name="initiallydepositedamount" required placeholder="Initially Deposited Amount">
                                                                             </td>
                                                                         </tr>
                                                                         <tr>
                                                                           <td><input type="submit" name="btn" Value="Admin_Add_Customer">
                                                                           </td>
                                                                       </tr>
                                                                   </table>
								
									
                                                                         
                                                                 </form></center>