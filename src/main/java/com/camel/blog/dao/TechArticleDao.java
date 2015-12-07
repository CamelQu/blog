/**
 * The copyright od this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao;

import java.util.List;
import java.util.Date;

import com.camel.blog.bean.TechArticle;

/**
 * Created by QYD
 *
 * At 2015 下午11:20:10
 */
public interface TechArticleDao {
    
    public TechArticle getTechArticle(String regionCode, String labelCode, Date publishDate);
    
    public List<TechArticle> getTechArticleListByLabelCode(String labelCode);
    
    public List<TechArticle> getTechArticleListByRegionCode(String regionCode);
    
}
