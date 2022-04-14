package com.motivity3.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motivity3.College;

@Repository
public class CollegeDaoImpl implements CollegeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void insert(College college) {
		
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(college);
		
	}

	public void delete(College college) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(college);
	}

	public void update(College college) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(college);
		
	}

	public List<College> select() {
		// TODO Auto-generated method stub
		List<College> clg_lst = (List<College>)sessionFactory.getCurrentSession().createCriteria(College.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();;
		
		return clg_lst;
	}

}
