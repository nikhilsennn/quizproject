<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.project.admin.Qbank" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Page</title>
</head>
<body>
<h1>Start Test</h1>
    <%!
    int q=1;
    String qid="";
    String ques="";
    String opA="";
    String opB="";
    String ans="";
    ArrayList al;
    %>
    <%
  
    	ArrayList al = Qbank.fetchDb(q);

    for (Object o : al) {
    	String row = o.toString();
    	String[] qa = row.split(":");
    	qid = qa[0];
    	ques = qa[1];
    	opA = qa[2];
    	opB = qa[3];
    	ans = qa[4];
    	q++;
    }
    %> 
    <h1>Q.<%=qid%></h1><br>
    <h2><%=ques%></h2><br>
    A :<input type="radio"><%=opA %><br>
    B :<input type="radio"><%=opB %><br>
    <input type="button" onclick="Qbank.fetchDb(q)" value="next">
</body>
</html>