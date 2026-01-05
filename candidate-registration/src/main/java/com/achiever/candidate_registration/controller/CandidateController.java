package com.achiever.candidate_registration.controller;

import com.achiever.candidate_registration.model.Candidate;
import com.achiever.candidate_registration.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/candidates")  // <------ Plural Route
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    // Show registration page
    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("candidate", new Candidate());
        return "candidate-register";  // File exists in templates
    }

    // Handle form submission
    @PostMapping("/register")
    public String registerCandidate(@ModelAttribute Candidate candidate) {
        candidateService.registerCandidate(candidate);
        return "success";   // SUCCESS PAGE
    }

    // Show candidate list page
    @GetMapping("/list")
    public String listCandidates(Model model) {
        model.addAttribute("candidates", candidateService.getAllCandidates());
        return "candidate-list";
    }
}
