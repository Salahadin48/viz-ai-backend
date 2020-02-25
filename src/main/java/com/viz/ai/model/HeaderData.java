package com.viz.ai.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.List.*;

@Getter
@Setter
@ToString
public class HeaderData {
    private Long id = autoGenerated();

    private Long autoGenerated() {
        return new Random().nextLong();
    }

    private String brandName;
    private List<HeaderLinkData> listItems;

    public HeaderData() {
    }

    public HeaderData(String brandName) {
        this.brandName = brandName;
        this.listItems = new ArrayList<>();
    }

    public HeaderData(String brandName, List<HeaderLinkData> listItems) {
        this.brandName = brandName;
        this.listItems = listItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<HeaderLinkData> getListItems() {
        return listItems;
    }

    public void setListItems(List<HeaderLinkData> listItems) {
        this.listItems = listItems;
    }

    @Override
    public String toString() {
        return "HeaderData{" +
                "brand='" + brandName + '\'' +
                ", listItems=" + listItems +
                '}';
    }
}
