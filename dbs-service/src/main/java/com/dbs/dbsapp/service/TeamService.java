package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.model.Team;

/**
 * @author EPAM
 */
public interface TeamService {
    /**
     *
     * @return
     */
    Iterable<Team> getAllTeams();

    /**
     *
     * @param newTeam
     * @return
     */
    Team createNewTeam(Team newTeam);

    /**
     *
     * @param teamId
     * @return
     */
    String deleteTeam(Long teamId);

    /**
     *
     * @param modifyTeam
     * @return
     */
    Team updateTeam(Team modifyTeam);

    /**
     *
     * @param teamId
     * @return
     */
    Team getTeam(Long teamId);

}
