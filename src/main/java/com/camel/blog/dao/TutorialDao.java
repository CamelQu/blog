/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao;

import java.util.List;

import com.camel.blog.bean.Tutorial;

/**
 * Created by QYD
 *
 * At 2015 下午5:30:22
 */
public interface TutorialDao {
    
    public List<Tutorial> getTutorialList(int start, int limit);

    public Tutorial getTutorial(int id);

    public List<String> getTutorialTitlesTopN(int top);
}
