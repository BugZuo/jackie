package com.zuozuo.show_time.mongo;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoFactoryBean;

import java.net.UnknownHostException;

/**
 * Created by zuozuo on 15-8-19.
 */
@Configuration
@Deprecated
public class AppConfig {

    public @Bean Mongo mongo() throws UnknownHostException {
        return new Mongo("localhost");
    }

    public @Bean MongoFactoryBean mongoBean() {
        MongoFactoryBean mongo = new MongoFactoryBean();
        mongo.setHost("localhost");
        return mongo;
    }
}
