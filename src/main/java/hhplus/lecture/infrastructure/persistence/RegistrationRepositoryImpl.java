package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.domain.repository.RegistrationRepository;

public class RegistrationRepositoryImpl implements RegistrationRepository {

    private final JpaRegistrationRepository jpaRegistrationRepository;

    public RegistrationRepositoryImpl(JpaRegistrationRepository jpaRegistrationRepository) {
        this.jpaRegistrationRepository = jpaRegistrationRepository;
    }

    public void register(Long userId, Long lectureId) {

        jpaRegistrationRepository.findById(lectureId);

    }
}
