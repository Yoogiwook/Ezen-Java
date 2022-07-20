package com.it.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.it.dao.DGVO;
import com.it.dao.DataDAO;

public class SeoulMain {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
        SeoulMain sm=new SeoulMain();
        sm.danggens();
   }
   
   public void danggens() {
      DataDAO dao = new DataDAO();
      try
      {
         int k=1;
//         for(int i=1;i<=35;i++)
//         {
//              
            
//            Document doc=Jsoup.connect("https://korean.visitseoul.net/attractions?curPage=").get();
//            Elements comment=doc.select("ul.article-list li.item div.infor-element span.text-dot-d");
//            Elements content=doc.select("article.card-top a.card-link div.card-desc h2.card-title");

            //-------------------------------------------------------------------------------------------
            
            //당근
            Document doc=Jsoup.connect("https://www.daangn.com/hot_articles").get();
            //제목 
             Elements title=doc.select("article.card-top a.card-link div.card-desc h2.card-title");
//             System.out.println(title.get(1).text());
             //가격
             Elements price=doc.select("article.card-top a.card-link div.card-desc h2.card-price");
             String price2 = price.select("h2.card-price").text().substring(0);
             //주소
             Elements address=doc.select("article.card-top a.card-link div.card-desc h2.card-region-name");
             //하트
            Elements heart=doc.select("article.card-top a.card-link div.card-desc h2.card-counts span");
            
            //그림
            Elements poster=doc.select("article.card-top a.card-link div.card-photo img");
//            System.out.println(poster.get(0).attr("src"));
//            System.out.println(poster);
            
            //상세페이지 링크
            Elements link=doc.select("article.card-top a.card-link");

            for(int j=0;j<poster.size();j++)
            {
               try{
//                  System.out.println("번호:"+k);
//                  System.out.println(title.get(j).text());
//                  System.out.println(poster.get(j).attr("src"));
//                  System.out.println(link.get(j).attr("href"));
                  Document doc2=Jsoup.connect("https://www.daangn.com/"+link.get(j).attr("href")).get();
                  Element content=doc2.select("section#article-description div#article-detail p").get(0);
                  System.out.println("내용:"+content.text());
                  System.out.println("=========================================================");
                   
                  DGVO vo=new DGVO();
                  vo.setNo(k);
                  vo.setTitle(title.get(j).text());
//                  String image=poster.get(j).attr("src");
//                  System.out.println(image);
//                  image=image.substring(image.indexOf("(")+1,image.lastIndexOf(")"));
//                   style="background-image:url(/comm/getImage?srvcId=POST&amp;parentSn=5548&amp;fileTy=POSTTHUMB&amp;fileNo=1&amp;thumbTy=M)"
//                  image="https://www.daangn.com/hot_articles"+image;
//                  vo.setPoster(image);
                  vo.setContent(content.text());
                  vo.setPrice(Integer.parseInt(price2));
                  vo.setAddress(address.text());
                  dao.seoulLocationInsert(vo);
                  k++;
               }catch(Exception ex) {}
            }
//         }
            
      }catch(Exception ex){}
   }
   
   
   
//   public void seoulAttractions()
//   {
//      DataDAO dao=new DataDAO();
//      try
//      {
//         int k=1;
//         for(int i=1;i<=35;i++)
//         {
//            Document doc=Jsoup.connect("https://korean.visitseoul.net/attractions?curPage="+i).get();
//            Elements poster=doc.select("ul.article-list li.item div.thumb");
//            Elements comment=doc.select("ul.article-list li.item div.infor-element span.text-dot-d");
//            Elements link=doc.select("ul.article-list li.item a");
//            Elements title=doc.select("ul.article-list li.item div.infor-element span.title");
//            for(int j=0;j<poster.size();j++)
//            {
//               try{
//                  System.out.println("번호:"+k);
//                  System.out.println(title.get(j).text());
//                  System.out.println(poster.get(j).attr("style"));
//                  System.out.println(comment.get(j).text());
//                  System.out.println(link.get(j).attr("href"));
//                  Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get();
//                  Element address=doc2.select("div.detail-map-infor:eq(1) dl dd").get(0);
//                  System.out.println("주소:"+address.text());
//                  System.out.println("=========================================================");
//                   
//                  SeoulLocationVO vo=new SeoulLocationVO();
//                  vo.setNo(k);
//                  vo.setTitle(title.get(j).text());
//                  vo.setMsg(comment.get(j).text());
//                  String image=poster.get(j).attr("style");
//                  image=image.substring(image.indexOf("(")+1,image.lastIndexOf(")"));
//                  // style="background-image:url(/comm/getImage?srvcId=POST&amp;parentSn=5548&amp;fileTy=POSTTHUMB&amp;fileNo=1&amp;thumbTy=M)"
//                  image="https://korean.visitseoul.net"+image;
//                  vo.setPoster(image);
//                  vo.setAddress(address.text());
//                  dao.seoulLocationInsert(vo);
//                  k++;
//               }catch(Exception ex) {}
//            }
//         }
//      }catch(Exception ex){}
//   }
//   
}