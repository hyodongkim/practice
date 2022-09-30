<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FileUpload</title>
</head>
<body>

	<form action="uploadOk" method="post" enctype="multipart/form-data">
	    아이디 : <input type="text" name="user_id"><br />
	    암호 : <input type="text" name="user_pw"><br />
		파일 : <input type="file" name="filename"><br />
		<input type="submit" value="File Upload">
	</form>
	
	<a href="javascript:void(0);" onclick="window.open('/upload/${filename}', 'pop01', 'top=10, left=10, width=500, height=600, status=no, menubar=no, toolbar=no, resizable=no');"><img src="/upload/${filename}" wdith="20px" height="30px"></a>

</body>
</html>