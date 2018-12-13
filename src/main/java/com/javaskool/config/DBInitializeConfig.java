package com.javaskool.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBInitializeConfig {

	private static Logger logger = LoggerFactory.getLogger(DBInitializeConfig.class);
	
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void initialize(){
		try {
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			logger.info("========SQL insert query executing 1==========");
			    try{
			    	//statement.executeUpdate("INSERT INTO 'PUBLIC'.user_details(email,firstName,lastName,`password`) VALUES ('javaskool@test.com','Abc','Test','password');");
			    	logger.info("========SQL insert query executed 1==========");
			    }
			    catch(Exception e)
				{
					logger.error("========Error in SQL insert query execution 1==========");
					e.printStackTrace();
				}
			    logger.info("========SQL insert query executing 2==========");
			    try{
			    	//statement.executeUpdate("INSERT INTO 'PUBLIC'.booking_details(bookingAmount,createdBy,dropAddress,pickupAddress)VALUES('999',1,'Chennai','Bangalore'),('998',1,'Bangalore','Chennai');");
			    	logger.info("========SQL insert query executed 2==========");
			    }
			    catch(Exception e)
				{
					logger.error("========Error in SQL insert query execution 2==========");
					e.printStackTrace();
				}
			statement.close();
			connection.close();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
			
		
	}
	
	  
	
}
