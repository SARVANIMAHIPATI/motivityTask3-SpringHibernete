package com.motivity3.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.motivity3.College;

@Repository

public interface CollegeDao {
	void insert(College college);
	void delete(College college);
	void update(College college);
	List<College> select();
}
