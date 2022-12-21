<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/new" method="post">
<label for="board_subject">글제목</label>
<input type="text" id="board_subject" name="board_subject" value=""><br>
<label for="board_writer">작성자</label> 
<input type="text" id="board_writer" name="board_writer" value=""><br>
<label for="board_content">글내용</label> 
<textarea cols="30" rows="10" id="board_content" name="board_content"></textarea><br>



<button type="submit">등록</button>
<button type="button" onclick="location.href='new';">취소</button>
<button type="button" onclick="location.href='list';">목록으로</button>

</form>

</body>
</html>