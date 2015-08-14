package com.zuozuo.service.dao.mysql.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zuozuo on 15-8-14.
 */
public class UserDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public String getNameById(long id) {
        return sqlSessionTemplate.selectOne("GET-NAME-BY-ID", id);
    }
}
