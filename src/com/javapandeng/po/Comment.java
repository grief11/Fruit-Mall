package com.javapandeng.po;

import java.util.Date;

public class Comment {
    private Integer id;
    private Integer userId;
    private User user;
    private Integer itemId;
    private String content;
    private Date addTime;

    public Comment(Integer id, Integer userId, User user, Integer itemId, String content, Date addTime) {
        this.id = id;
        this.userId = userId;
        this.user = user;
        this.itemId = itemId;
        this.content = content;
        this.addTime = addTime;
    }

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
