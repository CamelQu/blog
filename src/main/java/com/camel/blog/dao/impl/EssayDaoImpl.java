/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.camel.blog.bean.Essay;
import com.camel.blog.dao.EssayDao;

/**
 * Created by QYD
 *
 * At 2015 下午4:25:47
 */
@Repository("essayDao")
public class EssayDaoImpl extends SqlMapClientDaoSupport implements EssayDao {

    @Override
    public List<Essay> getEssayList(int start, int limit) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("start", start);
        params.put("limit", limit);
        return (List<Essay>) getSqlMapClientTemplate().queryForList("essay.getEssayList", params);
    }

    @Override
    public Essay getEssay(int id) {
        return (Essay) getSqlMapClientTemplate().queryForObject("essay.getEssay", id);
    }

    @Override
    public List<String> getEssayTitlesTopN(int top) {
        return (List<String>) getSqlMapClientTemplate().queryForList("essay.getEssayTitlesTopN", top);
    }

}
