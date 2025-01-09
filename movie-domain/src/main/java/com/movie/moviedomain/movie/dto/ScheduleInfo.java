package com.movie.moviedomain.movie.dto;

import com.movie.moviedomain.movie.domain.Movie;

import java.time.LocalDateTime;

public class ScheduleInfo {

    public record Get(
            Long id, String theaterName,
            Long screenId, Movie movie,
            LocalDateTime stateDate, LocalDateTime endDate
    ) {
        public static Get of(Long id, String theaterName,
                             Long screenId, Movie movie,
                             LocalDateTime stateDate, LocalDateTime endDate) {
            return new Get(id, theaterName, screenId, movie, stateDate, endDate);
        }

        public Get from(Movie movie) {
            return null;
        }
    }

}
