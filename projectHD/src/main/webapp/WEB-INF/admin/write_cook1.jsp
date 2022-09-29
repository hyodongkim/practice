<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>삽입</title>
</head>
<body>
	<form action="<c:url value="/addCook"/>" method="get" enctype="multipart/form-data">
		
		<table width="500">
	
		<tr>
			<th>요리</th>
			<td><input type="text" rows="16" cols="95" name="cook_Title" value="${cook_Title}"> </td>
		</tr>
		<tr>
			<th>창업자</th>
			<td><input type="text" rows="16" cols="95" name="cook_Writer" value="${cook_Writer}"> </td>
		</tr>
		
		
		<tr>
			<th>맛집이름</th>
			<td><input type="text" rows="16" cols="95" name="cook_Company" value="${cook_Company}"> </td>
		</tr>
		
		<tr>
			<td>이미지</td>
			<td><input type="file" rows="16" cols="95" name="cook_Image" value="${cook_Image}"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="16" cols="95" name="cook_Content" value="${cook_Content}"></textarea> </td>
		</tr>
		<tr>
			<td>소개</td>
			<td><textarea rows="16" cols="95" name="cook_Introduce" value="${cook_Introduce}"></textarea> </td>
		</tr>
		
		<tr>
			<td>분류</td>
			<td><input type="text" rows="16" cols="95" name="cook_Category" value="${cook_Category}"> </td>
		</tr>
		<tr>
			<td colspan="2"> 

				<a href="/admin/cookManage"><input type="submit" value="삽입"></a> 
			</td>
		</tr>
		
		</table>
	
	
	</form>
	
	
</body>
</html>