/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.service;

import java.util.List;

/**
 * Created by QYD
 *
 * At 2015 上午10:46:41
 */
public interface HomePageService {
    
    public List<String> getTechArticleTitles();
    
    public List<String> getTutorialArticleTitles();
    
    public List<String> getEssayArticleTitles();
    
    public List<String> getBannerList();

}
