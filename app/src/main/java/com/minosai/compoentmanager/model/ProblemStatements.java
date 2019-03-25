package com.minosai.compoentmanager.model;

public class ProblemStatements {

    private String problemStatement;
    private String details;
    private String id;

    public ProblemStatements() {
    }

    public ProblemStatements(String problemStatement, String details, String id) {
        this.problemStatement = problemStatement;
        this.details = details;
        this.id = id;
    }


    public String getProblemStatement() {
        return problemStatement;
    }

    public void setProblemStatement(String problemStatement) {
        this.problemStatement = problemStatement;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
