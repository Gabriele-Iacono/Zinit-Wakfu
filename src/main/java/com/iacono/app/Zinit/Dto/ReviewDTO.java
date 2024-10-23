package com.iacono.app.Zinit.Dto;


import lombok.Data;

import java.util.Date;

@Data
public class ReviewDTO {
    private Long id;

    private Date reviewDate;

    private String review;

    private Long rating;

    private Long userId;

    private String clientName;


}



