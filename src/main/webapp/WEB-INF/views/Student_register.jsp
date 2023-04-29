<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Student Register</title>


<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="style.css">
    
    <!-- Additional CSS -->
    <style>
        /* Custom CSS for New Registration JSP */
        
        .container {
            margin-top: 50px;
            max-width: 500px;
        }
        
        h1 {
            text-align: center;
            margin-bottom: 30px;
        }
        
        table {
            width: 100%;
        }
        
        form {
            background-color: #fff;
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0px 2px 5px rgba(0,0,0,0.3);
        }
  </style>
</head>
<body>
  <div class="container">
    <div class="row">
      <div class="col-sm-12">
        <h1>Student Registration Form</h1>
        <figure>
							<img src="images/signin-image.jpg" alt="sing up image">
						</figure>
   
   <form action="<%=request.getContextPath() %>/StudentServlet" method="post">
           <p>Click on the computer, the phone, or the cup of coffee to go to a new page and read more about the topic:</p>
        
<img src="workplace.jpg" alt="Workplace" usemap="#workmap" width="400" height="379">

<map name="workmap">
  <area shape="rect" coords="34,44,270,350" alt="Computer" href="computer.htm">
  <area shape="rect" coords="290,172,333,250" alt="Phone" href="phone.htm">
  <area shape="circle" coords="337,300,44" alt="Cup of coffee" href="coffee.htm">
</map> 
          <table>
          
            <tr>
              <th>First Name</th>
              <td><input type="text" name="firstname" required></td>
            </tr>

            <tr>
              <th>Last Name</th>
              <td><input type="text" name="lastname" required></td>
            </tr>

            <tr>
              <th>Email</th>
              <td><input type="text" name="email" required></td>
            </tr>

            <tr>
              <th>Contact</th>
              <td><input type="text" name="contact" required></td>
            </tr>

            <tr>
              <th>Branch</th>
              <td><input type="text" name="branch" required></td>
            </tr>

            <tr>
              <th>Section</th>
              <td><input type="text" name="section" required></td>
            </tr>

            <tr>
              <th>Username</th>
              <td><input type="text" name="username" required></td>
            </tr>

            <tr>
              <th>Password</th>
              <td><input type="password" name="password" required></td>
            </tr>
          </table>

          <input type="submit" value="Save" class="btn btn-success"/>
        </form>
      </div>
    </div>

</body>
</html>
