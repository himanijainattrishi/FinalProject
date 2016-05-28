 <%@include file="Header.jsp"%>
 
 <%-- <div align="center">
        <form:form action="useradd" method="post" commandName="user">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Registration</h2></td>
                </tr>
               <tr>
                <td>
                 <tr>
                    <td>Username</td>
                    <td><form:input path="username" width="100" height="100" /></td>
                </tr>
       
          
        </td> 
   
                <tr>
               <br><br>     <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr>
                <br>
                <tr>
                    <td>E-mail:::</td>
                    <td><form:input path="email" /></td>
                </tr>
               <br>
                <tr>
                    <td>Gender:</td>
                <td>  <form:radiobutton path="gender" value="M"/>Male 
                   <form:radiobutton path="gender" value="F"/>Female</td></tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
        
        
        
      
    </div> 
   --%>
   
   <div class="container">
   <div class="row">
   <div class="col-sm-4"></div>
   <div class="col-sm-6">
   
        <form:form action="useradd" method="post" commandName="user">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Registration</h2></td>
                </tr>
               <tr>
                <td>
                 <tr>
                    <td>Username</td>
                    <td><form:input path="username" width="100" height="100" /></td>
                </tr>
       
          
        </td> 
   
                <tr>
               <br><br>     <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr>
                <br>
                <tr>
                    <td>E-mail:::</td>
                    <td><form:input path="email" /></td>
                </tr>
               <br>
               
                <tr>
                    <td>Gender:</td>
                <td>  <form:radiobutton path="gender" value="M"/>Male 
                   <form:radiobutton path="gender" value="F"/>Female</td></tr>
                <tr>
                <%--  <tr>
                    <td>Address:</td>
               <td><form:input path="Address" width="100" height="100" /></td> --%>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
        
        
        
      
    </div> 
    <div class="col-sm-2"></div>
    </div>
    </div>
  
  
 
 