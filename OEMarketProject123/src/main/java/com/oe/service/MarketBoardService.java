package com.oe.service;

import java.util.List;

import com.oe.domain.DGVO;
import com.oe.domain.FileUploadVO;
import com.oe.domain.MarketBoardVO;

public interface MarketBoardService {
   
   public void register(DGVO vo);
   public List<DGVO> getListCrawling();
   public void crawlingDelete();
   
   public void register(MarketBoardVO vo);
   public MarketBoardVO get(Long bo_num);
   public int modify(MarketBoardVO vo);
   public int remove(Long bo_num);
   public List<MarketBoardVO> getListBoard();
   public void fileUpload(FileUploadVO fvo);
   public List<MarketBoardVO> getListBoardOrderByRegdate();
   public List<MarketBoardVO> getListBoardOrderLowPrice();
   public List<MarketBoardVO> getListBoardOrderHighPrice();
    
}