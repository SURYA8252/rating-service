package com.lcwd.rating.service.services;

import java.util.List;

import com.lcwd.rating.service.entities.Rating;

public interface RatingService {
    //Create Rating
	Rating createRating(Rating rating);
	//Get all rating
	List<Rating> getAllRating();
	//Get all by userId
	List<Rating> getRatingByUserId(String userId);
	//get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
	
}
