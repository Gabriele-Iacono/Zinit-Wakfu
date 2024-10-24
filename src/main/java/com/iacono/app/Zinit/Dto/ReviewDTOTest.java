package com.iacono.app.Zinit.Dto;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;


public class ReviewDTOTest {

    @Test
    void testReviewDTOCreation() {
        Date reviewDate = new Date();
        ReviewDTO review = new ReviewDTO();
        review.setId(1L);
        review.setReviewDate(reviewDate);
        review.setReview("Nice build, pretty solid");
        review.setRating(5L);
        review.setUserId(10L);
        review.setClientName("Marcello Rossi");

        Assert.assertEquals(1L, (long) review.getId(), "L'id dovrebbe essere 1");
        Assert.assertEquals(reviewDate, review.getReviewDate(), "La data di recensione dovrebbe corrispondere");
        Assert.assertEquals("Nice build, pretty solid", review.getReview(), "Il commento dovrebbe essere Nice build, pretty solid");
        Assert.assertEquals(5L, (long) review.getRating(), "Il rating dovrebbe essere 5");
        Assert.assertEquals(10L, (long) review.getUserId(), "L'id utente dovrebbe essere 10");
        Assert.assertEquals("Marcello Rossi", review.getClientName(), "Il nome del cliente dovrebbe essere 'Marcello Rossi'");




    }
}
