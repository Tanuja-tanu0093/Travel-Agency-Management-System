<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.travel.dto.Booking"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking History</title>
</head>

<body>

<h2>Your Booking History</h2>

<table border="1">

<tr>
<th>Booking ID</th>
<th>Package ID</th>
<th>Status</th>
<th>Action</th>
</tr>

<%
List<Booking> bookings = (List<Booking>) request.getAttribute("bookingList");

if(bookings != null){
    for(Booking booking : bookings){
%>

<tr>
<td><%= booking.getId() %></td>
<td><%= booking.getPackageId() %></td>
<td><%= booking.getStatus() %></td>
<td>
<a href="cancel?id=<%= booking.getId() %>">Cancel</a>
</td>
</tr>

<%
    }
}
%>

</table>

<br>

<a href="packages.jsp">Back to Packages</a>

</body>
</html>