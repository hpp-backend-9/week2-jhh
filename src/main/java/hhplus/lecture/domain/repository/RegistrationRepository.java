package hhplus.lecture.domain.repository;

import org.springframework.stereotype.Component;

@Component
public interface RegistrationRepository {

    void register(Long userId, Long lectureId);
}
