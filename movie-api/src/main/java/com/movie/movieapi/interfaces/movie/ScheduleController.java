package com.movie.movieapi.interfaces.movie;

import com.movie.movieapi.interfaces.movie.dto.ScheduleDto;
import com.movie.moviedomain.response.Response;
import com.movie.moviedomain.movie.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping
    public Response<List<ScheduleDto.Get>> getSchedules() {
        scheduleService.getSchedules();
        return Response.success();
    }

}
