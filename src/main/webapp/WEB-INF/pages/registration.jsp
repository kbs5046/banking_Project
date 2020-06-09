<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height: 30px;background-color: #2196f3; color: White; text-align:center"> 
	* represents required field</header>
<div class="container"> 
	<br/>   
  	<img src="/img/bank.png" style="height: 120px; width:160px;">
  	<br/>

  	<hr/>	
  	<h3>Personal Information</h3>
  	 
  		 <form action="registerCustomer"  method="post">
	  		  <b>First name *</b>
	  		   <input type="text"  name="first_name"  class="form-control"  required="required" style="width: 50%;" placeholder = "First Name">
	  		   
	  		   <b>Last name *</b>
	  		   <input type="text"  name="last_name"  class="form-control"  required="required" style="width: 50%;" placeholder ="Last Name">
	  		   
	  		  <b>Email *</b>
	  		   <input type="text"  name="email_id"  class="form-control"  required="required" style="width: 50%;" placeholder ="Email ID">
	  		   
	  		   <b>Mobile Number *</b>
	  		   <input type="text"  name="mobile_number"  class="form-control"  required="required" style="width: 50%;" placeholder ="Mobile Number">
	  		   
	  		   <b>Date of Birth *</b>
	  		   <input type="text"  name="string_dob"  class="form-control"  required="required" style="width: 50%;" placeholder ="dd/mm/yyyy">
	  		   
	  		   <b>Aadhar Id</b>
	  		   <input type="text"  name="aadhar_id"  class="form-control"  style="width: 50%;" placeholder ="Aadhar Id">
	  		   
	  		   <b>PAN</b>
	  		   <input type="text"  name="pan"  class="form-control"  style="width: 50%;" placeholder ="Pan">
	  		   
	  		   <h3>Sign Up Details</h3>
	  		   
	  		  <b>Username *</b>
	  		   <input type="text"  name="username"  class="form-control"  required="required" style="width: 50%;" placeholder="Username">
	  		   
	  		  
				    <div class="form-group">
				        <label class="col-sm-3 control-label">Password *</label>
				        <div class="col-sm-5">
				            <input type="password" class="form-control" name="password" placeholder="Password" />
				        </div>
				    </div>
				
				    <div class="form-group">
				        <label class="col-sm-3 control-label">Confirm password *</label>
				        <div class="col-sm-5">
				            <input type="password" class="form-control" placeholder="Confirm Password" />
				        </div>
				    </div>
			<h3>Address Details</h3>
	  		   
	  		  <b>Address Line 1 *</b>
	  		  <input type="text"  name="add_line1"  class="form-control"  required="required" style="width: 50%;" placeholder="Address Line 1">
	  		  <b>Address Line 2 *</b>
	  		  <input type="text"  name="add_line2"  class="form-control"  required="required" style="width: 50%;" placeholder="Address Line 2">
	  		  <b>City *</b>
	  		  <input type="text"  name="city"  class="form-control"  required="required" style="width: 50%;" placeholder="City">
	  		  <b>State *</b>
	  		  <input type="text"  name="state"  class="form-control"  required="required" style="width: 50%;" placeholder="State">
	  		  <b>Pin Code *</b>
	  		  <input type="text"  name="add_line1"  class="form-control"  required="required" style="width: 50%;" placeholder="Pin">
	  		   
	  		 
	  		    <br/>
	  		   <button type="submit" class="btn btn-primary">Submit</button>
	  		   <a href="/registration">
	  		   	<button type="button" class="btn btn-danger" >Reset</button>
	  		   </a>
  		 </form>
</div>
</body>
</html>