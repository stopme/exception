package com.exception.qms.business;

import com.exception.qms.domain.entity.User;
import com.exception.qms.model.form.course.EditCourseChapterForm;
import com.exception.qms.model.form.course.PublishCourseForm;
import com.exception.qms.model.vo.course.EditCourseChapterResponseVO;
import com.exception.qms.model.vo.course.QueryCourseContentResponseVO;
import site.exception.common.BaseResponse;
import site.exception.common.PageQueryResponse;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/16
 * @time 下午9:19
 * @discription
 **/
public interface CourseBusiness {

    PageQueryResponse queryCoursePageList(Integer pageIndex, Integer pageSize);

    QueryCourseContentResponseVO queryCourseContent(String courseEnTitle, String chapterEnTitle);

    BaseResponse publishCourse(PublishCourseForm publishCourseDTO, User user);

    EditCourseChapterResponseVO showEditChapterPage(String courseEnTitle, String chapterEnTitle);

    BaseResponse editChapter(EditCourseChapterForm editCourseChapterForm, User user);

    boolean pushToBaidu(String courseEnTitle, String chapterEnTitle);
}
