<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="/bootstrap/dist/css/bootstrap.min.css" />" rel="stylesheet">
    <!-- Menu CSS -->
    <link href="<c:url value="/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" />" rel="stylesheet">
    <!-- toast CSS -->
    <link href="<c:url value="/plugins/bower_components/toast-master/css/jquery.toast.css" />" rel="stylesheet">
    
    <!-- morris CSS -->
    <link href="<c:url value="/plugins/bower_components/morrisjs/morris.css" />" rel="stylesheet">
        
    <!-- chartist CSS -->
    <link href="<c:url value="/plugins/bower_components/chartist-js/dist/chartist.min.css" />" rel="stylesheet">
    <link href="<c:url value="/plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css" />" rel="stylesheet">
    <!-- animation CSS -->
    <link href="<c:url value="/css/animate.css" />" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="<c:url value="/css/yan.css" />" rel="stylesheet">
    <!-- color CSS -->
    <link href="<c:url value="/css/default.css" />" rel="stylesheet">
    
    
<![endif]-->
</head>

<body class="fix-header">
    <!-- ============================================================== -->
    <!-- Wrapper -->
    <!-- ============================================================== -->
    <div id="wrapper">
        
        <!-- ============================================================== -->
        <!-- Left Sidebar - style you can find in sidebar.scss  -->
        <!-- ============================================================== -->
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav slimscrollsidebar">
                <div class="sidebar-head">
                    <h3><span class="fa-fw open-close"><i class="ti-close ti-menu"></i></span> <span class="hide-menu">Admin</span></h3>
                </div>
                <ul class="nav" id="side-menu">
                    <li style="padding: 70px 0 0;">
                        <a href="/FinalProject305/employee_admin/html/index.jsp" class="waves-effect"><i class="fa fa-user fa-fw" aria-hidden="true"></i>Welcome</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/employee_admin/html/record_an_order.jsp" class="waves-effect"><i class="fa fa-circle-thin fa-fw" aria-hidden="true"></i>Record an order</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/employee_admin/html/add_customer.jsp" class="waves-effect"><i class="fa fa-plus-circle fa-fw" aria-hidden="true"></i>Add customer</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/employee_admin/html/edit_customer.jsp" class="active" class="waves-effect"><i class="fa fa-pencil-square-o fa-fw" aria-hidden="true"></i>Edit customer</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/employee_admin/html/remove_customer.jsp" class="waves-effect"><i class="fa fa-minus-circle fa-fw" aria-hidden="true"></i>Remove customer</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/employee_admin/html/create_customer_mailinglist.jsp" class="waves-effect"><i class="fa fa-list fa-fw" aria-hidden="true"></i>Create customer list</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/employee_admin/html/create_movie_suggestion_list.jsp" class="waves-effect"><i class="fa fa-list fa-fw" aria-hidden="true"></i>Create movie suggestion</a>
                    </li>

                </ul>
            </div>
            
        </div>
        <!-- ============================================================== -->
        <!-- End Left Sidebar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title">Edit Customer</h4> </div>
                </div>
                <!-- /.row -->
                <!-- .row -->
                <div class="row">
                    <div class="col-md-8 col-xs-12">
                        <div class="white-box">
                            <form action="/FinalProject305/EmployeeEditCustServletCompare" role="form" class="form-horizontal form-material" method="POST">
                                <div class="form-group">
                                    <label class="col-md-12">Customer ID</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="customerID" value = "${sessionScope.Customer.id}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Email</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="email" placeholder = "${sessionScope.Customer.email}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Rating</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="rating" placeholder = "${sessionScope.Customer.rating}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Credit Card Number</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="creditCardNumber" placeholder = "${sessionScope.Customer.creditCardNum}"> </div>
                                </div>
              
                                <div class="form-group">
                                    <label class="col-md-12">First Name</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="firstname" placeholder = "${sessionScope.Customer.firstName}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Last Name</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="lastname" placeholder = "${sessionScope.Customer.lastName}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Address</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="address" placeholder = "${sessionScope.Customer.address}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">City</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="city" placeholder= "${sessionScope.Customer.city}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">State</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="state" placeholder = "${sessionScope.Customer.state}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Zip Code</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="zipcode" placeholder = "${sessionScope.Customer.zipCode}"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Phone Number</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="phonenum" placeholder = "${sessionScope.Customer.phoneNumber}" ></div>
                                </div>
                                
                             	<div class="form-group">
                                    <div class="col-sm-12">
                                        <input type="submit" value="Edit Customer" class="btn btn-success">
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
            <footer class="footer text-center"> 2017 &copy; NETFLIX </footer>
        </div>
    </div>
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
    <!-- All Jquery -->
    <!-- ============================================================== -->
    <script src="../plugins/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- Menu Plugin JavaScript -->
    <script src="../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
    <!--slimscroll JavaScript -->
    <script src="js/jquery.slimscroll.js"></script>
    <!--Wave Effects -->
    <script src="js/waves.js"></script>
    <!--Counter js -->
    <script src="../plugins/bower_components/waypoints/lib/jquery.waypoints.js"></script>
    <script src="../plugins/bower_components/counterup/jquery.counterup.min.js"></script>
    <!-- chartist chart -->
    <script src="../plugins/bower_components/chartist-js/dist/chartist.min.js"></script>
    <script src="../plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js"></script>
    <!-- Sparkline chart JavaScript -->
    <script src="../plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="js/custom.min.js"></script>
    <script src="js/dashboard1.js"></script>
</body>

</html>
