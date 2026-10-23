package com.medguard.model;

import java.util.ArrayList;
import java.util.List;

public class ReviewResult {
    private int documentationScorePercent;
    private List<String> completedSections = new ArrayList<>();
    private List<String> flaggedSections = new ArrayList<>();
    private List<String> suggestions = new ArrayList<>();
    private String legalDisclaimer;

    public ReviewResult() {
        this.legalDisclaimer = "NOTICE: MedGuard AI is an educational checklist and documentation quality tool. "
                + "It does not evaluate clinical standards of care, determine medical negligence, "
                + "or replace professional legal counsel or statutory medical council regulations.";
    }

    public int getDocumentationScorePercent() {
        return documentationScorePercent;
    }

    public void setDocumentationScorePercent(int documentationScorePercent) {
        this.documentationScorePercent = documentationScorePercent;
    }

    public List<String> getCompletedSections() {
        return completedSections;
    }

    public void setCompletedSections(List<String> completedSections) {
        this.completedSections = completedSections;
    }

    public List<String> getFlaggedSections() {
        return flaggedSections;
    }

    public void setFlaggedSections(List<String> flaggedSections) {
        this.flaggedSections = flaggedSections;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    public String getLegalDisclaimer() {
        return legalDisclaimer;
    }

    public void setLegalDisclaimer(String legalDisclaimer) {
        this.legalDisclaimer = legalDisclaimer;
    }
}
