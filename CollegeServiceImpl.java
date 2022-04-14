package com.motivity3.services;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.motivity3.College;
import com.motivity3.dao.CollegeDao;

@Service
public class CollegeServiceImpl implements CollegeService{
	@Autowired
	public CollegeDao collegeDao;

	@Transactional
	public void update(College college) {
		// TODO Auto-generated method stub
		collegeDao.update(college);
	}

	@Transactional
	public void delete(College college) {
		// TODO Auto-generated method stub
		collegeDao.delete(college);
	}


	@Transactional
	public List<College> select() {
		// TODO Auto-generated method stub
		return collegeDao.select();
	}

	@Transactional
	public void insert(College college) {
		// TODO Auto-generated method stub
		collegeDao.insert(college);
		
	}
	
	
}
