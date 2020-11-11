package com.techelevator.example.controller;

import com.techelevator.example.model.Vote;
import com.techelevator.example.model.VoteDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
@PreAuthorize("isAuthenticated()")
public class VoteController {

    private List<Vote> allVoters = new ArrayList<>();

    @PostMapping("/vote")
    public Vote castVote(@Valid @RequestBody VoteDTO voteDTO, Principal principal) {
        Vote newVote = new Vote();
        newVote.setYesOrNo(voteDTO.getYesOrNo());
        newVote.setUsername(principal.getName());
        return newVote;
    }

}
