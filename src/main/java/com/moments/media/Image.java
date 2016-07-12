package com.moments.media;

import com.moments.common.BaseEntity;
import com.moments.user.User;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;


/**
 * Created by Yasin on 11/07/2016.
 */
@Entity(name = "IMAGES")
@Where(clause = "IS_DELETED <> '1'")
@SQLDelete(sql = "UPDATE IMAGES SET IS_DELETED = '1' WHERE ID = ? AND VERSION = ?", check = ResultCheckStyle.COUNT)
public class Image extends BaseEntity{

    private String imageURL;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "USERS_ID")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
