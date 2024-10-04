package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.domain.dto.RegistrationDto;
import hhplus.lecture.domain.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RegistrationRepositoryImpl implements RegistrationRepository {

    private final JpaRegistrationRepository jpaRegistrationRepository;

    @Override
    public Optional<RegistrationDto> checkDuplicate(Long userId, Long scheduleId) {

        return jpaRegistrationRepository.findByUserIdAndScheduleId(userId, scheduleId)
                .map(registrationEntity -> RegistrationDto.builder()
                        .id(registrationEntity.getId())
                        .userId(registrationEntity.getUserId())
                        .registrationDate(registrationEntity.getRegistrationDate())
                        .build());
    }

    @Override
    public void save(Long userId, Long scheduleId) {

    }
}
