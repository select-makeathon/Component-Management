package com.minosai.compoentmanager.model;

import java.util.List;

public class ProblemTrack {

    String trackName;
    List<ProblemStatements> problemStatements;

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public ProblemTrack() {
    }

    public List<ProblemStatements> getProblemStatements() {
        return problemStatements;
    }

    public void setProblemStatements(List<ProblemStatements> problemStatements) {
        this.problemStatements = problemStatements;
    }
}
