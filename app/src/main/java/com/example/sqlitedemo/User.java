package com.example.sqlitedemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Unique;

@Entity(nameInDb = "user")
public class User {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "name")
    private String name;

    @Unique
    @NotNull
    @Property(nameInDb = "username")
    private String username;

    @Property(nameInDb = "created_at")
    private String createdAt;

    @Property(nameInDb = "updated_at")
    private String updateAt;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                '}';
    }

    public User(String name, String username, String createdAt, String updateAt) {
        this.name = name;
        this.username = username;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    @Generated(hash = 1852540016)
    public User(Long id, String name, @NotNull String username, String createdAt,
            String updateAt) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}
