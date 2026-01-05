package com.achiever.candidate_registration.service;

import com.achiever.candidate_registration.model.Candidate;
import com.achiever.candidate_registration.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public void registerCandidate(Candidate candidate) {
        candidate.setStatus("REGISTERED");
        candidateRepository.save(candidate);
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }
}
