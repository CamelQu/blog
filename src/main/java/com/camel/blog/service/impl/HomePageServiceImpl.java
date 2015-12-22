/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camel.blog.bean.Banner;
import com.camel.blog.dao.BannerDao;
import com.camel.blog.dao.EssayDao;
import com.camel.blog.dao.TechArticleDao;
import com.camel.blog.dao.TutorialDao;
import com.camel.blog.service.HomePageService;

/**
 * Created by QYD
 *
 * At 2015 下午3:26:00
 */
@Service("homePageService")
public class HomePageServiceImpl implements HomePageService {
    private static final Logger LOG = Logger.getLogger(HomePageServiceImpl.class);
    private final int           TOP = 5;

    @Autowired
    private BannerDao           bannerDao;
    @Autowired
    private TechArticleDao      techArticleDao;
    @Autowired
    private TutorialDao         tutorialDao;
    @Autowired
    private EssayDao            essayDao;

    @Override
    public List<String> getTechArticleTitles() {
        try {
            return techArticleDao.getTechArticleTitlesTopN(TOP);
        } catch (Exception e) {
            LOG.error("getTechArticleTitles has an error!", e);
            return new ArrayList<String>();
        }
    }

    @Override
    public List<String> getTutorialArticleTitles() {
        try {
            return tutorialDao.getTutorialTitlesTopN(TOP);
        } catch (Exception e) {
            LOG.error("getTutorialArticleTitles has an error!", e);
            return new ArrayList<String>();
        }
    }

    @Override
    public List<String> getEssayArticleTitles() {
        try {
            return essayDao.getEssayTitlesTopN(TOP);
        } catch (Exception e) {
            LOG.error("getEssayArticleTitles has an error!", e);
            return new ArrayList<String>();
        }
    }

    @Override
    public List<String> getBannerList() {
        try {
            return bannerDao.getBannerPicPathTopN(TOP);
        } catch (Exception e) {
            LOG.error("getEssayArticleTitles has an error!", e);
            return new ArrayList<String>();
        }
    }

}
