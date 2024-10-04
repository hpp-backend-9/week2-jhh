package hhplus.lecture.infrastructure.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "lecture_schedule")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lecture_date", nullable = false)
    private LocalDateTime lectureDate;

    @Column(name = "max_capacity", nullable = false)
    private int maxCapacity;

    @Column(name = "current_count")
    private int currentCount;

    @ManyToOne
    @JoinColumn(name = "lecture_id", nullable = false)
    private LectureEntity lecture;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RegistrationEntity> registrations;
}
