package kr.ac.hansung.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JoinDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void createUser(String userId, String userPassword, String userEmail) {
		String stmt = "insert into tb_user(user_id,user_password,user_email) values(?,?,?)";
		
		jdbcTemplate.update(stmt,new Object[] {userId, userPassword, userEmail});
	}
}
