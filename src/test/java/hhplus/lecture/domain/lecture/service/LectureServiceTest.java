package hhplus.lecture.domain.lecture.service;

import hhplus.lecture.domain.repository.LectureRepository;
import hhplus.lecture.domain.service.LectureService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LectureServiceTest {

    @Mock
    private LectureRepository lectureRepository;

    @InjectMocks
    private LectureService lectureService;

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
    @DisplayName("유효하지 않은 강의")
    void nullLecture() {

        // given
        Long lectureId = 1L;

        when(lectureRepository.getLecture(lectureId)).thenReturn(null);

        assertThrows(RuntimeException.class, () -> lectureService.getLecture(lectureId));
    }
  
}