package hhplus.lecture.infrastructure.persistence;

import hhplus.lecture.domain.dto.LectureDto;
import hhplus.lecture.domain.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class LectureRepositoryImpl implements LectureRepository {

    private final JpaLectureRepository jpaLectureRepository;

    @Override
    public Optional<LectureDto> getLecture(Long lectureId) {

        return jpaLectureRepository.findById(lectureId)
                .map(lectureEntity -> LectureDto.builder()
                        .id(lectureEntity.getId())
                        .lectureName(lectureEntity.getLectureName())
                        .instructorName(lectureEntity.getInstructorName())
                        .build());
    }

}
