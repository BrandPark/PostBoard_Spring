package kr.ac.hansung.dao;

import java.util.Calendar;

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
		String stmt = "insert into tb_text(writer,title,contents,modified_date,modified_time) values(?,?,?,?,?)";
		String writer="mingon";
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		String modified_date = year+"-"+month+"-"+date;		//ex) 2020-01-27
		String modified_time = hour+":"+minute+":"+second;	// ex) 15:57:40
		
		jdbcTemplate.update(stmt,new Object[] {writer, title, contents, modified_date, modified_time});
	}
}
