package com.movie.moviedomain.movie.dto;

import com.movie.moviedomain.movie.domain.Schedule;

import java.time.LocalDateTime;

public class ScheduleInfo {

    public record Get(
            Long id, TheaterInfo.Get theater,
            ScreenInfo.Get screen, MovieInfo.Get movie,
            LocalDateTime stateDate, LocalDateTime endDate
    ) {
        public static Get of(Long id, TheaterInfo.Get theater,
                             ScreenInfo.Get screen, MovieInfo.Get movie,
                             LocalDateTime stateDate, LocalDateTime endDate) {
            return new Get(id, theater, screen, movie, stateDate, endDate);
        }

        public static Get of(Long id, TheaterInfo.Get theater,
                             MovieInfo.Get movie,
                             LocalDateTime stateDate, LocalDateTime endDate) {
            return new Get(id, theater, null, movie, stateDate, endDate);
        }

        public static Get from(Schedule schedule) {
            return Get.of(
                    schedule.getId(),
                    TheaterInfo.Get.from(schedule.getTheater()),
                    MovieInfo.Get.from(schedule.getMovie()),
                    schedule.getStartTime(), schedule.getEndTime()
            );
        }
    }

}
