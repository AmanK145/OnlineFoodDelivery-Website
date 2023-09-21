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
                <form:form action="deleteaddressprocess" modelAttribute="address" method="post">

                <form:hidden path="addressId" value="${address.addressId}" />

                <div class="form-group">
                    <label for="buildingName">Building Name</label>
                    <form:input path="buildingName" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="streetNo">StreetNo</label>
                    <form:input path="streetNo" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="area">Area</label>
                    <form:input path="area" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="city">City</label>
                    <form:input type="city" path="city" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="state">State</label>
                    <form:input path="state" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="country">Country</label>
                    <form:input path="country" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="pincode">Pincode</label>
                    <form:input path="pincode" class="form-control" />
                </div>

                    <button type="submit" class="btn btn-primary">Delete</button>
                </form:form>
            </div>

        </body>

        </html>