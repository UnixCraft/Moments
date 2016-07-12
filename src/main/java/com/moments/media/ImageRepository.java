package com.moments.media;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Yasin on 11/07/2016.
 */
public interface ImageRepository extends JpaRepository<Image, Long> {

    List<Image> findByUserId(Long id);

}
