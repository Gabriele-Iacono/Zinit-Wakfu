package com.iacono.app.Zinit.services;

import com.iacono.app.Zinit.Dto.ReviewDTO;
import com.iacono.app.Zinit.models.Review;
import com.iacono.app.Zinit.models.User;
import com.iacono.app.Zinit.repository.ReviewRepository;
import com.iacono.app.Zinit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {


    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private UserRepository userRepository;

    public ReviewDTO addReview(ReviewDTO reviewDTO) {
        User user = userRepository.findById(reviewDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Review review = new Review();
        review.setReviewDate(new Date());
        review.setReview(reviewDTO.getReview());
        review.setRating(reviewDTO.getRating());
        review.setUser(user);

        reviewRepository.save (review);

        return convertToDto (review);

    }

    public List<ReviewDTO> getAllReviews() {
        List<Review> reviews = reviewRepository.findAll();
        return reviews.stream().map(this::convertToDto).collect(Collectors.toList());

    }

    private ReviewDTO convertToDto(Review review) {
        ReviewDTO dto = new ReviewDTO();
        dto.setId(review.getId());
        dto.setReviewDate(review.getReviewDate());
        dto.setReview(review.getReview());
        dto.setRating(review.getRating());
        dto.setUserId(review.getUser().getId());
        dto.setClientName(review.getUser().getUsername());
        return dto;

    }
}
