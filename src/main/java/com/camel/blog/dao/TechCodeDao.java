/**
 * The copyright od this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao;

import java.util.List;

import com.camel.blog.bean.TechCode;

/**
 * Created by QYD
 *
 * At 2015 下午7:39:07
 */
public interface TechCodeDao {
    
    public List<TechCode> getAllTechCode();
    
    public List<TechCode> getTechCodeByRegionCode(String regionCode);
    
    public List<TechCode> getTechCodeByRegionName(String regionName);
    
    public TechCode getTechCodeByLabelName(String labelName);

}
