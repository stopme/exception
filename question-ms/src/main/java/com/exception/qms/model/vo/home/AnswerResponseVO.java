package com.exception.qms.model.vo.home;

import com.exception.qms.domain.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author jiangbing(江冰)
 * @date 2018/4/5
 * @time 下午6:24
 * @discription
 **/
@Data
public class AnswerResponseVO implements Serializable {
    private Long id;

    private LocalDateTime createTime;
    private String createDateStr;
    private String createTimeStr;

    private Long createUserId;

    private Long latestEditorUserId;
    private String latestEditorUserAvatar;
    private String latestEditorUserName;
    private String latestEditorTimeStr;

    private Long questionId;

    private Integer voteUp;

    private Integer voteDown;

    /**
     * 当前用户是否已经点赞
     */
    private Boolean isCurrentUserVoteUp;

    private Boolean isAccepted;

    private String descriptionCnHtml;

    private User user;
}
