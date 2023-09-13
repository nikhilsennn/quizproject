<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@  page import="com.DB.Qbank" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddQuestions</title>
</head>
<body>
	<form  method="post">
		<lebel>Question ID </lebel>
		<input type="text" name="qid"><br>
		<br>
		<lebel>Question </lebel>
		<textarea rows="2" cols="20" name="ques"></textarea>
		<br>
		<br>
		<lebel>Option A </lebel>
		<input type="text" name="opA"><br>
		<br>
		<lebel>Option B </lebel>
		<input type="text" name="opB"><br>
		<br>
		<lebel>Answer </lebel>
		<input type="text" name="ans"><br>
		<br>
		<input type="submit" value="Add Question">
		
		<%
		 String qid=request.getParameter("qid");	
		 String ques=request.getParameter("ques");
		 String opA=request.getParameter("opA");
		 String opB=request.getParameter("opB");
		 String ans=request.getParameter("ans");
		 Qbank.add(qid, ques, opA, opB, ans); 
		 
		 %>
	</form>
</body>
</html>