/**
 * The copyright od this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.camel.blog.bean.TechArticle;
import com.camel.blog.dao.TechArticleDao;

/**
 * Created by QYD
 *
 * At 2015 下午9:41:14
 */
@Repository("techArticleDao")
public class TechArticleDaoImpl extends SqlMapClientDaoSupport implements TechArticleDao {

    @Override
    public TechArticle getTechArticle(String regionCode, String labelCode, Date publishDate) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("regionCode", regionCode);
        params.put("labelCode", labelCode);
        params.put("publishDate", publishDate);
        return (TechArticle) getSqlMapClientTemplate().queryForObject("techArticle.getTechArticle", params);
    }
    
    @Override
    public List<TechArticle> getTechArticleListByLabelCode(String labelCode) {
        return (List<TechArticle>) getSqlMapClientTemplate().queryForList("techArticle.getTechArticleListByLabel", labelCode);
    }
    
    @Override
    public List<TechArticle> getTechArticleListByRegionCode(String regionCode) {
        return (List<TechArticle>) getSqlMapClientTemplate().queryForList("techArticle.getTechArticleListByRegionCode", regionCode);
    }

}
