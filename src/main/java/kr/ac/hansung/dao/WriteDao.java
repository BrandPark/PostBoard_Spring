package kr.ac.hansung.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WriteDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void doWrite(String title,String contents) {			//tb_text에 insert
		String stmt = "insert into tb_text(writer,title,contents,modified_time) values(?,?,?,?)";
		String writer="mingon";
		String modified_time="20.01.26.";
		
		jdbcTemplate.update(stmt,new Object[] {writer, title, contents, modified_time});
	}
}
