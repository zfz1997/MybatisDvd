package com.iotek.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.iotek.dao.UserDao;
import com.iotek.entity.User;

public class Test {
       public static void main(String[] args) {
		       UserDao dao=new UserDao();
		       SqlSessionFactory ssf=dao.getSqlSessionFactory();
		       SqlSession ss=ssf.openSession();
		       User user=null;
		       try {
				user=ss.selectOne("com.iotek.user.insert");
		       }
			   catch(Exception e) {
				   System.out.println("连接数据库失败 ");
			   }
			 finally
		       {
				ss.close();
		       }
		       System.out.println(user);
	}
}
