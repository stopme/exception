package com.exception.qms.model.vo.article;

import com.exception.qms.model.vo.common.TagResponseVO;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/26
 * @time 上午11:12
 * @discription
 **/
@Data
public class RecommendedArticleDetailResponseVO implements Serializable {
    private Long id;

    private String publishTime;

    private String title;

    private String cover;

    /**
     * meta seo 字段
     */
    private String seoDescription;
    private String seoKeywords;

    private String content;
    /**
     * 公众号
     */
    private String gzh;
    private String author;

    private List<TagResponseVO> tags;

}
