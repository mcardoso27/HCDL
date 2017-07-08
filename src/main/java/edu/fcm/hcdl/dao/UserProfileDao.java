package edu.fcm.hcdl.dao;

import java.util.List;

import edu.fcm.hcdl.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
