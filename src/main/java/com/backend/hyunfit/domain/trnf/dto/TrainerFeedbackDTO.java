package com.backend.hyunfit.domain.trnf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainerFeedbackDTO {
    private Long trnfSeq;
    private Long trnSeq;
    private Long mbrSeq;
    private String mbrName;
    private String trnfContent;
    private Timestamp trnfCreationDate;
    private Timestamp trnfWrittenDate;
    private Timestamp trnfReportModDate;
    private Timestamp trnfSubmissionDue;
    private String targetMonth;
    private String content;
}
