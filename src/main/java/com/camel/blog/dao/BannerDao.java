/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao;

import java.util.List;

import com.camel.blog.bean.Banner;

/**
 * Created by QYD
 *
 * At 2015 上午11:10:21
 */
public interface BannerDao {

    List<String> getBannerPicPathTopN(int top);

    Banner getBannerArticleById(String id);
    
}
