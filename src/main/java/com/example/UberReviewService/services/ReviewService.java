package com.example.UberReviewService.services;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.BookingRepository;
import com.example.UberReviewService.repositories.ReviewRepository;


@Service
public class ReviewService implements CommandLineRunner{


    private ReviewRepository reviewRepository;

    private final BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository , BookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("********************");

        Review r = Review.builder().content("Amazing ride")
        .rating(5.0).build();

        Booking b = Booking.builder().startTime(new Date()).endTime(new Date()).review(r).build();


       
        bookingRepository.save(b);
        reviewRepository.save(r);

        System.out.println(b);
        System.out.println(r);
        
    }

    
    
}
