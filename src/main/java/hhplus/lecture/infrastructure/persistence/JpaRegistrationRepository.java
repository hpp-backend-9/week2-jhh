package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.infrastructure.model.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaRegistrationRepository extends JpaRepository<RegistrationEntity, Long> {

    Optional<RegistrationEntity> findByUserIdAndScheduleId(Long userId, Long scheduleId);

}
