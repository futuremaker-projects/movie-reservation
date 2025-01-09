package com.movie.moviedomain.movie.domain;

import com.movie.moviedomain.enums.FilmRating;
import com.movie.moviedomain.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private Long id;

    private String title;
    private LocalDateTime releasedAt;
    private String thumbnailUrl;
    private String runningTime;

    private FilmRating filmRating;
    private Genre genre;

}
