package hhplus.lecture.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private Long id;
    private Long userId;
    private ScheduleDto schedule;
    private LocalDateTime registrationDate;

}
