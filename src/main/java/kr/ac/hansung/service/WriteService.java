package kr.ac.hansung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.WriteDao;

@Service
public class WriteService {
	@Autowired
	private WriteDao writeDao;
	
	public void doWrite(String title, String contents) {
		writeDao.doWrite(title, contents);
	}
}
