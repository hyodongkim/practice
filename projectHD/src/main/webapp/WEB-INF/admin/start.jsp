<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>관리자 로그인</title>
    <style>
        *{
            margin: 0;padding: 0;
        }
        #wrap{
            position: absolute;
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            align-items:center;
        }
        header{
            padding-top: 10px;
        }
        h1{
            padding: 20px;
        }
        #login{
            display: flex;
            position:relative;
            border: solid black 1px;
            width:300px;
            height:200px;
            flex-direction: column;
            align-items: center;
            margin: 10px;
        }
        img{
            width: 80px;
            height: 80px;
        }
        input[type=text]{
            text-align:center;
            position:relative;
            display: flex;
            flex-direction : row;
            justify-content : space-between;
            width :250px;
            height : 30px;
            border-radius:2px;
        }
        input[type=password]{
            text-align:center;
            position:relative;
            display: flex;
            flex-direction : row;
            justify-content : space-between;
            width :250px;
            height : 30px;
            border-radius:2px;
        }
        input[type=submit]{
            position:relative;
            width:250px;
            height: 30px;
            margin-bottom:10px;
            border-radius:8px;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <header>
            <a href="/admin/views/admin"><img src="/img/logo.png" alt="로고"></a>
        </header>
        <h1>관리자페이지 로그인</h1>
        <div id="login">
            <form method="get" action="/adminLogin">
                <label>ID<input type="text" name="hp_ID"></label>
                <label>Password<input type="text" name="hp_Password"></label>
                </br>
                <input type="submit" value="로그인">
            </form>
        </div>
    </div>
</body>aa
</html>