/**
 * The copyright od this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camel.blog.bean.TechArticle;
import com.camel.blog.bean.TechCode;
import com.camel.blog.dao.TechArticleDao;
import com.camel.blog.dao.TechCodeDao;
import com.camel.blog.service.TechService;

/**
 * Created by QYD
 *
 * At 2015 下午11:12:59
 */
@Service("techService")
public class TechServiceImpl implements TechService {
    private static final Logger LOG = Logger.getLogger(TechServiceImpl.class);

    @Autowired
    private TechCodeDao         techCodeDao;
    @Autowired
    private TechArticleDao      techArticleDao;

    @Override
    public TechCode getTechCodeByLabelName(String labelName) {
        return techCodeDao.getTechCodeByLabelName(labelName);
    }

    @Override
    public TechArticle getTechArticleById(String articleId) {
        if (articleId == null || articleId.trim().equals("")) {
            LOG.error("method getTechArticleById has input an illegle parameter:" + articleId);
            return null;
        } else {
            try {
                String regionCode = articleId.substring(0, 1);
                String labelCode = articleId.substring(1, 2);
                long timestamps = Long.parseLong(articleId.substring(2));
                Date publishDate = new Date(timestamps);

                return techArticleDao.getTechArticle(regionCode, labelCode, publishDate);
            } catch (Exception e) {
                LOG.error("getTechArticleById has an error!", e);
                return null;
            }
        }
    }

}
