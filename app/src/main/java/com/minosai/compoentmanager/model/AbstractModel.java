package com.minosai.compoentmanager.model;

import java.util.ArrayList;

public class AbstractModel {

    private String problemStatementId;
    private String ideaAbstract;
    private String ideaUniquness;
    private String ideaUseCases;
    private String attachmentName;
    private String attachmentUrl;
    private ArrayList<Component> components;
    private boolean isFinal;
    private String extraComponents;

    public AbstractModel() {

    }

    public AbstractModel(String problemStatementId, String ideaAbstract, String ideaUniquness, String ideaUseCases, String attachmentName, String attachmentUrl, ArrayList<Component> components, boolean isFinal, String extraComponents) {
        this.problemStatementId = problemStatementId;
        this.ideaAbstract = ideaAbstract;
        this.ideaUniquness = ideaUniquness;
        this.ideaUseCases = ideaUseCases;
        this.attachmentName = attachmentName;
        this.attachmentUrl = attachmentUrl;
        this.components = components;
        this.isFinal = isFinal;
        this.extraComponents = extraComponents;
    }

    public String getProblemStatementId() {
        return problemStatementId;
    }

    public void setProblemStatementId(String problemStatementId) {
        this.problemStatementId = problemStatementId;
    }

    public String getIdeaAbstract() {
        return ideaAbstract;
    }

    public void setIdeaAbstract(String ideaAbstract) {
        this.ideaAbstract = ideaAbstract;
    }

    public String getIdeaUniquness() {
        return ideaUniquness;
    }

    public void setIdeaUniquness(String ideaUniquness) {
        this.ideaUniquness = ideaUniquness;
    }

    public String getIdeaUseCases() {
        return ideaUseCases;
    }

    public void setIdeaUseCases(String ideaUseCases) {
        this.ideaUseCases = ideaUseCases;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public String getExtraComponents() {
        return extraComponents;
    }

    public void setExtraComponents(String extraComponents) {
        this.extraComponents = extraComponents;
    }
}
