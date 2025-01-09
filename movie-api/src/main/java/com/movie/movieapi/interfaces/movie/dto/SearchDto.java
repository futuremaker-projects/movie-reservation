package com.movie.movieapi.interfaces.movie.dto;

import com.movie.moviedomain.movie.dto.MovieCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class SearchDto {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Movie {
        private Long id;
        private LocalDateTime searchDate;



    }



}
