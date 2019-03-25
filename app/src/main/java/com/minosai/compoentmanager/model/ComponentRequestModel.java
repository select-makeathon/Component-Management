package com.minosai.compoentmanager.model;

public class ComponentRequestModel {

    public static enum ComponentRequestStatus {
        PENDING, APPROVED
    }

    String id;
    String componentName;
    int count;
    ComponentRequestStatus status;

    public ComponentRequestModel() {
        status = ComponentRequestStatus.PENDING;
    }

    public ComponentRequestModel(String id, String componentName, int count, ComponentRequestStatus status) {
        this.id = id;
        this.componentName = componentName;
        this.count = count;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ComponentRequestStatus getStatus() {
        return status;
    }

    public void setStatus(ComponentRequestStatus status) {
        this.status = status;
    }
}
