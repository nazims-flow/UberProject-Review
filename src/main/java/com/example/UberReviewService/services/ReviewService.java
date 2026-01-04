package com.example.UberReviewService.services;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.ReviewRepository;


@Service
public class ReviewService implements CommandLineRunner{


    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("********************");

        Review r = Review.builder().content("Amazing ride")
        .rating(5.0).build();
        System.out.println(r);
        reviewRepository.save(r);
    }

    
    
}
