package com.spring.study.board;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test1121?useSSL=false&serverTimezone=Asia/Seoul";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)) {
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
