<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ include file="../includes/header.jsp" %>

    
    <!-- BoardList -->
    <section class="section" id="board_list">
        <div class="container">
            <div class="row">
                <div class="board_list_category">
                    <div class="col-lg-12">
                        <div class="inner-content">
                            <span><i class="fa fa-check"></i> 인기 상품 순</span>
                            <span>|</span>
                            <span>최신 등록 순</span>
                            <span>낮은 가격 순</span>
                            <span>높은 가격 순</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="section-heading">
                        <h2>인기 상품 순</h2>
                    </div>
                </div>
                <div class="col-lg-6 plus">
                    <a href="boardInsert.do" class="plus-button"><i class="fa fa-plus"></i>&nbsp;&nbsp; 새 글</a>
                </div>
            </div>
        </div>

		
        <div class="container">
            <div class="row">
                
                
                <!-- 인기 게시글 -->
                <c:forEach items="${mb_list}" var="mb_board">
                <div class="col-lg-4">
                    <div class="item">
                        <div class="thumb">
                            <div class="hover-content">
                                <ul>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-eye"></i></a></li>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                        	    
                            <img src="<spring:url value='/img/${mb_board.bo_image}'/>">
                        
                        </div>
	                    <div class="down-content">
	                       <h4><c:out value="${mb_board.bo_title}"/></h4>
	                       <span><c:out value="${mb_board.bo_price}"/>원</span>
	                       <h5><c:out value="${mb_board.bo_address1}"/>&nbsp;<c:out value="${mb_board.bo_address2}"/></h5>
	                    </div>
                    </div>
                </div>
                </c:forEach>
                
                <c:forEach items="${list }" var="board">
                <div class="col-lg-4">
                    <div class="item">
                        <div class="thumb">
                            <div class="hover-content">
                                <ul>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-eye"></i></a></li>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#번호 넘겨서 세부 페이지 받는"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <img src="<c:out value="${board.poster }"/>">
                        </div>
	                    <div class="down-content">
	                       <h4><c:out value="${board.title }"/></h4>
	                       <span><c:out value="${board.price }"/></span>
	                       <h5><c:out value="${board.address }"/></h5>
	                    </div>
                    </div>
                </div>
                </c:forEach>
                
               
                <!-- pagination 페이징 -->
                <div class="col-lg-12">
                    <div class="pagination">
                        <ul>
                            <li>
                                <a href="#">1</a>
                            </li>
                            <li class="active">
                                <a href="#">2</a>
                            </li>
                            <li>
                                <a href="#">3</a>
                            </li>
                            <li>
                                <a href="#">4</a>
                            </li>
                            <li>
                                <a href="#">></a>
                            </li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!--// BoardList -->
    
    
<%@ include file="../includes/footer.jsp" %>