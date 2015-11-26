/**
 * The copyright od this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.service;

import com.camel.blog.bean.TechArticle;
import com.camel.blog.bean.TechCode;

/**
 * Created by QYD
 *
 * At 2015 下午11:03:27
 */
public interface TechService {
    
    public TechCode getTechCodeByLabelName(String labelName);
    
    public TechArticle getTechArticleById(String articleId);
}
