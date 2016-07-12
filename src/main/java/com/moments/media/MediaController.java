package com.moments.media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yasin on 11/07/2016.
 */
@RestController()
@RequestMapping("users/{userId}/media")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Image> getImagesByUser(@PathVariable Long userId){
        return mediaService.getImagesByUser(userId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Image getImage(@RequestParam Long imageId){
        return mediaService.getImage(imageId);
    }

}
