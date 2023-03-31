package com.lcwd.rating.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.service.entities.Rating;
import com.lcwd.rating.service.repository.RatingRepository;
import com.lcwd.rating.service.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	@Autowired
    private RatingRepository ratingRepository;
	@Override
	public Rating createRating(Rating rating) {
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		return this.ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		return this.ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return this.ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return this.ratingRepository.findByHotelId(hotelId);
	}

}
