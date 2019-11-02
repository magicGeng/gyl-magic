package com.magic.msclass.controller;

import com.magic.msclass.domain.entity.Lesson;
import com.magic.msclass.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/2.
 */
@RestController
@RequestMapping("/lessons")
public class LessonController {
    @Autowired
    private LessonService lessonService;
    /**
     * 购买指定id的课程
     * @param id
     */
    @GetMapping("/buy/{id}")
    public Lesson buyById(@PathVariable Integer id){
        return this.lessonService.buyById(id);
    }
}
