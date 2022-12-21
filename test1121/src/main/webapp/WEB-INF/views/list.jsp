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
<form action="/list">

<select id="searchType" name="searchType">
	<option value="board_subject" >제목</option>
	<option value="board_writer">작성자</option>
	<option value="board_content">내용</option>	
</select>
<input type="text" placeholder="검색어 입력" id="search" name="search">
<button type="submit">검색</button>

</form>


<hr>

<table>
	<tr>
		<td>글번호</td>
		<td>글제목</td>
		<td>작성자</td>
		<td>조회수</td>
	</tr>

		<c:forEach var="row" items="${board}">
	<tr>
		<td><a href="detail/${row.board_seq}">${row.board_seq}</a></td>
		<td>${row.board_subject}</td>
		<td>${row.board_writer}</td>
		<td>${row.board_hits}</td>
	</tr>
	</c:forEach>
</table>

<div>
	<c:if test="${pagingVO.currentRange ne 1 }">
		<a href="#" onclick="fn_paging(1)">[처음]</a>
	</c:if>
	<c:if test="${pagingVO.currentRange ne 1 }">
		<a href="#" onclick="fn_paging('${pagingVO.prevPage}')">[이전]</a>
	</c:if>
	<c:forEach var="pageNum" begin="${pagingVO.beginPage }" end="${pagingVO.endPage }">
		<c:choose>
			<c:when test="${pageNum eq pagingVO.currentPage && search eq null}">
				<span><a href="#" onclick="fn_paging('${pageNum}')">${pageNum }</a></span>
			</c:when>
			<c:when test="${pageNum eq pagingVO.currentPage && search ne null}">
				<span><a href="#" onclick="fn_paging('${pageNum}')">${pageNum }</a></span>
			</c:when>
			<c:otherwise>
				<a href="#" onclick="fn_paging('${pageNum}')">${pageNum }</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:if test="${pagingVO.currentPage ne pagingVO.totalPage && pagingVO.totalPage > 0 }">
		<a href="#" onclick="fn_paging('${pagingVO.nextPage}')">[다음]</a>
	</c:if>
	<c:if test="${pagingVO.currentRange ne pagingVO.totalRange && pagingVO.totalRange > 0 }">
		<a href="#" onclick="fn_paging('${pagingVO.totalPage}')">[끝]</a>
	</c:if>
</div>

<div>
	총 게시글 수 : ${pagingVO.totalCount } / 총 페이지 수 : ${pagingVO.totalPage } 
	/ 현재 페이지 : ${pagingVO.currentPage } / 현재 블럭 : ${pagingVO.currentRange }
	/ 총 블럭 수 : ${pagingVO.totalRange }
</div>


<button type="button" onclick="location.href='new';">글쓰기</button>


</body>
<script>
function fn_paging(currentPage) {
	let search = '${search}';
	let searchType = '${searchType}';
	location.href = "/list?currentPage=" + currentPage + "&search=" + search + "&searchType=" + searchType;
	}

</script>
</html>