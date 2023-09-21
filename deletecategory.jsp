<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Delicious Bootstrap Template - Index</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="../../assets/img/favicon.png" rel="icon">
  <link href="../../assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,600,600i,700,700i|Satisfy|Comic+Neue:300,300i,400,400i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="../../assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="../../assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="../../assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="../../assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="../../assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="../../assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="../../assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Delicious - v4.10.0
  * Template URL: https://bootstrapmade.com/delicious-free-restaurant-bootstrap-theme/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

 

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-center header-dark">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-between" >

      <div class="logo me-auto">
        <h1><a href="index.html">Delicious</a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
      </div>

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a class="nav-link scrollto active" href="http://localhost:5001">Home</a></li>
          <li><a class="nav-link scrollto" href="#about">About</a></li>
          <li><a class="nav-link scrollto" href="#menu">Menu</a></li>
          <li><a class="nav-link scrollto" href="#specials">Specials</a></li>
          <li><a class="nav-link scrollto" href="#events">Events</a></li>
          <li><a class="nav-link scrollto" href="#chefs">Chefs</a></li>
          <li><a class="nav-link scrollto" href="#gallery">Gallery</a></li>
          <li class="dropdown"><a href="#"><span>Drop Down</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              
              <li class="dropdown"><a href="#"><span>Customer</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="/customer/addcustomer">Add Customer</a></li>
                  <li><a href="#">Update Customer</a></li>
                  <li><a href="#">Delete Customer</a></li>
                  <li><a href="#">View Customer</a></li>
                </ul>
              </li>

              <li class="dropdown"><a href="#"><span>Restaurant</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="#">Add Restaurant</a></li>
                  <li><a href="#">Update Restaurant</a></li>
                  <li><a href="#">Delete Restaurant</a></li>
                  <li><a href="#">View Restaurant</a></li>
                </ul>
              </li>

              <li class="dropdown"><a href="#"><span>Address</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="#">Add Address</a></li>
                  <li><a href="#">Update Address</a></li>
                  <li><a href="#">Delete Address</a></li>
                  <li><a href="#">View Address</a></li>
                </ul>
              </li>

              <li class="dropdown"><a href="#"><span>Item</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="#">Add Item</a></li>
                  <li><a href="#">Update Item</a></li>
                  <li><a href="#">Delete Item</a></li>
                  <li><a href="#">View Item</a></li>
                </ul>
              </li>

              <li class="dropdown"><a href="#"><span>Order Details</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="#">Add Order Details</a></li>
                  <li><a href="#">Update Order Details</a></li>
                  <li><a href="#">Delete Order Details</a></li>
                  <li><a href="#">View Order Details</a></li>
                </ul>
              </li>

              <li class="dropdown"><a href="#"><span>Bill</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="#">Add Bill</a></li>
                  <li><a href="#">Update Bill</a></li>
                  <li><a href="#">Delete Bill</a></li>
                  <li><a href="#">View Bill</a></li>
                </ul>
              </li>

              <li class="dropdown"><a href="#"><span>Category</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="/category/addcategory">Add Category</a></li>
                  <li><a href="/category/updatecategory">Update Category</a></li>
                  <li><a href="/category/deletecategory">Delete Category</a></li>
                  <li><a href="#">View Category</a></li>
                </ul>
              </li>

              <li class="dropdown"><a href="#"><span>Food Cart</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="#">Add Food Cart</a></li>
                  <li><a href="#">Update Food Cart</a></li>
                  <li><a href="#">Delete Food Cart</a></li>
                  <li><a href="#">View Food Cart</a></li>
                </ul>
              </li>

            </ul>
              
              
          </li>
            
          
          <li><a class="nav-link scrollto" href="#contact">Contact</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

      <a href="#book-a-table" class="book-a-table-btn scrollto">Book a table</a>

    </div>
  </header><!-- End Header -->

  <div class="container" style="margin-top: 150px;margin-bottom: 20px;padding: 20px;height: 600px;">
    <div class="row">
        <form:form action="fetchdeletecategory" modelAttribute="category" method="post">
    <div class="form-group">
    <label for="category">Category Id</label>
    <form:input path="catId"  class="form-control"/>
    </div>
        
     <button type="submit" class="btn btn-primary">Delete Category details</button>
    </form:form>
     
    </div>
  </div>

 

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <h3>Delicious</h3>
      <p>Et aut eum quis fuga eos sunt ipsa nihil. Labore corporis magni eligendi fuga maxime saepe commodi placeat.</p>
      <div class="social-links">
        <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
        <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
        <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
        <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
        <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
      </div>
      <div class="copyright">
        &copy; Copyright <strong><span>Delicious</span></strong>. All Rights Reserved
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/delicious-free-restaurant-bootstrap-theme/ -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>