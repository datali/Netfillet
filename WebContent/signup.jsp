
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Customer Sign Up</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<link href="css/signup-style.css" rel='stylesheet' type='text/css' />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<section>
				<h1 class="entry-title">
					<span>Sign Up</span>
				</h1>
				<div>
					<span class="text-muted"> Already have an account? <a
						href="/FinalProject305/index.jsp">Login</a>.
					</span>
				</div>				

				<form action="/FinalProject305/SignUpServlet"
					class="form-horizontal" method="post" >
					<div class="form-group">
						<label class="control-label col-sm-3">SSN<span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<input type="text" class="form-control" name="ssn"
								placeholder="Enter your SSN" >
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Email<span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-envelope"></i></span> <input type="email"
									class="form-control" name="email"
									placeholder="Enter your Email">
							</div>
							
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">First Name <span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<input type="text" class="form-control" name="fname"
								placeholder="Enter your Fisrt Name" >
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Last Name <span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<input type="text" class="form-control" name="lname"
								placeholder="Enter your Last Name">
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="control-label col-sm-3" for="textinput">Address<span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<input type="text" placeholder="Address" name="address"
								class="form-control">
						</div>
					</div>



					<!-- Text input-->
					<div class="form-group">
						<label class="control-label col-sm-3" for="textinput">City<span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<input type="text" placeholder="City" name="city"
								class="form-control">
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group" id="state">
						<label class="control-label col-sm-2" for="textinput">State<span
							class="text-danger">*</span></label>
						<div class="col-sm-4">
							<input type="text" placeholder="State" name="state"
								class="form-control">
						</div>

						<label class="control-label col-sm-2" for="textinput">Zip
							Code<span class="text-danger">*</span>
						</label>
						<div class="col-sm-4">
							<input type="text" placeholder="Zip Code" name="zipcode"
								class="form-control">
						</div>
					</div>

					
					<div class="form-group">
						<label class="control-label col-sm-3">Contact No.<span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-phone"></i></span> <input type="text"
									class="form-control" name="phone"
									placeholder="Enter your Phone Number">
							</div>
							
						</div>
					</div>

					
					<div class="form-group">
			          <label class="control-label col-sm-3">Plan <span class="text-danger">*</span></label>
			          <div class="col-md-8 col-sm-9">
			            <label><input name="plan" type="radio" value="Limited" checked> Limited - $ 10 </label>
			            <label><input name="plan" type="radio" value="UnLimited1" > UnLimited1 - $ 15 </label>
			            <label><input name="plan" type="radio" value="UnLimited2" > UnLimited2 - $ 20 </label>
			            <label><input name="plan" type="radio" value="UnLimited3" > UnLimited3 - $ 25 </label>
			          </div>
			        </div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="control-label col-sm-3" for="textinput">Credit Card No.<span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<input type="text" placeholder="Debit/Credit card no." name="creditcard"
								class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-xs-offset-3 col-xs-10">
							<input name="Submit" type="submit" value="Sign Up"
								class="btn btn-primary">
						</div>
					</div>
				</form>
			</div>




		</div>
	</div>
	</div>
</body>
</html>