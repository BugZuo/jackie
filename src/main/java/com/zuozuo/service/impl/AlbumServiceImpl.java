package com.zuozuo.service.impl;

import com.zuozuo.model.mongo.QualityAlbumDAO;
import com.zuozuo.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zuozuo on 15-8-20.
 */
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    private QualityAlbumDAO qualityAlbumDAO;

    public String getDescById(long id) {
        return qualityAlbumDAO.getDescById(id);
    }
}
