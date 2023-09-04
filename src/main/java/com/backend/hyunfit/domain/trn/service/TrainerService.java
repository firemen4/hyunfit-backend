package com.backend.hyunfit.domain.trn.service;

import com.backend.hyunfit.domain.trn.dto.TrainerDTO;
import com.backend.hyunfit.global.exception.BusinessException;


public interface TrainerService {
    /**
     * 트레이너별 예약현황을 가져오는 메서드입니다.
     *
     * @param trnSeq trnSeq를 전달햡니다.
     * @return TrainerDTO pt정보를 List<ptDTO>에 담아 이를 포함한 TrainerDTO를 반환합니다.
     * @throws BusinessException 입력된 trnSeq에 해당하는 Pt 정보가 없을 경우 발생하는 예외입니다.
     *                          이 예외는 // 에러 코드와 함께 발생합니다.
     */
    TrainerDTO selectAllPtBytrnSeq(String trnSeq);
    /**
     * 피드백 중 작성되지않은 피드백현황을 가져오는 메서드입니다.
     *
     * @param trnSeq trnSeq를 전달햡니다.
     * @return TrainerDTO 피드백정보를 List<feedbackDTO>에 담아 이를 포함한 TrainerDTO를 반환합니다.
     * @throws BusinessException 입력된 trnSeq의 피드백이 전부 작성되어있을 경우 발생하는 예외입니다.
     *                          이 예외는 // 에러 코드와 함께 발생합니다.
     */
    TrainerDTO selectNoFeedbackBytrnSeq(String trnSeq);
}
