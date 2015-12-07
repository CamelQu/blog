/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.camel.blog.bean.TechArticle;
import com.camel.blog.service.TechService;

/**
 * Created by QYD
 *
 * At 2015 下午11:42:17
 */
@RestController
public class TechRequest {
    private static final Logger LOG = Logger.getLogger(TechRequest.class);

    @Autowired
    private TechService         techService;

    /**
     * 获取单个博文信息
     * @param articleId 博文id
     * @return
     */
    @RequestMapping(value = "/tech/{articleId}.html")
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

    /**
     * 获取博客列表
     * 
     * @param label 根据标签名获取，不是必须参数
     * @return
     */
    @RequestMapping(value = "/tech/list.do")
    public ModelAndView getTechListByLabel(@RequestParam(value = "label", required = false) String label,
                                           @RequestParam(value = "region", required = false) String region) {
        ModelAndView mv = new ModelAndView("techList");
        try {
            if (label != null && (!label.equals(""))) {
                List<TechArticle> articleList = techService.getTechArticleListByLabel(label);
                mv.addObject("data", articleList);
                mv.addObject("code", 200);
                mv.addObject("success", true);
            } else {
                mv.addObject("code", 200);
                mv.addObject("success", false);
            }
            
            if (region != null && (!region.equals(""))) {
                List<TechArticle> articleList = techService.getTechArticleListByRegion(region);
                mv.addObject("data", articleList);
                mv.addObject("code", 200);
                mv.addObject("success", true);
            } else {
                mv.addObject("code", 200);
                mv.addObject("success", false);
            }
            return mv;
        } catch (Exception e) {
            LOG.error("method getTechListByLabel has an error!", e);
            mv.addObject("code", 500);
            mv.addObject("success", false);
            return mv;
        }
    }

}
