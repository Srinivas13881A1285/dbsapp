package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.model.Team;
import com.dbs.dbsapp.dao.repos.TeamRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {


    private TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    @Override
    public Iterable<Team> getAllTeams() {
        return this.teamRepository.findAll();
    }

    @Override
    public Team createNewTeam(Team newTeam) {
        return this.teamRepository.save(newTeam);
    }

    @Override
    public String deleteTeam(Long teamId) {
        this.teamRepository.deleteById(teamId);
        return "deleted";
    }

    @Override
    public Team updateTeam(Team modifyTeam) {
        return this.teamRepository.save(modifyTeam);
    }

    @Override
    public Team getTeam(Long teamId) {
        return this.teamRepository.findById(teamId).get();
    }
}
