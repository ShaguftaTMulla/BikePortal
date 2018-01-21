<%@page import="dao.NewsDao"%>
<%@page import="org.jsoup.Jsoup" %>
<jsp:useBean id="News" class="dto.BikeNews"></jsp:useBean>
<jsp:setProperty property="*" name="News"/>
<%
NewsDao ndao=new NewsDao();
int i=ndao.addNews();
response.sendRedirect("News.jsp");
%>