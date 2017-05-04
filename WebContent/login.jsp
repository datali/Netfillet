<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<link href="css/signup-style.css" rel='stylesheet' type='text/css' />
</head>
<body>
<div class="container">
	<div class="row">
    <div class="col-md-8">
      <section>      
        <h1 class="entry-title"><span>LogIn</span> </h1>
        <hr>
            <form action="/FinalProject305/LoginServlet" class="form-horizontal" method="post" name="signup" id="signup" enctype="multipart/form-data" >        
        
        <div class="form-group" style="padding-top: 100px">
          <label class="control-label col-sm-3">Account Id </label>
          <div class="col-md-8 col-sm-9">
            <input type="text" class="form-control" name="id" id="id">
          </div>
        </div>
       
        <div class="form-group" >
          <div class="col-xs-offset-3 col-xs-10">
            <input name="Submit" type="submit" value="Login" class="btn btn-primary">
          </div>
          <div class="col-xs-offset-3 col-md-8 col-sm-9"><span class="text-muted"> Don't have an account? <a href="/FinalProject305/signup.jsp">Sign Up</a>.</span> </div>
          
        </div>
        
      </form>
    </div>
</div>
</div>
</body>
</html>