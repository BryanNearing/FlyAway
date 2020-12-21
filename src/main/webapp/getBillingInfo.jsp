<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Billing Info</title>
</head>
<body>

<h1>Enter Billing Information</h1>
<form action="TakeInBillingInfo" method="post">
<table>


<tbody>
<tr><td>Credit Card Number:</td><td><input type="number" name="ccNum"></td></tr>
<tr><td>Expiration:</td><td><input type="month" name="exp"></td></tr>
<tr><td>CVC:</td><td><input type="number" name="cvc"></td></tr>
</tbody>
</table>
<input type="submit" value="Submit">
</form>

</body>
</html>