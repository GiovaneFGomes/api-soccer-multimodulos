package com.giovane.soccer.facade.league;

import com.giovane.soccer.exceptions.notfound.NotFoundException;
import com.giovane.soccer.mapper.league.response.LeagueServiceResponseMapper;
import com.giovane.soccer.model.entity.League;
import com.giovane.soccer.model.league.request.LeagueRequestService;
import com.giovane.soccer.model.league.response.LeagueResponseService;
import com.giovane.soccer.repository.LeagueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.giovane.soccer.mapper.league.request.LeagueServiceRequestMapper.toLeagueEntity;
import static com.giovane.soccer.mapper.league.response.LeagueServiceResponseMapper.toLeagueServiceResponse;

@AllArgsConstructor
@Service
public class LeagueServiceImpl implements LeagueServiceFacade {

    private final LeagueRepository repository;

    public LeagueResponseService saveLeague(LeagueRequestService league) {
        League leagueSave = toLeagueEntity(league);
        League leagueResponse = repository.save(leagueSave);
        return toLeagueServiceResponse(leagueResponse);
    }

    public LeagueResponseService updateLeagueById(LeagueRequestService league, Integer id) {
        League leagueId = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        league.setId(leagueId.getId());
        League leagueSave = toLeagueEntity(league);
        League leagueResponse = repository.save(leagueSave);
        return toLeagueServiceResponse(leagueResponse);
    }

    public void deleteLeagueById(Integer id) {
        repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        repository.deleteById(id);
    }

    public LeagueResponseService findLeagueById(Integer id) {
        League leagueResponse = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return toLeagueServiceResponse(leagueResponse);
    }

    public List<LeagueResponseService> findAllLeagues() {
        return repository.findAll().stream()
                .map(LeagueServiceResponseMapper::toLeagueServiceResponse)
                .toList();
    }

}
