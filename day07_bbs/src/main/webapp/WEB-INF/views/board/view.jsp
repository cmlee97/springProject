<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<jsp:include page="../inc/header.jsp"/>

<div class="container d-flex mt-5 justify-content-center">
   <div class="w-75 shadow p-5 rounded border">
   
   	  
      <h3>글상세보기</h3>
      <div class="form-group">
         <label for="subject">번호</label>
         <input type="text" class="form-control" id="bid" 
            name="bid" value="${dto.bid}" disabled/>
      </div>

      <div class="form-group">
         <label for="subject">제목</label>
         <input type="text" class="form-control" id="subject" 
            name="subject" value = "${dto.subject}" disabled/>
      </div>

      <div class="form-group">
         <label for="contents">내용</label>
         <textarea class="form-control" id="contents" 
            name="contents" rows="4" disabled>${dto.contents}</textarea>
      </div>
      <div class="form-group">
         <label for="writer">글쓴이</label>
         <input type="text" class="form-control" id="writer" 
            name="writer" value = "${dto.writer}" disabled/>
      </div>
      <div class="form-group mt-4">
         <button type="submit" id="btn-modify" class="btn btn-primary me-2">수정하기</button>
         <button type="button" id="btn-list" class="btn btn-primary">리스트</button>
      </div>
   </div>
</div>
<script>
	$("#btn-list").click(()=>{
		location.href="<c:url value='list.do?viewPage=${pDto.viewPage}'/>";
	});
	$("#btn-modify").click(()=>{
		location.href="<c:url value='modify.do?bid=${dto.bid}'/>";
	});
</script>
<jsp:include page="../inc/footer.jsp"/>