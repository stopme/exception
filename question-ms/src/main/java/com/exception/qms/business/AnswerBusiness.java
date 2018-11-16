package com.exception.qms.business;

import com.exception.qms.model.dto.question.request.ChangeAnswerVoteUpRequestDTO;
import com.exception.qms.model.form.answer.AnswerUpdateForm;
import com.exception.qms.model.vo.home.AnswerInfoResponseVO;
import site.exception.common.BaseResponse;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/16
 * @time 下午9:19
 * @discription
 **/
public interface AnswerBusiness {

    AnswerInfoResponseVO queryAnswerInfo(Long answerId);

    Long updateAnswer(AnswerUpdateForm answerUpdateForm, Long userId);

    BaseResponse changeAnswerVoteUp(ChangeAnswerVoteUpRequestDTO changeAnswerVoteUpRequestDTO, Long userId);
}
