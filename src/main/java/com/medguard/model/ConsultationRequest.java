package com.medguard.model;

public class ConsultationRequest {
    private String patientIdentifier;
    private String chiefComplaint;
    private String historyOfPresentIllness;
    private String examinationFindings;
    private String provisionalDiagnosis;
    private String treatmentPlan;
    private String informedConsentDetails;
    private String followUpInstructions;
    private String warningSignsOrRedFlagsExplained;

    public ConsultationRequest() {
    }

    public String getPatientIdentifier() {
        return patientIdentifier;
    }

    public void setPatientIdentifier(String patientIdentifier) {
        this.patientIdentifier = patientIdentifier;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getHistoryOfPresentIllness() {
        return historyOfPresentIllness;
    }

    public void setHistoryOfPresentIllness(String historyOfPresentIllness) {
        this.historyOfPresentIllness = historyOfPresentIllness;
    }

    public String getExaminationFindings() {
        return examinationFindings;
    }

    public void setExaminationFindings(String examinationFindings) {
        this.examinationFindings = examinationFindings;
    }

    public String getProvisionalDiagnosis() {
        return provisionalDiagnosis;
    }

    public void setProvisionalDiagnosis(String provisionalDiagnosis) {
        this.provisionalDiagnosis = provisionalDiagnosis;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getInformedConsentDetails() {
        return informedConsentDetails;
    }

    public void setInformedConsentDetails(String informedConsentDetails) {
        this.informedConsentDetails = informedConsentDetails;
    }

    public String getFollowUpInstructions() {
        return followUpInstructions;
    }

    public void setFollowUpInstructions(String followUpInstructions) {
        this.followUpInstructions = followUpInstructions;
    }

    public String getWarningSignsOrRedFlagsExplained() {
        return warningSignsOrRedFlagsExplained;
    }

    public void setWarningSignsOrRedFlagsExplained(String warningSignsOrRedFlagsExplained) {
        this.warningSignsOrRedFlagsExplained = warningSignsOrRedFlagsExplained;
    }
}
