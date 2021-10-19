package com.giovane.soccer.contract.facade;

import com.giovane.soccer.model.request.TeamRequestController;
import com.giovane.soccer.model.response.TeamResponseController;

public interface TeamControllerFacade {

    TeamResponseController saveTeam(TeamRequestController teamController);

}
