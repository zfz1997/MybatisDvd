package com.iotek.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserDao {
	private SqlSessionFactory ssf;
    private Reader reader;
    public UserDao(){
    	try {
			reader = Resources.getResourceAsReader("config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ssf = new SqlSessionFactoryBuilder().build(reader);
    }
    public SqlSessionFactory getSqlSessionFactory() {
    	return ssf;
    }
}
