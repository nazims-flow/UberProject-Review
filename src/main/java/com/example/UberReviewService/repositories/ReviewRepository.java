package com.example.UberReviewService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UberReviewService.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

    
    
}
