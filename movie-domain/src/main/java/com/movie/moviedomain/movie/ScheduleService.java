package com.movie.moviedomain.movie;

import com.movie.moviedomain.movie.dto.ScheduleInfo;
import com.movie.moviedomain.movie.dto.TheaterInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public List<ScheduleInfo.Get> getSchedules() {
        return scheduleRepository.getSchedules().stream()
                .map(ScheduleInfo.Get::from)
                .toList();
    }

}
