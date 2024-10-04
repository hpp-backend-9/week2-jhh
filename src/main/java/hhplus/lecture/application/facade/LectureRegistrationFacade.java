package hhplus.lecture.application.facade;

import hhplus.lecture.domain.dto.LectureDto;
import hhplus.lecture.domain.dto.ScheduleDto;
import hhplus.lecture.domain.service.LectureService;
import hhplus.lecture.domain.service.RegistrationService;
import hhplus.lecture.domain.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureRegistrationFacade {

    private final LectureService lectureService;
    private final RegistrationService registrationService;
    private final ScheduleService scheduleService;

    public void register(Long lectureId, Long scheduleId, Long userId) {

        // 1. 유효한 강의인지
        LectureDto lecture = lectureService.getLecture(lectureId);

        // 2. 해당 날짜 강의가 유효한지
        ScheduleDto schedule = scheduleService.getSchedule(scheduleId);

        // 3. 수용인원을 초과하지 않았는지
        scheduleService.checkCapacity(schedule);

        // 4. 이미 신청한 강의인지
        registrationService.checkDuplicate(userId, scheduleId);

    }

}
