package hhplus.lecture.application.facade;

import hhplus.lecture.domain.dto.LectureDto;
import hhplus.lecture.domain.service.LectureService;
import hhplus.lecture.domain.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureRegistrationFacade {

    private final LectureService lectureService;
    private final RegistrationService registrationService;

    public void register(Long lectureId) {

        // 1. 유효한 강의인지
        LectureDto lecture = lectureService.getLecture(lectureId);

        // 2. 수용인원을 초과하지 않았는지

        // 3. 이미 신청한 강의인지
    }

}
