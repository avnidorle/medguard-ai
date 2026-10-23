package com.medguard.controller;

import com.medguard.model.ConsultationRequest;
import com.medguard.model.ReviewResult;
import com.medguard.service.DocumentationReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    private final DocumentationReviewService reviewService;

    public ReviewController(DocumentationReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/check")
    public ResponseEntity<ReviewResult> checkDocumentation(@RequestBody ConsultationRequest request) {
        ReviewResult result = reviewService.evaluateRecord(request);
        return ResponseEntity.ok(result);
    }
}
