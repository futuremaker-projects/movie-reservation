package com.movie.moviestorage.movie.repository;

import com.movie.moviedomain.movie.ScheduleRepository;
import com.movie.moviedomain.movie.domain.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ScheduleRepositoryImpl implements ScheduleRepository {

    private final ScheduleJpaRepository scheduleJpaRepository;

    @Override
    public List<Schedule> getSchedules() {
        return null;
//        return scheduleJpaRepository.findAll();
    }
}
