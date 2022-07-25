package com.javapandeng.po;



public class Car {
    private Integer id;
    private Integer itemId;
    private Item item;
    private Integer userId;
    private Integer num;
    private double price;
    private String total;

    public Car(Integer id, Integer item_id, Item item, Integer userId, Integer num, double price, String total) {
        this.id = id;
        this.itemId = item_id;
        this.item = item;
        this.userId = userId;
        this.num = num;
        this.price = price;
        this.total = total;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer item_id) {
        this.itemId = item_id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", item_id=" + itemId +
                ", item=" + item +
                ", userId=" + userId +
                ", num=" + num +
                ", price=" + price +
                ", total='" + total + '\'' +
                '}';
    }
}
