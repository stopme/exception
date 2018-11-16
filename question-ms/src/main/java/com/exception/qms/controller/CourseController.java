package com.exception.qms.controller;

import com.exception.qms.aspect.OperatorLog;
import com.exception.qms.enums.ResponseModelKeyEnum;
import com.exception.qms.enums.TopNavEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/16
 * @time 下午9:19
 * @discription 文档
 **/
@Controller
public class CourseController {

//    @Autowired
//    private RecommendedArticleBusiness recommendedArticleBusiness;

    @GetMapping("/course")
    @OperatorLog(description = "文档页展示")
    public String showDocumentPage(Model model) {
//        model.addAttribute(ResponseModelKeyEnum.RESPONSE.getCode(), recommendedArticleBusiness.queryRecommendedArticleList(pageIndex, pageSize));
        model.addAttribute(ResponseModelKeyEnum.TOP_NAV.getCode(), TopNavEnum.DOCUMENT.getCode());
        return "course/course-list";
    }

    @GetMapping("/course/{courseId}")
//    @OperatorLog(description = "优文详情展示页")
    public String showArticleDetail(@PathVariable("courseId") Long courseId, Model model) {
//        model.addAttribute(ResponseModelKeyEnum.RESPONSE.getCode(), recommendedArticleBusiness.queryArticleDetail(articleId));
        model.addAttribute(ResponseModelKeyEnum.TOP_NAV.getCode(), TopNavEnum.DOCUMENT.getCode());
        return "course/course-detail";
    }
}