package hhplus.lecture.infrastructure.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "lecture")
public class LectureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lecture_name", nullable = false)
    private String lectureName; /* 강의 이름 */

    @Column(name = "instructor_name", nullable = false)
    private String instructorName; /* 강연자 이름 */

    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ScheduleEntity> schedules;

}
