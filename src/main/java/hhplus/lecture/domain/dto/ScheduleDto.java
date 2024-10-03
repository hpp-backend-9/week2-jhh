package hhplus.lecture.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDto {

    private long id;
    private LocalDateTime lectureDate;
    private int maxCapacity;
    private int currentCount;
    private LectureDto lecture;
    private List<RegistrationDto> registrations;

}
