package hhplus.lecture.domain.service;

import hhplus.lecture.domain.dto.RegistrationDto;
import hhplus.lecture.domain.repository.RegistrationRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class RegistrationServiceTest {

    @Mock
    private RegistrationRepository registrationRepository;

    @InjectMocks
    private RegistrationService registrationService;

    private AutoCloseable closeable;

    @BeforeEach
    public void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() throws Exception {
        closeable.close();
    }

    @Test
    @DisplayName("이미 신청한 강의")
    void duplicated() {

        Long userId = 1L;
        Long scheduleId = 1L;

        RegistrationDto registrationDto = RegistrationDto.builder()
                .id(1L)
                .userId(userId)
                .build();

        when(registrationRepository.checkDuplicate(userId, scheduleId)).thenReturn(Optional.of(registrationDto));

        assertThrows(RuntimeException.class, () -> registrationService.checkDuplicate(userId, scheduleId));
    }

    @Test
    @DisplayName("강의 신청")
    void register() {
        Long userId = 1L;
        Long scheduleId = 1L;


    }
}