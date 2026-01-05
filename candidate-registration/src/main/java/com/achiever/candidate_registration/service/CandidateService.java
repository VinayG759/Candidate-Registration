package com.achiever.candidate_registration.service;

import com.achiever.candidate_registration.model.Candidate;
import java.util.List;

public interface CandidateService {
    void registerCandidate(Candidate candidate);
    List<Candidate> getAllCandidates();
}
