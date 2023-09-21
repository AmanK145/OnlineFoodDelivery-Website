<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Restaurant</title>

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

    
    <div class="container" style="width: 500px; background-color: antiquewhite; margin: 5px;padding: 5px;">
        <form:form action="addrestaurant" modelAttribute="restaurant" method="post"> 
            <div class="form-group">
                <label for="restaurantId">Restaurant Id :</label>
                <form:input path="restaurantId" class="form-control" id="restaurantId"></form:input>
            </div> 

            <div class="form-group">
                <label for="restaurantName">Restaurant Name:</label>
                <form:input path="restaurantName" class="form-control" id="restaurantName"></form:input>
            </div>
            <div class="form-group">
                <label for="address">Address :</label>
                <form:input path="address" class="form-control" id="address"></form:input>
            </div>

            <div class="form-group">
                <label for="itemList">Item List:</label>
                <form:input path="itemList" class="form-control" id="itemList"></form:input>
            </div>

            <div class="form-group">
                <label for="managerName">Manager Name :</label>
                <form:input path="managerName" class="form-control" id="managerName"></form:input>
            </div>
            
            <div class="form-group">
                <label for="contactNumber">ContactNumber :</label>
                <form:input path="contactNumber" class="form-control" id="contactNumber"></form:input>
            </div>
           
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form:form>
    </div>
</body>
</html>