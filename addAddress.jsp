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

    
    <div class="container" style="width: 500px; background-color: antiquewhite; margin: 5px;padding: 5px;">
        <form:form action="addaddress" modelAttribute="address" method="post"> 
            <div class="form-group">
                <label for="addressId">Address Id :</label>
                <form:input path="addressId" class="form-control" id="addressId"></form:input>
            </div> 

            <div class="form-group">
                <label for="buildingName">Building Name :</label>
                <form:input path="buildingName" class="form-control" id="buildingName"></form:input>
            </div>
            <div class="form-group">
                <label for="streetNo">Street Number :</label>
                <form:input path="streetNo" class="form-control" id="streetNo"></form:input>
            </div>

            <div class="form-group">
                <label for="area">area :</label>
                <form:input path="area" class="form-control" id="area"></form:input>
            </div>
            
            <div class="form-group">
                <label for="city">City :</label>
                <form:input path="city" class="form-control" id="city"></form:input>
            </div>
            <div class="form-group">
                <label for="state">State :</label>
                <form:input path="state" class="form-control" id="state"></form:input>
            </div>
            <div class="form-group">
                <label for="country">Country :</label>
                <form:input path="country" class="form-control" id="country"></form:input>
            </div>
            <div class="form-group">
                <label for="pincode">Pincode :</label>
                <form:input path="pincode" class="form-control" id="pincode"></form:input>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form:form>
    </div>
</body>
</html>