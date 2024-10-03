package hhplus.lecture.domain.repository;

import hhplus.lecture.domain.dto.LectureDto;

public interface LectureRepository {

    LectureDto getLecture(Long lectureId);
}
