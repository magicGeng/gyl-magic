package com.magic.msclass.service;

import com.magic.msclass.domain.dto.UserDTO;
import com.magic.msclass.domain.entity.Lesson;
import com.magic.msclass.domain.entity.LessonUser;
import com.magic.msclass.repository.LessonRepository;
import com.magic.msclass.repository.LessonUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/11/2.
 */
@Service
public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;
    @Autowired
    private LessonUserRepository lessonUserRepository;
    @Autowired
    private RestTemplate restTemplate;
    public Lesson buyById(Integer id) {
        // 1. 根据id查询lesson
        Lesson lesson = this.lessonRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("该课程不存在！"));

        // 2. 根据lesson.id查询user_lesson，那么直接返回lesson；
        LessonUser lessonUser = this.lessonUserRepository.findByLessonId(id);
        if (lessonUser != null) {
            return lesson;
        }
        // 3. 如果user_lesson == null && 用户的余额> lesson.price，就去购买
        // TODO 登录实现后需重构
        Integer userId = 1;
        UserDTO userDTO = restTemplate.getForObject(
                "http://localhost:8081/users/{userId}",
                UserDTO.class,
                userId
        );

        BigDecimal money = userDTO.getMoney().subtract(lesson.getPrice());
        if (money.doubleValue() < 0) {
            throw new IllegalArgumentException("余额不足！");
        }

        // TODO 购买逻辑...1. 调用用户微服务的扣减金额接口；2. 向lesson_user表插入数据
        return lesson;
    }
}
