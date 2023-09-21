<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,org.ssce.model.*"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List customer</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
  <div class="container" style="margin-top: 20px;margin-bottom: 20px;padding: 20px;height: 300px;">
    <table class="table table-striped table-inverse table-responsive">
      <thead class="thead-inverse">
        <tr>
          <th>User ID</th>
          <th>userName</th>
          
        </tr>
      </thead>
      <tbody>
        <%
          List<User> users = (List<User>) request.getAttribute("users");
          for(User user: users){
            out.println("<tr>");
            out.println("<td scope=\"row\">"+user.getUserId()+"</td>");
            out.println("<td>"+user.getUserName()+" </td>");
            
            out.println("<td><a href=\"http://localhost:5002/user/viewuser?userId=" +user.getUserId() +"\"><button>View</button></a></td>");
            out.println("<td><a href=\"http://localhost:5002/user/deluser?userId=" +user.getUserId() +"\"><button>Delete</button></a></td>");
            out.println("</tr>");
          }
        %>  
      </tbody>
    </table>
  </div>