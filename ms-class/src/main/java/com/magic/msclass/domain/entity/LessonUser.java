package com.magic.msclass.domain.entity;
import javax.persistence.*;

/**
 * Created by Administrator on 2019/11/2.
 */
@Table(name = "lesson_user")
@Entity
public class LessonUser {
    @Column
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lessonId;
    @Column
    private Integer userId;

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
