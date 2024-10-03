package hhplus.lecture.domain.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {


    public void register(Long userId, Long lectureId) {

        throw new RuntimeException("유효하지 않은 강의입니다.");

    }
}
