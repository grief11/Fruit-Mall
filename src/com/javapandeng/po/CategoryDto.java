package com.javapandeng.po;

import java.util.List;

public class CategoryDto {
    private ItemCategory father;
    private List<ItemCategory> childrens;

    public CategoryDto(ItemCategory father, List<ItemCategory> childrens) {
        this.father = father;
        this.childrens = childrens;
    }

    public CategoryDto() {
    }

    public ItemCategory getFather() {
        return father;
    }

    public void setFather(ItemCategory father) {
        this.father = father;
    }

    public List<ItemCategory> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<ItemCategory> childrens) {
        this.childrens = childrens;
    }
}
