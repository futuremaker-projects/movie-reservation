package com.movie.storage.movie.dto.statement;

import com.movie.common.enums.Genre;

public class ScheduleStatement {

    public record Search(String movieName, Genre genre) {
        public static Search of(String movieName, Genre genre) {
            return new Search(movieName, genre);
        }
    }

}
