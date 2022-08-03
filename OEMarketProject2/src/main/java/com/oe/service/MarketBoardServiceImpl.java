package com.oe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oe.domain.DGVO;
import com.oe.domain.FileUploadVO;
import com.oe.domain.MarketBoardVO;
import com.oe.mapper.CrawlingMapper;
import com.oe.mapper.MarketBoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class MarketBoardServiceImpl implements MarketBoardService {
   @Autowired
   private CrawlingMapper mapper;
   @Autowired
   private MarketBoardMapper boardMapper;
   
   @Override
   public void register(DGVO vo) {
      mapper.insert(vo);
   }

   @Override
   public List<DGVO> getListCrawling() {
      return mapper.getListCrawling();
   }

   @Override
   public void crawlingDelete() {
      mapper.crawlingRemove();
   }

   /*-- 새로운 상품 등록 --*/

   @Override
   public void register(MarketBoardVO vo) {
      boardMapper.insert(vo);
   }

   @Override
   public MarketBoardVO get(Long bo_num) {
      return null;
   }

   @Override
   public int modify(MarketBoardVO vo) {
      return 0;
   }

   @Override
   public int remove(Long bo_num) {
      return 0;
   }

   @Override
   public List<MarketBoardVO> getListBoard() {
      return boardMapper.getListBoard();
   }

   @Override
   public void fileUpload(FileUploadVO fvo) {
      boardMapper.insertFile(fvo);
   }

   @Override
   public List<MarketBoardVO> getListBoardOrderByRegdate() {
      return boardMapper.getList_regdate();
   }

   @Override
   public List<MarketBoardVO> getListBoardOrderLowPrice() {
      return boardMapper.getList_lowPrice();
   }

   @Override
   public List<MarketBoardVO> getListBoardOrderHighPrice() {
      return boardMapper.getList_highPrice();
   }
   
   

}