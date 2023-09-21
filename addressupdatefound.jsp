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

    <form:form action="updateaddressprocess" modelAttribute="address" method="post"> 

    <form:hidden path="addressId" value="${address.addressId}" />

    <div class="form-group">
        <label for="buildingName"> Building Name</label>
        <form:input path="buildingName" 
          class="form-control" name="" id="buildingName"/>
    </div>

    <div class="form-group">
      <label for="streetNo">streetNo</label>
      <form:input path="streetNo" 
        class="form-control" name="" id="streetNo"/>
    </div>
    
    <div class="form-group">
        <label for="area">Area</label>
        <form:input path="area" 
        class="form-control" name="" id="area"/>
    </div>

    <div class="form-group">
        <label for="city">City</label>
        <form:input path="city" 
        class="form-control" name="" id="city"/>
    </div>
    <div class="form-group">
        <label for="state">State</label>
        <form:input path="state" 
        class="form-control" name="" id="state"/>
    </div>
    <div class="form-group">
        <label for="country">Country</label>
        <form:input path="country" 
        class="form-control" name="" id="country"/>
    </div>
    <div class="form-group">
        <label for="pincode">PinCode</label>
        <form:input path="pincode" 
        class="form-control" name="" id="pincode"/>
    </div>
    <div class="form-group">
        <button type="submit" class="btn btn-primary">Save</button>
    </div>
</form:form>
</div>
</body>  
</html>