package com.moments.media;

import com.moments.MomentsApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by Yasin on 11/07/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class TestMediaService {

    @Autowired
    private MediaService unit;

    @Autowired
    private ImageRepository repository;

    @Test
    public void testFindImageByUser(){
        List<Image> images = unit.getImagesByUser(1L);
        Assert.assertTrue(images != null);
        Assert.assertTrue(!images.isEmpty());
    }

}
