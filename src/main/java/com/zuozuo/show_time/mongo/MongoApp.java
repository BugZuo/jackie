package com.zuozuo.show_time.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zuozuo on 15-8-19.
 */
public class MongoApp {

    private static final Log log = LogFactory.getLog(MongoApp.class);

    @Autowired
    public Mongo mongo;

    public static void main(String[] args) {
//        MongoOperations mongoOps = new MongoTemplate(new Mongo(), "database");
//        mongoOps.insert(new Person("joe", 34));
//
//        log.info(mongoOps.findOne(new Query(where("name").is("joe")), Person.class));
//
//        mongoOps.dropCollection("person");
        AppConfig appConfig = new AppConfig();
        MongoApp mongoApp = new MongoApp();
        try {
//            Mongo mongo = appConfig.mongo();
            System.out.println(mongoApp.mongo.getAddress());
            DB albumDB = mongoApp.mongo.getDB("albumDB");
            DBCollection qualityAlbum = albumDB.getCollection("quality_album");
            DBObject item = qualityAlbum.findOne();
            System.out.println(item.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
