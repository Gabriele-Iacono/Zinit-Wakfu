package com.iacono.app.Zinit.repository;

import com.iacono.app.Zinit.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {
}
