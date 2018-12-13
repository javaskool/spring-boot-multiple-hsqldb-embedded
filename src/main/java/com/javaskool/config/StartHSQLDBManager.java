package com.javaskool.config;

import javax.sql.DataSource;

//import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@Import({BookingPrimaryDBConfig.class})
@ComponentScan({ "com.javaskool" })
public class StartHSQLDBManager {

	@Autowired
	DataSource dataSource;

	@Bean
	public JdbcTemplate getJdbcTemplate(){
	  return new JdbcTemplate(dataSource);
	}
	
	//@PostConstruct
	/*public void getDbManager(){
	   DatabaseManagerSwing.main(
		new String[] { "--url", "jdbc:hsqldb:file:db_name1", "--user", "sa", "--password", "sa"});
	}*/

}
