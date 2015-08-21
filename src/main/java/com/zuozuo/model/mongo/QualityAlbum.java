package com.zuozuo.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zuozuo on 15-8-20.
 */
@Document(collection = "quality_album")
public class QualityAlbum {

    @Id private long id;

    @Field private List<String> tags;

    @Field(value = "like_count") private int likeCount;

    @Field(value = "bloginfo") private Map<String, Object> blogInfo;

    private int count;

    private String desc;

    @Field(value = "last_blog_t") private Date lastBlogTime;

    @Field(value = "create_datetime") private Date createDatetime;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public Map<String, Object> getBlogInfo() {
        return blogInfo;
    }

    public void setBlogInfo(Map<String, Object> blogInfo) {
        this.blogInfo = blogInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getLastBlogTime() {
        return lastBlogTime;
    }

    public void setLastBlogTime(Date lastBlogTime) {
        this.lastBlogTime = lastBlogTime;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
