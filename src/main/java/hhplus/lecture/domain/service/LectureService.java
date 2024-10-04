package hhplus.lecture.domain.service;

import hhplus.lecture.domain.dto.LectureDto;
import hhplus.lecture.domain.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureService {

    private final LectureRepository lectureRepository;

    public LectureDto getLecture(Long lectureId) {

        return lectureRepository.getLecture(lectureId)
                .orElseThrow(() -> new RuntimeException("유효하지 않은 강의입니다."));
    }

}
