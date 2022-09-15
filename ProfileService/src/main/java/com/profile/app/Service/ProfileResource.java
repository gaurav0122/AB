package com.profile.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.app.model.UserProfile;
import com.profile.app.repository.ProfileRepository;


@Service
public class ProfileResource {

	@Autowired
	private ProfileRepository profileRepository;
	
	
	// Add new profile 
	public UserProfile addNewCustomerProfile(UserProfile userProfile) {
		return profileRepository.save(userProfile);
		
	}
	
	//Get all the profiles
	public List<UserProfile> getAllProfiles() {
		return profileRepository.findAll();
	}

	public UserProfile getByProfileId(String userId) {
		Optional<UserProfile> userOptional = profileRepository.findById(userId);
		
		return userOptional.get();
	}

	public UserProfile updateProfile(UserProfile userProfileDb) {
		return profileRepository.save(userProfileDb);
	}
	
	public String deleteProfile(String userId) {
		profileRepository.deleteById(userId);
		return "Deleted Succesfully";
	}

	public List<UserProfile> findByMobileNo(Long mobileNo) {
		
		return profileRepository.findByMobileNo(mobileNo);
	}

	public List<UserProfile> findByEmail(String email) {
		
		return profileRepository.findByEmail(email);
	}

	
	
}
