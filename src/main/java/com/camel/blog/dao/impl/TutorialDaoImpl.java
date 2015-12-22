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

import com.camel.blog.bean.Tutorial;
import com.camel.blog.dao.TutorialDao;

/**
 * Created by QYD
 *
 * At 2015 下午5:31:00
 */
@Repository("tutorialDao")
public class TutorialDaoImpl extends SqlMapClientDaoSupport implements TutorialDao {

    @Override
    public List<Tutorial> getTutorialList(int start, int limit) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("start", start);
        params.put("limit", limit);
        return (List<Tutorial>) getSqlMapClientTemplate().queryForList("tutorial.getTutorialList", params);
    }

    @Override
    public Tutorial getTutorial(int id) {
        return (Tutorial) getSqlMapClientTemplate().queryForObject("tutorial.getTutorial", id);
    }

    @Override
    public List<String> getTutorialTitlesTopN(int top) {
        return (List<String>) getSqlMapClientTemplate().queryForList("tutorial.getTutorialTitlesTopN", top);
    }

}
