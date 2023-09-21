<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,org.ssce.model.*"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List admin</title>

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
          <th>Admin ID</th>
          <th>adminName</th>
          
        </tr>
      </thead>
      <tbody>
        <%
          List<Admin> admins = (List<Admin>) request.getAttribute("admins");
          for(Admin admin: admins){
            out.println("<tr>");
            out.println("<td scope=\"row\">"+admin.getAdminId()+"</td>");
            out.println("<td>"+admin.getAdminName()+" </td>");
            
            out.println("<td><a href=\"http://localhost:5002/admin/viewadmin?adminId=" +admin.getAdminId() +"\"><button>View</button></a></td>");
            out.println("<td><a href=\"http://localhost:5002/admin/deladmin?adminId=" +admin.getAdminId() +"\"><button>Delete</button></a></td>");
            out.println("</tr>");
          }
        %>  
      </tbody>
    </table>
  </div>