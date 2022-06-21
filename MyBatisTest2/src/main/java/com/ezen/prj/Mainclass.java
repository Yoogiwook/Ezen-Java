package com.ezen.prj;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mainclass {

	public static void main(String[] args) {
		String resource = "com/ezen/prj/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); // db연결
			SqlSession session = sqlSessionFactory.openSession(); // session 이용해서 db 사용
			mapperInterface mapper = session.getMapper(mapperInterface.class);
			BoardVO vo = mapper.selectOne(10);
			System.out.println(vo.getId());
			System.out.println(vo.getName());
			System.out.println(vo.getPhone());
			System.out.println(vo.getAddress());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
