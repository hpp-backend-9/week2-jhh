package hhplus.lecture.domain.service;

import hhplus.lecture.domain.dto.ScheduleDto;
import hhplus.lecture.domain.repository.ScheduleRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ScheduleServiceTest {

    private AutoCloseable closeable;

    @Mock
    private ScheduleRepository scheduleRepository;

    @InjectMocks
    private ScheduleService scheduleService;

    @BeforeEach
    public void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() throws Exception {
        closeable.close();
    }

    @Test
    @DisplayName("유효하지 않은 일정")
    void nullSchedule() {

        // given
        Long scheduleId = 1L;

        when(scheduleRepository.getSchedule(scheduleId)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> scheduleService.getSchedule(scheduleId));

    }

    @Test
    @DisplayName("수용인원 초과")
    void checkCapacity() {

        // given
        ScheduleDto schedule = ScheduleDto.builder()
                .id(1L)
                .lectureDate(LocalDateTime.now().plusDays(7))
                .maxCapacity(30)
                .currentCount(30)
                .build();

        assertThrows(RuntimeException.class, () -> scheduleService.checkCapacity(schedule));
    }

}