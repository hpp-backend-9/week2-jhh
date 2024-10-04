package hhplus.lecture.domain.service;

import hhplus.lecture.domain.dto.RegistrationDto;
import hhplus.lecture.domain.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    public void checkDuplicate(Long userId, Long scheduleId) {

        Optional<RegistrationDto> registration = registrationRepository.checkDuplicate(userId, scheduleId);

        if (registration.isPresent()) {
            throw new RuntimeException("이미 신청한 강의입니다.");
        }

    }

    public void register(Long userId, Long scheduleId) {

//        registrationRepository.save();

    }
}
