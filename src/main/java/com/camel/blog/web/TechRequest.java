/**
 * The copyright od this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.camel.blog.bean.TechArticle;
import com.camel.blog.service.TechService;

/**
 * Created by QYD
 *
 * At 2015 下午11:42:17
 */
public class TechRequest {
    private static final Logger LOG = Logger.getLogger(TechRequest.class);

    @Autowired
    private TechService         techService;

    @RequestMapping(value = "/tech/{articleId}")
    public ModelAndView getTechArticle(@PathVariable String articleId) {
        try {
            TechArticle techArticle = techService.getTechArticleById(articleId);
            if (techArticle == null || techArticle.getContent().equals("") || techArticle.getTitle().equals("")) {
                ModelAndView mv = new ModelAndView("techError");
                return mv;
            } else {
                ModelAndView mv = new ModelAndView("techArticle");
                mv.addObject("title", techArticle.getTitle());
                mv.addObject("publishDate", techArticle.getPublishDate());
                mv.addObject("count", techArticle.getCount());
                mv.addObject("author", techArticle.getAuthor());
                mv.addObject("email", techArticle.getEmail());
                mv.addObject("content", techArticle.getContent());
                return mv;
            }
        } catch (Exception e) {
            LOG.error("getTechArticle has an error!", e);
            ModelAndView mv = new ModelAndView("techError");
            return mv;
        }
    }

}
