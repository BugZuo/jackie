package com.zuozuo.dao.impl;

import com.zuozuo.dao.IUserDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zuozuo on 15-8-19.
 */
public class UserDAOImpl implements IUserDAO {
    @Autowired private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public String getNameById(long id) {
        return sqlSessionTemplate.selectOne("getNameById", id);
    }

    //    public String getNameById(long id) {
    //        return sqlSessionTemplate.selectOne("GET-NAME-BY-ID", id);
    //    }
    //


}
