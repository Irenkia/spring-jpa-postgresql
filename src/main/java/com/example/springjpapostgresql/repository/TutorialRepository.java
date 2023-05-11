package com.example.springjpapostgresql.repository;

import com.example.springjpapostgresql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository  extends JpaRepository<Tutorial, Integer> {
     List<Tutorial> findByTitleContaining(String title);

//    @Query("SELECT t FROM Tutorial t WHERE t.title like %?1%")
//    List<Tutorial> findByLike(String title);

     List<Tutorial> findByPublished(boolean published);
}
