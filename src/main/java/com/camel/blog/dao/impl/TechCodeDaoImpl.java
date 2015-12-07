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

import com.camel.blog.bean.TechCode;
import com.camel.blog.dao.TechCodeDao;

/**
 * Created by QYD
 *
 * At 2015 下午7:50:18
 */
@Repository("techCodeDao")
public class TechCodeDaoImpl extends SqlMapClientDaoSupport implements TechCodeDao {

    @Override
    public List<TechCode> getAllTechCode() {
        return (List<TechCode>) getSqlMapClientTemplate().queryForList("techCode.getTechCodeAll");
    }

    @Override
    public List<TechCode> getTechCodeByRegionCode(String regionCode) {
        return (List<TechCode>) getSqlMapClientTemplate().queryForList("techCode.getTechCodeByRegionCode", regionCode);
    }

    @Override
    public List<TechCode> getTechCodeByRegionName(String regionName) {
        return (List<TechCode>) getSqlMapClientTemplate().queryForList("techCode.getTechCodeByRegionName", regionName);
    }

    @Override
    public TechCode getTechCodeByLabelName(String labelName) {
        return (TechCode) getSqlMapClientTemplate().queryForObject("techCode.getTechCodeByLabelName", labelName);
    }
    
    @Override
    public String getRegionCodeByRegionName(String regionName) {
        return (String) getSqlMapClientTemplate().queryForObject("techCode.getRegionCodeByRegionName", regionName);
    }

}
