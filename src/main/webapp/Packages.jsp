<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Travel Packages</title>
</head>

<body>

<h2>Available Travel Packages</h2>

<table border="1">

<tr>
<th>Package ID</th>
<th>Destination</th>
<th>Price</th>
<th>Duration</th>
<th>Action</th>
</tr>

<tr>
<td>1</td>
<td>Goa</td>
<td>5000</td>
<td>3 Days</td>
<td><a href="book?id=1">Book</a></td>
</tr>

<tr>
<td>2</td>
<td>Manali</td>
<td>8000</td>
<td>5 Days</td>
<td><a href="book?id=2">Book</a></td>
</tr>

<tr>
<td>3</td>
<td>Kerala</td>
<td>7000</td>
<td>4 Days</td>
<td><a href="book?id=3">Book</a></td>
</tr>

</table>

<br>

<a href="bookingHistory.jsp">View Booking History</a>

</body>
</html>