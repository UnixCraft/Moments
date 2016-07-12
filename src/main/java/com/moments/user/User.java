package com.moments.user;

import com.moments.common.BaseEntity;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;

/**
 * Created by Yasin on 11/07/2016.
 */
@Entity(name = "USERS")
@Where(clause = "IS_DELETED <> '1'")
@SQLDelete(sql = "UPDATE USERS SET IS_DELETED = '1' WHERE ID = ? AND VERSION = ?", check = ResultCheckStyle.COUNT)
public class User extends BaseEntity {

    private String fullName;
    private String username;
    private String profilePicture;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
