package com.motivity3.services;

import java.util.List;

import com.motivity3.College;

public interface CollegeService {
	void insert(College college);
	void update(College college);
	void delete(College college);
	List<College> select();
}
