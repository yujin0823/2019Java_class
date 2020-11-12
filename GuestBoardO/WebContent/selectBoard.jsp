<%@page import="java.util.ArrayList"%>
<%@page import="board.BoardVO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp"%>
	<%-- <%
		// 공유된 자료를 가져올 때 타입 중요 - 파라미터 : 오브젝트 getAttribute("list");
		// 그래서 ArrayList로 형변환!! 중요
		ArrayList<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("list");
		for (int i = 0; i < list.size(); i++) {
			BoardVO vo = list.get(i);
	--%>
	<%-- 
			<hr style="border:4 solid">
			<%=vo.getBoardNum() %>번째 글  &nbsp;&nbsp;&nbsp;작성날짜 : <%=vo.getWriteDate() %> <br>
			작성자 : <%=vo.getName() %> <br>
			제목 : <%=vo.getTitle() %> <br>
			내용 : <%=vo.getContent() %> <br>
			<a href="updateForm.jsp?boardNum=<%=vo.getBoardNum() %>">글 수정</a>&nbsp;
			<a href="#">글 삭제</a>
	<%		
		}
	%> --%>
	
	<br><br>
	<c:forEach var="board" items="${list}">
	${board.boardNum} 번째 글 &nbsp;&nbsp;&nbsp; 작성날짜 : ${board.writeDate}<br>
	작성자 : ${board.name} <br> 
	제목 : ${board.title}<br>
	내용 : ${board.content}<br>
	<hr style="border:solid 2px">
	</c:forEach>
<jsp:include page="footer.jsp"/>