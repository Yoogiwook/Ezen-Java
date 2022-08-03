<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Resister</title>
   
    <!-- Link -->
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
<link rel="stylesheet" href="/resources/assets/css/basic.css">
<link rel="stylesheet" href="/resources/assets/css/main.css">

</head>
<body>
    
   <section class="insert-section">
      <div class="container">
         <div class="row justify-content-center">
            <div class="col-md-6 col-lg-5 shadow">
               <div class="insert-wrap">
                  <img src="/resources/assets/images/cucumber.png">
                  <h3 class="mb-4 text-center">상품 등록</h3>
                  <form action="boardRegister.do" class="insert-form" enctype="multipart/form-data" method="post">
                    <div class="form-group refresh_right">
                        <button type="reset" class="refresh"><i class="fa fa-refresh" aria-hidden="true"></i></button>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="제목" required name="bo_title">
                    </div>
                    
                    <!-- 카테고리 -->
                    <div class="form-group">
                        <select name="bo_category" class="form-control">
                            <option value="" selected>카테고리</option>
                            <option value="book">도서/티켓/문구</option>
                            <option value="music">음반/악기</option>
                            <option value="art">예술/수집품</option>
                            <option value="woman">여성의류</option>
                            <option value="man">남성의류</option>
                            <option value="shoes">신발</option>
                            <option value="bag">가방</option>
                            <option value="watch">시계</option>
                            <option value="jewelry">쥬얼리</option>
                            <option value="interior">가구/인테리어</option>
                            <option value="car">차량/오토바이</option>
                            <option value="kidult">키덜트</option>
                            <option value="living">생활용품</option>
                            <option value="pet">반려동물용품</option>
                            <option value="etc">기타</option>
                        </select>
                    </div>
                    <!-- //카테고리 -->
                    
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="가격" required name="bo_price">
                    </div>
                    <div class="form-group">
                        <textarea rows="5" cols="20" class="form-control" placeholder="내용" required name="bo_content"></textarea>
                    </div>
                    
                    <div class="form-group filebox bs3-primary preview-image">
                        <input class="upload-name" value="파일선택" disabled="disabled" style="width: 250px;">

                        <label for="input-file1" class="input-file-button"><img src="/resources/assets/images/paper-clip.png"></label>
                        <input type="file" multiple="multiple" id="input-file1" class="upload-hidden" name="bo_image">
                    </div>

                    <input type="hidden" name="bo_address1" value="<c:out value='${login.us_address1}'/>"> 
                    <input type="hidden" name="bo_address2" value="<c:out value='${login.us_address2}'/>"> 
                    <input type="hidden" name="bo_id" value="<c:out value='${login.us_id}'/>">
                    <input type="hidden" name="bo_nickname" value="<c:out value='${login.us_nickname}'/>">
                     
                    <div class="mt-5">
                        <div class="form-group submit">
                            <button type="submit" class="form-control btn btn-primary">등록하기</button>
                        </div>

                        <div class="form-group submit fr">
                            <button type="reset" class="form-control btn btn-primary" onclick="location.href='boardList.do'">목록으로</button>
                        </div>
                    </div>
                
                  </form>
             
               </div>
            </div>
         </div>
      </div>
   </section>


   <!-- jQuery -->
   <script src="/resources/assets/js/jquery.min.js"></script>
   <!-- Bootstrap -->
   <script src="/resources/assets/js/bootstrap.min.js"></script>
   <!-- Plugins -->
   <script src="/resources/assets/js/owl-carousel.js"></script>
   <script src="/resources/assets/js/slick.js"></script>
   <!-- custom -->
   <script src="/resources/assets/js/custom.js"></script>
   
   <script type="text/javascript">
   $(document).ready(function(){
      var fileTarget = $('.filebox .upload-hidden');
   
       fileTarget.on('change', function(){
           if(window.FileReader){
               // 파일명 추출
               var filename = $(this)[0].files[0].name;
           } 
   
           else {
               // Old IE 파일명 추출
               var filename = $(this).val().split('/').pop().split('\\').pop();
           };
   
           $(this).siblings('.upload-name').val(filename);
       });
   
       //preview image 
       var imgTarget = $('.preview-image .upload-hidden');
   
       imgTarget.on('change', function(){
           var parent = $(this).parent();
           parent.children('.upload-display').remove();
   
           if(window.FileReader){
               //image 파일만
               if (!$(this)[0].files[0].type.match(/image\//)) return;
               
               var reader = new FileReader();
               reader.onload = function(e){
                   var src = e.target.result;
                   parent.prepend('<div class="upload-display"><div class="upload-thumb-wrap"><img src="'+src+'" class="upload-thumb"></div></div>');
               }
               reader.readAsDataURL($(this)[0].files[0]);
           }
   
           else {
               $(this)[0].select();
               $(this)[0].blur();
               var imgSrc = document.selection.createRange().text;
               parent.prepend('<div class="upload-display"><div class="upload-thumb-wrap"><img class="upload-thumb"></div></div>');
   
               var img = $(this).siblings('.upload-display').find('img');
               img[0].style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(enable='true',sizingMethod='scale',src=\""+imgSrc+"\")";        
           }
       });
   });
   </script>

</body>
</html>