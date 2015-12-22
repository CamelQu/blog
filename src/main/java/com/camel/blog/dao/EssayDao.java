/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao;

import java.util.List;

import com.camel.blog.bean.Essay;

/**
 * Created by QYD
 *
 * At 2015 下午4:23:53
 */
public interface EssayDao {
    
    public List<Essay> getEssayList(int start, int limit);
    
    public Essay getEssay(int id);
    
    public List<String> getEssayTitlesTopN(int top);
    
}
