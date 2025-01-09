package com.movie.movieapi.interfaces.movie;

import com.movie.movieapi.response.Response;
import com.movie.moviedomain.movie.MovieService;
import com.movie.moviedomain.movie.dto.MovieInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @PostMapping
    public Response<?> getMovies() {
        List<MovieInfo.Get> response = movieService.getMovies();
        return Response.success();
    }

}
