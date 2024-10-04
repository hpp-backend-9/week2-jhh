package hhplus.lecture.domain.repository;

import hhplus.lecture.domain.dto.LectureDto;
import hhplus.lecture.domain.dto.ScheduleDto;

import java.util.Optional;

public interface ScheduleRepository {

    Optional<ScheduleDto> getSchedule(Long scheduleId);

}
