package com.magic.msclass.repository;

import com.magic.msclass.domain.entity.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/11/2.
 */
@Repository
public interface LessonRepository extends CrudRepository<Lesson, Integer> {
}
