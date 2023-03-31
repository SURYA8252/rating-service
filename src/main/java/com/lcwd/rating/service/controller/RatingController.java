package com.lcwd.rating.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.rating.service.entities.Rating;
import com.lcwd.rating.service.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
    private RatingService ratingService;
	//Get all rating
	@GetMapping("/")
	public ResponseEntity<List<Rating>> getAllRating() {
		return ResponseEntity.ok(this.ratingService.getAllRating());
	}
	//Create Rating
	@PostMapping("/")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.ratingService.createRating(rating));
	}
	//Get all rating by userId
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId) {
		return ResponseEntity.ok(this.ratingService.getRatingByUserId(userId));
	}
	//Get rating by hotelId
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.ok(this.ratingService.getRatingByHotelId(hotelId));
	}
}
