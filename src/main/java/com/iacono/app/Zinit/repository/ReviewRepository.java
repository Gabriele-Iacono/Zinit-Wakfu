package com.iacono.app.Zinit.repository;

import com.iacono.app.Zinit.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository <Review, Long> {


}
