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
                <form:form action="deleterestaurantprocess" modelAttribute="restaurant" method="post">

                <form:hidden path="restaurantId" value="${restaurant.restaurantId}" />

                <div class="form-group">
                    <label for="restaurantName">Restaurant Name</label>
                    <form:input path="restaurantName" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="address">Address</label>
                    <form:input path="address" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="itemList">Item List</label>
                    <form:input path="itemList" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="managerName">Manager Name</label>
                    <form:input path="managerName" class="form-control" />
                </div>

                <div class="form-group">
                    <label for="contactNumber">ContactNumber</label>
                    <form:input type="contactNumber" path="contactNumber" class="form-control" />
                </div>

                    <button type="submit" class="btn btn-primary">Delete</button>
                </form:form>
            </div>

        </body>

        </html>