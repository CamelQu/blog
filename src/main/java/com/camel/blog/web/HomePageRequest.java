/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.camel.blog.bean.TechArticle;
import com.camel.blog.service.HomePageService;

/**
 * Created by QYD
 *
 * At 2015 上午10:41:34
 */
@RestController
public class HomePageRequest {
    private static final Logger LOG = Logger.getLogger(HomePageRequest.class);

    @Autowired
    private HomePageService homePageService;
    
    @RequestMapping(value = "/")
    public ModelAndView getHomePage() {
        try {
                ModelAndView mv = new ModelAndView("homePage");
                mv.addObject("banner", homePageService.getBannerList());
                mv.addObject("tech", homePageService.getTechArticleTitles());
                mv.addObject("tutorial", homePageService.getTutorialArticleTitles());
                mv.addObject("essay", homePageService.getEssayArticleTitles());
                return mv;
        } catch (Exception e) {
            LOG.error("getHomePage has an error!", e);
            ModelAndView mv = new ModelAndView("homeError");
            return mv;
        }
    }
}
