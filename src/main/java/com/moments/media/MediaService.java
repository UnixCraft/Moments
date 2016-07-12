package com.moments.media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yasin on 11/07/2016.
 */
@Service
public class MediaService {

    @Autowired
    private ImageRepository repository;

    public Image getImage(Long imageId){
        return repository.findOne(imageId);
    }

    public List<Image> getImagesByUser(Long userId){
        return repository.findByUserId(userId);
    }

}
