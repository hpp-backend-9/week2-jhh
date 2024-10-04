package hhplus.lecture.interfaces.api.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureRequest {
    private Long userId;
    private Long lectureScheduleId;
}
