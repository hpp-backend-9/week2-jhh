package hhplus.lecture.domain.service;

import hhplus.lecture.domain.dto.ScheduleDto;
import hhplus.lecture.domain.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleDto getSchedule(Long scheduleId) {

        return scheduleRepository.getSchedule(scheduleId)
                .orElseThrow(() -> new RuntimeException("유효하지 않은 일정입니다."));
    }

    public void checkCapacity(ScheduleDto schedule) {

        if(schedule.getCurrentCount() >= schedule.getMaxCapacity()) {
            throw new RuntimeException("인원이 초과됐습니다.");
        }

    }


}
