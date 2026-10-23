package com.medguard.service;

import com.medguard.model.ConsultationRequest;
import com.medguard.model.ReviewResult;
import org.springframework.stereotype.Service;

@Service
public class DocumentationReviewService {

    public ReviewResult evaluateRecord(ConsultationRequest request) {
        ReviewResult result = new ReviewResult();
        int totalTrackedFields = 8;
        int completedCount = 0;

        if (hasText(request.getPatientIdentifier())) {
            completedCount++;
            result.getCompletedSections().add("Patient Identifier & Demographics");
        } else {
            result.getFlaggedSections().add("Patient Identifier");
            result.getSuggestions().add("Ensure a pseudo-anonymous identifier, age, and sex are documented.");
        }

        if (hasText(request.getChiefComplaint())) {
            completedCount++;
            result.getCompletedSections().add("Chief Complaint");
        } else {
            result.getFlaggedSections().add("Chief Complaint");
            result.getSuggestions().add("Specify the primary complaint along with patient-reported duration.");
        }

        if (hasText(request.getHistoryOfPresentIllness())) {
            completedCount++;
            result.getCompletedSections().add("History of Present Illness");
        } else {
            result.getFlaggedSections().add("History of Present Illness (HPI)");
            result.getSuggestions().add("Document chronological symptom evolution, negative responses, and prior medications.");
        }

        if (hasText(request.getExaminationFindings())) {
            completedCount++;
            result.getCompletedSections().add("Examination & Vitals");
        } else {
            result.getFlaggedSections().add("Examination Findings & Objective Vitals");
            result.getSuggestions().add("Ensure baseline vital signs (BP, Pulse, SpO2, Temperature) are recorded.");
        }

        if (hasText(request.getProvisionalDiagnosis())) {
            completedCount++;
            result.getCompletedSections().add("Working / Provisional Diagnosis");
        } else {
            result.getFlaggedSections().add("Provisional Diagnosis");
            result.getSuggestions().add("Note a preliminary differential or provisional diagnosis to justify the management strategy.");
        }

        if (hasText(request.getTreatmentPlan())) {
            completedCount++;
            result.getCompletedSections().add("Treatment Plan & Prescriptions");
        } else {
            result.getFlaggedSections().add("Treatment Plan");
            result.getSuggestions().add("Specify generic drug names, dose, route, duration, and instructions.");
        }

        if (hasText(request.getInformedConsentDetails())) {
            completedCount++;
            result.getCompletedSections().add("Informed Consent / Counseling");
        } else {
            result.getFlaggedSections().add("Informed Consent / Counseling Documentation");
            result.getSuggestions().add("Preventive Nudge: If invasive procedures or high-risk interventions were ordered, record that risks and alternatives were discussed.");
        }

        if (hasText(request.getFollowUpInstructions()) || hasText(request.getWarningSignsOrRedFlagsExplained())) {
            completedCount++;
            result.getCompletedSections().add("Discharge & Follow-Up Advice");
            if (!hasText(request.getWarningSignsOrRedFlagsExplained())) {
                result.getSuggestions().add("Best Practice: Explicitly document 'Red Flag' symptoms that require immediate ER return.");
            }
        } else {
            result.getFlaggedSections().add("Follow-Up & Emergency Red Flags");
            result.getSuggestions().add("Crucial Medico-Legal Defense: Document clear follow-up timeframes and emergency warning symptoms.");
        }

        int score = (int) Math.round(((double) completedCount / totalTrackedFields) * 100);
        result.setDocumentationScorePercent(score);

        return result;
    }

    private boolean hasText(String str) {
        return str != null && !str.trim().isEmpty();
    }
}
