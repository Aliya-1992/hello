<%@page import = "org.example.crud*, java. util.*"%>

<%
int temp = PersonDao.update(Person person);
response.sendRedirect("viewusers.jsp");
%>