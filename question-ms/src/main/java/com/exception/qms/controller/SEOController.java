package com.exception.qms.controller;

import com.exception.qms.business.SEOBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.exception.common.BaseResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/16
 * @time 下午9:19
 * @discription SEO
 **/
@Controller
@Slf4j
public class SEOController {

    @Autowired
    private SEOBusiness seoBusiness;

    /**
     * 主动推送所有问题的连接给百度
     *
     * @return
     */
    @GetMapping("/seo/baidu/pushAllQuestion")
    @ResponseBody
    public BaseResponse pushAllQuestion() {
        return seoBusiness.pushAllQuestion();
    }

    /**
     * site map
     *
     * @return
     */
    @GetMapping("/sitemap.xml")
    public void sitemapXml(HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.APPLICATION_XML_VALUE);
        Writer writer = response.getWriter();
        writer.append(seoBusiness.createSiteMapXmlContent());
    }

    /**
     * robots txt
     *
     * @return
     */
    @GetMapping("/robots.txt")
    public void robotsTxt(HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        String lineSeparator = System.getProperty("line.separator", "\n");
        writer.append("User-agent: *").append(lineSeparator);
        writer.append("Disallow: ").append("/question/tag/*").append(lineSeparator);
        writer.append("Disallow: ").append("/user/*").append(lineSeparator);
        writer.append("Disallow: ").append("/answer/*/edit").append(lineSeparator);
        writer.append("Disallow: ").append("/question/*/edit").append(lineSeparator);
    }

}
