<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add bill</title>

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
        <form:form action="addbill" modelAttribute="bill" method="post"> 
            <div class="form-group">
                <label for="catId">Bill Id :</label>
                <form:input path="billId" class="form-control" id="billId"/>
            </div>
            <div class="form-group">
                <label for="orderDetails">OrderDetails :</label>
                <form:input path="orderDetails" class="form-control" id="orderDetails"></form:input>
            </div>
            
            
          <div class="form-group">
            <label for="totalItem">totalItem :</label>
            <form:input path="totalItem" class="form-control" id="totalItem"></form:input>
        </div>
        <div class="form-group">
          <label for="totalCost">totalCost :</label>
          <form:input path="totalCost" class="form-control" id="totalCost"></form:input>
      </div>

            <div class="form-group">
                <button type="submit" class="btn btn-primary">Save</button>
            </div>
        </form:form>
    </div>

    

</body>
</html>