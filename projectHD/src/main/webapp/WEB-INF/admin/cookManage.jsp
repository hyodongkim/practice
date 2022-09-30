<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>회원 목록</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        *{
            margin: 0; padding: 0;
        }
        #wrap{
            position: absolute;
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: row;
            align-content: flex-start;
        }
        a img{
            height: 150px;
            width: 150px;
        }
        #logo{
            height: 150px;
        }
        nav{
            width: 150px;
            height: 100%;
            display: flex;
            flex-direction:column;
            justify-content: space-between;
        }
        #nav1{
            display: flex;
            flex-direction: column;
            height: 400px;
            width: 150px;
            list-style-type: none;
        }
        #nav2{
            display: flex;
            flex-direction: column;
            height: 100px;
            width: 150px;
            list-style-type: none;
        }
        ul li{
            display: flex;
            width: 150px;
            height: 50px;
            align-items: center;
            cursor: pointer;
            border: black 1px solid;
        }
        li a{
            text-decoration: none;
            font-size: 16pt;
            color: black;
        }
    </style>
    <script type="text/javascript">
        function writeForm(){
            location.href="BoardWriteForm.bo";
        }
    </script>
</head>
<body>
    <div id="wrap">
        <nav>
            <ul id="nav1">
                
            </ul>
            <ul id="nav2">
                
            </ul>
        </nav>
        <table class="table table-hover">
            <Thead>
                <tr>
                    <th>번호</th>
                    <th>요리</th>
                    <th>창업자</th>
                    <th>맛집이름</th>
                    <th>이미지</th>
                    <th>내용</th>
                    <th>소개</th>
                    <th>분류</th>
               
                </tr>
            </Thead>
            <c:forEach var="cook" items="${cookList}" varStatus="index">
                <tr>
                    <td>${cook.cook_Index}</td>
                    <td>${cook.cook_Title}</td>
                    <td>${cook.cook_Writer}</td>
                    <td>${cook.cook_Company}</td>                  
                    <td>${cook.cook_Image}<a href="javascript:void(0);" onclick="window.open('/upload/${cook.cook_Image}', 'pop01', 'top=10, left=10, width=500, height=600, status=no, menubar=no, toolbar=no, resizable=no');"><img src="/upload/${cook.cook_Image}" wdith="20px" height="30px"></a></td>
                    <td>${cook.cook_Content}</td>
                    <td>${cook.cook_Introduce}</td>
                    <td>${cook.cook_Category}</td>
                    
                    
                    
                    <td>
                    	<a href="/admin/write_cook?cook_Index=${cook.cook_Index}">갱신</a>
                   		<a href="/admin/write_cook1?cook_Index=${cook.cook_Index}">삽입</a>
                        <a href="/admin/write_cook2?cook_Index=${cook.cook_Index}">삭제</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>