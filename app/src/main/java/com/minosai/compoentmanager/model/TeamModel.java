package com.minosai.compoentmanager.model;

import java.util.ArrayList;
import java.util.List;

public class TeamModel {

    private String teamName;
    private String teamId;
    private UserModel teamLeader;
    private List<UserModel> teamMembers;
    private List<UserModel> memberRequests;
    private AbstractModel abstractModel;
    private boolean isSelected;
    private List<ComponentRequestModel> componentRequests;

    public TeamModel() {

    }

    public TeamModel(String teamName, String teamId, UserModel teamLeader, List<UserModel> teamMembers, List<UserModel> memberRequests, AbstractModel abstractModel, boolean isSelected, List<ComponentRequestModel> componentRequests) {
        this.teamName = teamName;
        this.teamId = teamId;
        this.teamLeader = teamLeader;
        this.teamMembers = teamMembers;
        this.memberRequests = memberRequests;
        this.abstractModel = abstractModel;
        this.isSelected = isSelected;
        this.componentRequests = componentRequests;
    }

    public TeamModel(String teamName, String teamId, UserModel teamLeader, List<UserModel> teamMembers, List<UserModel> memberRequests, AbstractModel abstractModel, boolean isSelected) {
        this.teamName = teamName;
        this.teamId = teamId;
        this.teamLeader = teamLeader;
        this.teamMembers = teamMembers;
        this.memberRequests = memberRequests;
        this.abstractModel = abstractModel;
        this.isSelected = isSelected;
        this.componentRequests = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public UserModel getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(UserModel teamLeader) {
        this.teamLeader = teamLeader;
    }

    public List<UserModel> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<UserModel> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public List<UserModel> getMemberRequests() {
        return memberRequests;
    }

    public void setMemberRequests(List<UserModel> memberRequests) {
        this.memberRequests = memberRequests;
    }

    public AbstractModel getAbstractModel() {
        return abstractModel;
    }

    public void setAbstractModel(AbstractModel abstractModel) {
        this.abstractModel = abstractModel;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public List<ComponentRequestModel> getComponentRequests() {
        if (componentRequests == null) {
            componentRequests = new ArrayList<>();
        }
        return componentRequests;
    }

    public void setComponentRequests(List<ComponentRequestModel> componentRequests) {
        this.componentRequests = componentRequests;
    }
}

