package hhplus.lecture.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private long id;
    private long userId;
    private ScheduleDto schedule;
    private LocalDateTime registrationDate;

}
