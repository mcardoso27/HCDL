package edu.fcm.hcdl.service;

import java.util.List;

import edu.fcm.hcdl.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
