package com.it.dao;

/*
 * 글번호, 글제목, 글내용, 가격, 찜, 이미지, 주소
 * 
 * 
 * */

public class DGVO {
   private int no, price, heart;
   private String title, content, poster, address;

   public int getNo() {
      return no;
   }

   public String getPoster() {
	return poster;
}

public void setPoster(String poster) {
	this.poster = poster;
}

public void setNo(int no) {
      this.no = no;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public int getHeart() {
      return heart;
   }

   public void setHeart(int heart) {
      this.heart = heart;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getImages() {
      return poster;
   }

   public void setImages(String images) {
      this.poster = images;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

}