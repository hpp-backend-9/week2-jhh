package hhplus.lecture.domain.repository;

import hhplus.lecture.domain.dto.RegistrationDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

public interface RegistrationRepository {

    Optional<RegistrationDto> checkDuplicate(Long userId, Long scheduleId);

    void save(Long userId, Long scheduleId);

}
