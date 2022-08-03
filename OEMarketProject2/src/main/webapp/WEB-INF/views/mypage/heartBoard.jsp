<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ include file="../includes/header.jsp" %>
<section class="section" id="board_list">
   <div class="container">
      <div class="row">
         <div class="board_list_category">
            <div class="col-lg-12">
               <div class="inner-content">
                  <span><i class="fa fa-check"></i>전체보기</span>
                  <span>|</span>
                  <span>판매중</span>
                  <span>거래완료</span>
               </div>
            </div>
         </div>
      </div>
   </div>
   <div class="container">
      <div class="row">
         <div class="col-lg-6">
              <div class="section-heading">
               <h2>찜 목록</h2>
            </div>
         </div>
      </div>
   </div>
   <div class="container">
      <div class="row">
         <c:choose>
            <c:when test="${fn:length(marketList) > 0 }">
               <c:forEach items="${marketList}" var="market" varStatus="status">
                  <form action="/mypage/removeHeart" method="post">
                     <input type="hidden" name="he_bo_num" value='<c:out value="${heartList[status.index].he_bo_num}" />'>
                     <input type="hidden" name="he_id" value='<c:out value="${heartList[status.index].he_id}" />'>
                     <div class="col-lg-4">
                        <div class="item" style="width:350px;">
                           <div class="thumb">
                              <div class="hover-content">
                                 <ul>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-eye"></i></a></li>
                                    <li><button type="submit" onclick="return removeChk()" style="border:0;
                                             background-color:rgba(0,0,0,0);" ><i class="fa fa-heart"></i></button></li>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-shopping-cart" ></i></a></li>
                                 </ul>
                              </div>
                              <img src="<spring:url value='/img/${market.bo_image }'/>" width="250" height="250">
                           </div>
                           <div class="down-content">
                              <h4><c:out value="${market.bo_title}"/></h4>
                              <span><c:out value="${market.bo_price}"/></span>
                              <h5><c:out value="${market.bo_address2}"/></h5>
                              <br><br><br><br>
                           </div>
                        </div>
                     </div>
                  </form>
               </c:forEach>
            </c:when>
            <c:otherwise>
               <div align="center">찜한 상품이 존재하지 않습니다.</div>
            </c:otherwise>
         </c:choose>
      </div>
   </div>
   <br>
</section>

<script type="text/javascript">
   function removeChk() {
      if (!confirm("해당 상품을 찜 목록에서 삭제하시겠습니까?")) {
         return false;
      } else {
         alert("찜 목록에서 삭제되었습니다.");
         return true;
      }
   }
</script>

<%@ include file="../includes/footer.jsp" %>