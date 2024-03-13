<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>View users</title>
</head>
<body>

<h1>Persons list</h1>
<%
ArrayList<org.example.crud.Person> arrayList = PersonDao.getAllPersons();
request.setAttribute("arrayList", arrayList);
%>
<table>
 <tr>
  <td>Id:</td>
 <td>Name:</td>
 <td>Password:</td>
 <td>Email:</td>
 <td>Country:</td>
</tr>
<tr>
<c: forEach items="${arrayList}" var person>
</c:forEach>
</table>
</body>
</html>