package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.domain.dto.LectureDto;
import hhplus.lecture.domain.repository.LectureRepository;
import hhplus.lecture.infrastructure.model.entity.LectureEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureRepositoryImpl implements LectureRepository {

    private final JpaLectureRepository jpaLectureRepository;

    @Override
    public LectureDto getLecture(Long lectureId) {

        LectureEntity lectureE = jpaLectureRepository.findById(lectureId)
                .orElseThrow(() -> new RuntimeException("강의를 찾을 수 없습니다."));

        return LectureDto.builder()
                .id(lectureE.getId())
                .lectureName(lectureE.getLectureName())
                .instructorName(lectureE.getInstructorName())
                .build();
    }

}
