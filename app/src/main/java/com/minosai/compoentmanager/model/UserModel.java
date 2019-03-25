package com.minosai.compoentmanager.model;

public class UserModel {

    private String name;
    private String email;
    private String regNo;
    private String hashPassword;
    private String whatsNo;
    private String phNo;
    private boolean isVitian;
    private String collegeName;
    private boolean isHosteler;
    private String hostelBlock;
    private String roomNo;
    private String branch;
    private String gender;
    private String skillSet;
    private String teamName;
    private boolean isLeader;
    private boolean isJoined;
    private String scratchUniqueKey;

    public UserModel() {

        setLeader(false);
        setJoined(false);
        setGender("Not preferred to say");

    }

    public UserModel(String name, String email, String regNo, String hashPassword, String whatsNo, String phNo, boolean isVitian, String collegeName, boolean isHosteler, String hostelBlock, String roomNo, String branch, String gender, String skillSet, String teamName, boolean isLeader, boolean isJoined, String scratchUniqueKey) {
        this.name = name;
        this.email = email;
        this.regNo = regNo;
        this.hashPassword = hashPassword;
        this.whatsNo = whatsNo;
        this.phNo = phNo;
        this.isVitian = isVitian;
        this.collegeName = collegeName;
        this.isHosteler = isHosteler;
        this.hostelBlock = hostelBlock;
        this.roomNo = roomNo;
        this.branch = branch;
        this.gender = gender;
        this.skillSet = skillSet;
        this.teamName = teamName;
        this.isLeader = isLeader;
        this.isJoined = isJoined;
        this.scratchUniqueKey = scratchUniqueKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getWhatsNo() {
        return whatsNo;
    }

    public void setWhatsNo(String whatsNo) {
        this.whatsNo = whatsNo;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public boolean isVitian() {
        return isVitian;
    }

    public void setVitian(boolean vitian) {
        isVitian = vitian;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public boolean isHosteler() {
        return isHosteler;
    }

    public void setHosteler(boolean hosteler) {
        isHosteler = hosteler;
    }

    public String getHostelBlock() {
        return hostelBlock;
    }

    public void setHostelBlock(String hostelBlock) {
        this.hostelBlock = hostelBlock;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public boolean isJoined() {
        return isJoined;
    }

    public void setJoined(boolean joined) {
        isJoined = joined;
    }

    public String getScratchUniqueKey() {
        return scratchUniqueKey;
    }

    public void setScratchUniqueKey(String scratchUniqueKey) {
        this.scratchUniqueKey = scratchUniqueKey;
    }
}
