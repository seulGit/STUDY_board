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

<form action="/edit/${board.board_seq}" method="post">
글번호
<input type="text" id="board_seq" name="board_seq" value="${board.board_seq}" readonly><br>
글제목
<input type="text" id="board_subject" name="board_subject" value="${board.board_subject}"><br>
작성자
<input type="text" id="board_writer" name="board_writer" value="${board.board_writer}"><br>
글내용
<textarea cols="30" rows="10" id="board_content" name="board_content">${board.board_content}</textarea><br>


<button type="submit">저장</button>
<button type="button" onclick="location.href='/list';">목록으로</button>

</form>

</body>
</html>