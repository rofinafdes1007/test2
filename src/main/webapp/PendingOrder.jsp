<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
footer { 
    position: absolute; 
    bottom: 0; 
    right: 0; 
    z-index:10;
    background-color: gray;
}
table, td, th {
  border: 1px solid black;
}

table {
  border-collapse: collapse;
  width: 100%;
}

td {
  height: 50px;
  vertical-align: bottom;
}

/* td
{
height:50px;
vertical-allign:botttom;
} */ */
</style>
</head>
<nav>
<table>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <h2>SUPPLY CHAIN MANAGEMENT SYSTEM </h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<tr><a href="">Home</a> &nbsp;&nbsp;&nbsp; <a href="/dealer.jsp" target="_self">REGISTER AS DEALER</a> &nbsp;&nbsp; &nbsp; <a href="/customer.jsp" target="_self">REGISTER AS CUSTOMER</a>
&nbsp;&nbsp;&nbsp; <a href="/PlaceOrder.jsp" target="_self">PLACE ORDER</a> &nbsp;&nbsp;&nbsp;<a href="/PendingOrder.jsp" target="_self">PENDING ORDERS(DEALER)</a> &nbsp;&nbsp;&nbsp; <a href="/AssignAdmin.jsp" target="_self">ASSIGN ORDERS(ADMIN)</a>
&nbsp;&nbsp;&nbsp; <a href="/TrackOrder.jsp" target="_self">TRACK ORDER(DEALER)</a>



</table>


</nav>
<body>
<h4 align="center">List of Pending Orders(For Dealer)</h4><br><br>
<table align="center" ,border="1">
<tr>
<th>Sr No</th><th>Date</th><th>Customer Details</th><th>Product Order</th><th>Quantity</th><th>Delivery Address</th>
<th>Accept Order?</th><th>Date Assigned</th>
</tr>
</table>

<footer>
<p>Designed by :Rofina Fernandes</p>
</footer>
</body>
</html>