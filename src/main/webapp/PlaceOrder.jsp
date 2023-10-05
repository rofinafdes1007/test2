<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
footer{
position:absolute;
bottom:0;
right:0;
z-index:10;
background-color:gray


}

td,th
{
border-style:solid;
border-color:#96D4D4;
}
table{
border:2px;

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
<table>
<tr>

<th>PLACE AN ORDER</th>
<tr>
<td>
<form action="placeOrder" method="post">

ProductName:<input type="text" name="prodName"><br><br>

Quantity: <input type="number" name="Quantity"><br><br>
Delivery Address: <input type="text" name="deliveryAddress"><br><br>
<input type="submit" value="submit">

</form>
</td>
</tr>
</table>
</div>
<footer>
<p>Designed by :Rofina Fernandes</p>
</footer>
</body>
</html>