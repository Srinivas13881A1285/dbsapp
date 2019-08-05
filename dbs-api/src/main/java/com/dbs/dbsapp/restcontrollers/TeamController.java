package com.dbs.dbsapp.restcontrollers;

import com.dbs.dbsapp.dao.model.Team;
import com.dbs.dbsapp.service.TeamService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public Iterable<Team> getTeams(){
        return this.teamService.getAllTeams();
    }

    @GetMapping("/team/{teamId}")
    public Team getTeam(@PathVariable(value = "teamId")final Long teamId){
            return this.teamService.getTeam(teamId);
    }

    @PostMapping("/new")
    public Team createNewTeam(@RequestBody Team newTeam){
        return this.teamService.createNewTeam(newTeam);
    }

    @PutMapping("/update")
    public Team updateTeam(@RequestBody Team modifyTeam){
        return this.teamService.updateTeam(modifyTeam);
    }

    @DeleteMapping("/delete/{teamId}")
    public String deleteTeam(@PathVariable("teamId")Long teamId){
        return this.teamService.deleteTeam(teamId);
    }
}
