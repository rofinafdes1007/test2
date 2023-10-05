<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
<style type="text/css">
body
{
background-image: https://unsplash.com/photos/PDxYfXVlK2M
}
h2{
color: black;
background-color:green;
text-align: center; 

}
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
background-color:aqua;
padding:auto;
margin:auto;
border:1px;

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
&nbsp;&nbsp;&nbsp; <a href="getData" target="_self">PLACE ORDER</a> &nbsp;&nbsp;&nbsp;<a href="/PendingOrder.jsp" target="_self">PENDING ORDERS(DEALER)</a> &nbsp;&nbsp;&nbsp; <a href="/AssignAdmin.jsp" target="_self">ASSIGN ORDERS(ADMIN)</a>
&nbsp;&nbsp;&nbsp; <a href="/TrackOrder.jsp" target="_self">TRACK ORDER(DEALER)</a>



</table>


</nav>
<body>

    
<br>
<br>
<br>
<br>
<br>


<table  style="float:left;">
<tr>
<th>Admin Login</th><br><br>
</tr>
<tr>
<td>
<form action="validateAdmin">
UserName:  <input type="text" name="uname"><br><br>
Password:  <input type="text" name="pwd"><br><br>
<input type="submit" class="fadeIn fourth" value="login">


</form>
</td>
</tr>
<tr>
</table>
<table style="float:left;">
<tr>
<th>Dealer login</th>
</tr>
<tr>
<td>
<form >
UserName:  <input type="text" name="uname"><br><br>
Password:  <input type="text" name="pwd"><br><br>
<input type="submit" class="fadeIn fourth" value="login">
</form>
</td>
</tr>
<tr>
</table>
<table style="float:left;">
<tr>
<th>Customer login</th>
</tr>
<tr>
<td>
<form action="" method="post">
UserName:  <input type="text" name="uname"><br><br>
Password:  <input type="text" name="pwd"><br><br>
<input type="submit"  class="fadeIn fourth" value="login">
</form>
</td>
</tr>
<tr>


</table>

<footer>
<p>Designed by :Rofina Fernandes</p>
</footer>
 
 
 
</body>
</html>