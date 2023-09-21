<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
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
                <form:form action="deletecustomerprocess" modelAttribute="customer" method="post">

                <form:hidden path="customerId" value="${customer.customerId}" />

                <div class="form-group">
                    <label for="firstName">First Name</label>
                    <form:input path="customerFirstName" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="lastName">Last Name</label>
                    <form:input path="customerLastName" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="age">Age</label>
                    <form:input path="age" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="gender">Gender</label>
                    <form:input type="gender" path="gender" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="mobileNumber">Mobile Number</label>
                    <form:input path="mobileNumber" class="form-control" />
                </div>

               

                <div class="form-group">
                    <label for="email">Email</label>
                    <form:input path="email" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="address">Address Id</label>
                    <form:input path="address" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="buildingName">Building Name :</label>
                    <form:input path="address.buildingName" class="form-control" id="address"></form:input>
                </div>
                <div class="form-group">
                    <label for="streetNo">Street Number :</label>
                    <form:input path="address.streetNo" class="form-control" id="address"></form:input>
                </div>
            
                <div class="form-group">
                    <label for="area">area :</label>
                    <form:input path="address.area" class="form-control" id="address"></form:input>
                </div>
                
                <div class="form-group">
                    <label for="city">City :</label>
                    <form:input path="address.city" class="form-control" id="address"></form:input>
                </div>
                <div class="form-group">
                    <label for="state">State :</label>
                    <form:input path="address.state" class="form-control" id="address"></form:input>
                </div>
                <div class="form-group">
                    <label for="country">Country :</label>
                    <form:input path="address.country" class="form-control" id="address"></form:input>
                </div>
                <div class="form-group">
                    <label for="pincode">Pincode :</label>
                    <form:input path="address.pincode" class="form-control" id="address"></form:input>
                </div>

                    <button type="submit" class="btn btn-primary">Delete</button>
                </form:form>
            </div>

        </body>

        </html>