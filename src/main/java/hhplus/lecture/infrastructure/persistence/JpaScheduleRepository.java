package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.infrastructure.model.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaScheduleRepository extends JpaRepository<ScheduleEntity, Long> {
}
