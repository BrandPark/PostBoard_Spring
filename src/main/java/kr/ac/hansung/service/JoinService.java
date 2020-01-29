package kr.ac.hansung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.JoinDao;

@Service
public class JoinService {
	
	@Autowired
	private JoinDao joinDao;
	
	public void createUser(String userId, String userPassword, String userEmail) {
		joinDao.createUser(userId, userPassword, userEmail);
	}
	
}
