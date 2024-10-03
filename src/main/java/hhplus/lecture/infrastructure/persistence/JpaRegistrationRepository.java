package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.infrastructure.model.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRegistrationRepository extends JpaRepository<RegistrationEntity, Long> {


}
