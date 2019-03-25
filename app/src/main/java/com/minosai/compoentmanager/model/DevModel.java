package com.minosai.compoentmanager.model;

public class DevModel {

    private String name;
    private String desig;
    private int iconId;
    private String url;

    public DevModel() {

    }

    public DevModel(String name, String desig, int iconId, String url) {
        this.name = name;
        this.desig = desig;
        this.iconId = iconId;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
