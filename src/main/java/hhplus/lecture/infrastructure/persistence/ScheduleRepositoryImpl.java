package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.domain.dto.LectureDto;
import hhplus.lecture.domain.dto.ScheduleDto;
import hhplus.lecture.domain.repository.ScheduleRepository;
import hhplus.lecture.infrastructure.model.entity.ScheduleEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ScheduleRepositoryImpl implements ScheduleRepository {

    private final JpaScheduleRepository jpaScheduleRepository;

    @Override
    public Optional<ScheduleDto> getSchedule(Long scheduleId) {

        return jpaScheduleRepository.findById(scheduleId)
                .map(scheduleEntity -> ScheduleDto.builder()
                        .id(scheduleEntity.getId())
                        .lectureDate(scheduleEntity.getLectureDate())
                        .maxCapacity(scheduleEntity.getMaxCapacity())
                        .currentCount(scheduleEntity.getCurrentCount())
                        .build());
    }
}
