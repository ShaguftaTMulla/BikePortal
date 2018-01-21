<%@page import="dto.BikeNews"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.NewsDao"%>
<%@page import="org.jsoup.Jsoup" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>News and Reviews</title>
</head>
<body>
<h1 align="center">News And Reviews</h1>

<div class="NewsDiv">
<%
NewsDao ndao=new NewsDao();
ArrayList<BikeNews> l=ndao.showNews();
for(BikeNews b:l)
{
%>
<span id="NewsHead"><%=b.getNewsHead() %>
</span>
<span id="NewsBox"><%=b.getNewsBox() %>
</span>
<a href="<%=b.getNewsRef()%>">Read More</a>
<%
}
%>
	
</div>

</body>
</html>