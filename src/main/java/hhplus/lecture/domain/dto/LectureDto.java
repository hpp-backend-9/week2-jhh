package hhplus.lecture.domain.dto;

import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LectureDto {

    private Long id;
    private String lectureName;
    private String instructorName;
    private List<ScheduleDto> schedules;

}
