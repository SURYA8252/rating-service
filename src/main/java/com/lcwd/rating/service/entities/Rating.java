package com.lcwd.rating.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_rating")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rating {
	@Id
	private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feebback;
}
