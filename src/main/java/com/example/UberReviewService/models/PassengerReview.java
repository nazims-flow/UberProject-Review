package com.example.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class PassengerReview extends Review {

    @Column(nullable = false)
    private String passengerReviewComment;

    @Column(nullable = false)
    private String passengerRating;
}
