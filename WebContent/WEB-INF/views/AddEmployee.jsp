<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new employee</title>
</head>
<body>

	<h1>Add a new employee</h1>

	<form action="newEmployee.mvc" method="post">

		<div>
			<label>First Name: </label><input name="firstname" placeholder="Joe">
		</div>
		<div>
		<label>Surname: </label><input name="surname" placeholder="Bloggs">
		</div>
		<div>
		<label>House No: </label><input name="house_number"
			placeholder="02825767435">
		</div>
		<div>
		<label>Postcode: </label><input name="postcode" placeholder="BT42 5VP"> </div>
		<div>
			<label>National Insurance Number: </label><input
				name="national_insurance_number" placeholder="JL514198Y">
		</div>
		<div>
			<label>Salary: </label><input name="salary" placeholder="20000">
		</div>
		<div>
			<label>Department: </label><input name="department"
				placeholder="Sales">
		</div>
		<div>
			<label>Bank Account: </label><input name="bankaccount"
				placeholder="IE29AIBK93115212345654">
		</div>
		<input type="Submit">
	</form>





</body>


</html>

