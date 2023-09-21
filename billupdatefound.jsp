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
		<form:form action="updatebillprocess" modelAttribute="bill" method="post">
     
        <form:hidden  path="billId"  value = "${bill.billId}"/>

      <div class="form-group">
        <label for="totalItem">TotalItem :</label>
                <form:input path="totalItem" class="form-control" id="totalItem"></form:input>
            </div>
            <div class="form-group">
              <label for="orderDetails">OrderDetails :</label>
              <form:input path="orderDetails" class="form-control" id="orderDetails"></form:input>
          </div>
            <div class="form-group">
              <label for="totalCost">TotalCost :</label>
                      <form:input path="totalCost" class="form-control" id="totalCost"></form:input>
                  </div>
			
      <button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
	
</body>
</html>