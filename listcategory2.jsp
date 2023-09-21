<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,org.ssce.model.*"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List category</title>

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
          <th>Category ID</th>
          <th>CategoryName</th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <%
          List<Category> categories = (List<Category>) request.getAttribute("categories");
          for(Category category: categories){
            out.println("<tr>");
            out.println("<td scope=\"row\">"+category.getCatId()+"</td>");
            out.println("<td scope=\"row\">"+category.getCategoryName()+"</td>");
            out.println("<td><a href=\"\"><button>view</button></a></td>");
            
            addactivity isn
 x
out.println("</tr>");
          }
        %>  
      </tbody>
    </table>
  </div>