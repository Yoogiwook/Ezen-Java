package com.saeyan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.do")
public class uploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//여기를 바꿔주면업로드 경로가 바뀜
		String savePath="upload";
		//최대 업로드 파일크기 5mb로 제한
		int uploadFileSizeLimit = 5 * 1024 * 1024;
		String encType="utf-8";
		
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		System.out.println("서버상의실제 디렉토리:");
		System.out.println(uploadFilePath);
		
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadFilePath, uploadFileSizeLimit,encType, new DefaultFileRenamePolicy());
			//업로드 된 파일의 이름 얻기 
			String fileName = multi.getFilesystemName("uploadFile");
			
			if(fileName == null) {
				System.out.println("파일 업로드 되지 않았음");
				
			} else {
				out.print("<br> 글쓴이: " + multi.getParameter("name"));
				out.print("<br> 제 &nbsp; 목: " + multi.getParameter("title"));
				out.print("<br> 파일명: : " + fileName);
			} //else 
		} catch(Exception e) {
			System.out.println("예외 발생:" + e);
		} // catch
		
		}

	}


