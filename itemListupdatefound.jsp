<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>  
<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>Add Address</title> 
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
  <div class="container" style= "background-color:white; margin: auto; padding-top: 90px; width:600px;">

    <form:form action="updateitemListprocess" modelAttribute="itemList" method="post"> 

    <form:hidden path="itemId" value="${itemList.itemId}" />

    <div class="form-group">
        <label for="itemName"> Item Name</label>
        <form:input path="itemName" 
          class="form-control" name="" id="itemName"/>
    </div>

    <div class="form-group">
      <label for="category">Category</label>
      <form:input path="category" 
        class="form-control" name="" id="category"/>
    </div>
    
    <div class="form-group">
        <label for="quantity">Quantity</label>
        <form:input path="quantity" 
        class="form-control" name="" id="quantity"/>
    </div>

    <div class="form-group">
        <label for="cost">Cost</label>
        <form:input path="cost" 
        class="form-control" name="" id="cost"/>
    </div>
    <div class="form-group">
        <label for="restaurant">Restaurant</label>
        <form:input path="restaurant" 
        class="form-control" name="" id="restaurant"/>
    </div>
  
    <div class="form-group">
        <button type="submit" class="btn btn-primary">Save</button>
    </div>
</form:form>
</div>
</body>  
</html>