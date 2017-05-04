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
                        <a href="/FinalProject305/manager_admin/html/index.jsp" class="active" class="waves-effect"><i class="fa fa-user fa-fw" aria-hidden="true"></i>Welcome</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/add_movie.jsp" class="waves-effect"><i class="fa fa-plus-circle fa-fw" aria-hidden="true"></i>Add Movie</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/edit_movie.jsp" class="waves-effect"><i class="fa fa-pencil-square-o fa-fw" aria-hidden="true"></i>Edit Movie</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/remove_movie.jsp" class="waves-effect"><i class="fa fa-minus-circle fa-fw" aria-hidden="true"></i>Remove Movie</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/add_employee.jsp" class="waves-effect"><i class="fa fa-plus-circle fa-fw" aria-hidden="true"></i>Add Employee</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/edit_employee.jsp" class="waves-effect"><i class="fa fa-pencil-square-o fa-fw" aria-hidden="true"></i>Edit Employee</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/remove_employee.jsp" class="waves-effect"><i class="fa fa-minus-circle fa-fw" aria-hidden="true"></i>Remove Employee</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/obtain_sales_report.jsp" class="waves-effect"><i class="fa fa-file-text fa-fw" aria-hidden="true"></i>Create Sales Report</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/create_all_movies_comprehensive_list.jsp" class="waves-effect"><i class="fa fa-database fa-fw" aria-hidden="true"></i>Comprehensive Movie List</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/create_all_movies_list_by_movie_name.jsp" class="waves-effect"><i class="fa fa-sort-alpha-asc fa-fw" aria-hidden="true"></i>Movie List by Name</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/create_all_movies_list_by_movie_type.jsp" class="waves-effect"><i class="fa fa-sitemap fa-fw" aria-hidden="true"></i>Movie List by Type</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/create_all_movies_list_by_customer_name.jsp" class="waves-effect"><i class="fa fa-users fa-fw" aria-hidden="true"></i>Movie List by Customer Name</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/most_oversaw_transaction_employee.jsp" class="waves-effect"><i class="fa fa-star fa-fw" aria-hidden="true"></i>Most Transaction Oversawed Customer Representative</a>
                    </li>
                    <li>
                        <a href="/FinalProject305/manager_admin/html/most_active_customer_list.jsp" class="waves-effect"><i class="fa fa-user fa-fw" aria-hidden="true"></i>Most Active Customers</a>
                    </li>
                     <li>
                        <a href="/FinalProject305/manager_admin/html/most_rented_movie_list.jsp" class="waves-effect"><i class="fa fa-line-chart fa-fw" aria-hidden="true"></i>Most Rented Movies</a>
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
                        <h4 class="page-title">Profile</h4> </div>
                </div>
                <!-- /.row -->
                <!-- .row -->
                <div class="row">
                    <div class="col-md-4 col-xs-12">
                        <div class="white-box">
                            <div class="user-bg"> 
                                <div class="overlay-box">
                                    <div class="user-content">
                                        <a href="javascript:void(0)">
                                        <img src="${pageContext.request.contextPath}/plugins/images/users/user_icon.png" class="thumb-lg img-circle" alt="img"></a>
                                        <%-- <h4 class="text-white">${employee.id}</h4> --%>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8 col-xs-12">
                        <div class="white-box">
                            <form class="form-horizontal form-material">
                                <div class="form-group">
                                    <label class="col-md-12">Full Name</label>
                                    <div class="col-md-12">
                                        <label id="fullname" class="form-control form-control-line information" >${employee.firstName} ${employee.lastName}</label></div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Start Date</label>
                                    <div class="col-md-12">
                                        <label id="startdate" class="form-control form-control-line information" >${employee.startDate}</label></div>
                                </div> 
                                <div class="form-group">
                                    <label class="col-md-12">Hourly Rate</label>
                                    <div class="col-md-12">
                                        <label id="hrate" class="form-control form-control-line information" >${employee.hourlyRate}</label></div>
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
