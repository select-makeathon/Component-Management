package com.minosai.compoentmanager.model;

public class QaModel {

    String id;
    String teamName;
    String personName;
    String time;
    String question;
    String answer;

    public QaModel() {

    }

    public QaModel(String id, String teamName, String personName, String time, String question, String answer) {
        this.id = id;
        this.teamName = teamName;
        this.personName = personName;
        this.time = time;
        this.question = question;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
