package com.zuozuo.model.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by zuozuo on 15-8-20.
 */
public class QualityAlbumDAO {

    @Autowired
    @Qualifier("albumDB")
    protected MongoTemplate albumDB;

    public String getDescById(long id) {
        Criteria criteria = Criteria.where("id").is(id);
        Query query = new Query(criteria);
        QualityAlbum qualityAlbum = albumDB.findOne(query, QualityAlbum.class);
        return qualityAlbum.getDesc();
    }
}
