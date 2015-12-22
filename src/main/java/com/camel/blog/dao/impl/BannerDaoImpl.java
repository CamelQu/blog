/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.camel.blog.bean.Banner;
import com.camel.blog.dao.BannerDao;

/**
 * Created by QYD
 *
 * At 2015 上午11:13:32
 */
@Repository("bannerDao")
public class BannerDaoImpl extends SqlMapClientDaoSupport implements BannerDao {

    @Override
    public List<String> getBannerPicPathTopN(int top) {
        return (List<String>) getSqlMapClientTemplate().queryForList("banner.getBannerPicPathTopN", top);
    }

    @Override
    public Banner getBannerArticleById(String id) {
        return (Banner) getSqlMapClientTemplate().queryForObject("banner.getBannerArticleById", id);
    }

}
