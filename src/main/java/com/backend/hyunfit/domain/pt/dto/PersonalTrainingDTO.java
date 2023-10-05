package com.backend.hyunfit.domain.pt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonalTrainingDTO {
    private Long ptSeq;
    private Long mbrSeq;
    private Long trnSeq;
    private Long ptrSeq;
    private String mbrName;
    private Integer ptCounts;
    private Timestamp ptReservationDate;
    private Timestamp ptLessonDuration;
    private Timestamp ptLessonStartDate;
    private Timestamp ptLessonEndDate;
    private Integer ptReservationStatus;
    private String ptCancellationReason;
    private String ptNoteStickers;
    private String ptrCreationDate;
    private String ptrStickers;
    private String ptrContent;
    private Double ptrRating;
    private String trnName;
    private String trnId;
    private String trnType;
    private String trnTypeName;
    private String trnProfileUrl;
    private String trnShortDescription;
}
