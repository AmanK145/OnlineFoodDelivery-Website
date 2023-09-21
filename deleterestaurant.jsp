<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Insert title here</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

	<div class="container">
		<form:form action="fetchdeleterestaurant" modelAttribute="restaurant" method="post">
     
    
      <div class="form-group">
        <label for="restaurant">Restaurant Id</label>
        <form:input path="restaurantId"  class="form-control"/>
      </div>
			
      <button type="submit" class="btn btn-primary">Delete restaurant details</button>
		</form:form>
	</div>
	
</body>
</html>