package hhplus.lecture.infrastructure.persistence;


import hhplus.lecture.infrastructure.model.entity.LectureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLectureRepository extends JpaRepository<LectureEntity, Long> {
}
