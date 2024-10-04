package hhplus.lecture.domain.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDto {

    private Long id;
    private LocalDateTime lectureDate;
    private int maxCapacity;
    private int currentCount;
    private LectureDto lecture;
    private List<RegistrationDto> registrations;

}
