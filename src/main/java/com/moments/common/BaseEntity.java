package com.moments.common;

/**
 * Created by Yasin on 12/07/2016.
 */
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "IS_DELETED")
    private Boolean isDeleted = Boolean.FALSE;

    @Version
    @Column(name = "VERSION")
    private int version = 0;

    public BaseEntity() {
        super();
    }

    public long getId() {
        return id;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public int getVersion() {
        return version;
    }
}
