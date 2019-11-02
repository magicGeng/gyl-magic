package com.magic.msclass.repository;

import com.magic.msclass.domain.entity.LessonUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LessonUserRepository extends CrudRepository<LessonUser, Integer> {
    LessonUser findByLessonId(Integer id);
}
