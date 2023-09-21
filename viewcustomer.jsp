<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Customer</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

	<div class="container">
		<form:form action="listcustomer" modelAttribute="customer" method="get">
     
    
    
      <div class="form-group">
        <label for="customerId">CustomerId</label>
        <input type="text" disabled value="${customer.customerId}" class="form-control" id="customerId"/>
        
      </div>
    
            <div class="form-group">
              <label for="customerFirstName">Customer First Name</label>
              <input type="text" disabled value="${customer.customerFirstName}" class="form-control" id="customerFirstName"/>
            
            </div>
    
            <div class="form-group">
                <label for="customerLastName">Last  Name :</label>
                <input type="text" disabled value="${customer.customerLastName}" class="form-control" id="customerLastName"/>
                
            </div>
    
            <div class="form-group">
              <label for="age">Age :</label>
              <input type="text" disabled value="${customer.age}" class="form-control" id="age"/>
            
            </div>
    
            <div class="form-group">
               <label for="gender">Gender :</label>
               <input type="text" disabled value="${customer.gender}" class="form-control" id="gender"/>
             
            </div>
    
            <div class="form-group">
                <label for="mobileNumber">Mobile Number :</label>
                <input type="text" disabled value="${customer.mobileNumber}" class="form-control" id="mobileNumber"/>
                
            </div>
    
            <div class="form-group">
                <label for="email">Email :</label>
                <input type="text" disabled value="${customer.email}" class="form-control" id="email"/>
               
            </div>
    
            <div class="form-group">
              <label for="address">Address Id :</label>
              <input type="text" disabled value="${customer.address.addressId}" class="form-control" id="address"/>
              
          </div>
          <div class="form-group">
            <label for="buildingName">Building Name :</label>
            <input type="text" disabled value="${customer.address.buildingName}" class="form-control" id="address"/>
        </div>
        <div class="form-group">
            <label for="streetNo">Street Number :</label>
            <input type="text" disabled value="${customer.address.streetNo}" class="form-control" id="address"/>
        </div>
    
        <div class="form-group">
            <label for="area">Area :</label>
            <input type="text" disabled value="${customer.address.area}" class="form-control" id="address"/>
        </div>
        
        <div class="form-group">
            <label for="city">City :</label>
            <input type="text" disabled value="${customer.address.city}" class="form-control" id="address"/>
        </div>
        <div class="form-group">
            <label for="state">State :</label>
            <input type="text" disabled value="${customer.address.state}" class="form-control" id="address"/>
        </div>
        <div class="form-group">
            <label for="country">Country :</label>
            <input type="text" disabled value="${customer.address.country}" class="form-control" id="address"/>
        </div>
        <div class="form-group">
            <label for="pincode">Pincode :</label>
            <input type="text" disabled value="${customer.address.pincode}" class="form-control" id="address"/>
        </div>
    





     
      <button type="submit" class="btn btn-primary">Back</button>
		</form:form>
	</div>
	
</body>
</html>