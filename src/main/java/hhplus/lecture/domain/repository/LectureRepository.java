package hhplus.lecture.domain.repository;

import hhplus.lecture.domain.dto.LectureDto;

import java.util.Optional;

public interface LectureRepository {

    Optional<LectureDto> getLecture(Long lectureId);
}
