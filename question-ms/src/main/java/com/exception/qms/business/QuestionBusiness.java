package com.exception.qms.business;

import com.exception.qms.web.dto.question.request.ChangeQuestionVoteUpRequestDTO;
import com.exception.qms.web.dto.question.request.QuestionViewNumIncreaseRequestDTO;
import com.exception.qms.web.form.question.QuestionForm;
import com.exception.qms.web.form.question.QuestionUpdateForm;
import com.exception.qms.web.vo.common.QuestionListItemResponseVO;
import com.exception.qms.web.vo.home.QuestionDetailResponseVO;
import com.exception.qms.web.vo.home.QuestionInfoResponseVO;
import com.exception.qms.web.vo.tag.QueryQuestionTagPageListResponseVO;
import site.exception.common.BaseResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/16
 * @time 下午9:19
 * @discription
 **/
public interface QuestionBusiness {

    QuestionDetailResponseVO queryQuestionDetail(Long questionId, Long userId);

    QuestionInfoResponseVO queryQuestionInfo(Long questionId);

    /**
     * 添加问题（包括标题，问题描述，以及解决方案）
     * @param questionForm
     * @return
     */
    BaseResponse addQuestion(QuestionForm questionForm, Long userId);

    BaseResponse updateQuestion(QuestionUpdateForm questionUpdateForm, Long userId);

    BaseResponse increaseQuestionViewNum(QuestionViewNumIncreaseRequestDTO questionViewNumIncreaseDTO, HttpServletRequest request);

    BaseResponse changeQuestionVoteUp(ChangeQuestionVoteUpRequestDTO changeQuestionVoteUpRequestDTO, Long userId);

    QueryQuestionTagPageListResponseVO<QuestionListItemResponseVO> queryQuestionTagPageList(Long tagId, Integer pageIndex, Integer pageSize, String tab);
}
