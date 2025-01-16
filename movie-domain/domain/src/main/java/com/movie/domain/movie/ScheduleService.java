package com.movie.domain.movie;

import com.movie.domain.movie.domain.Schedule;
import com.movie.domain.movie.domain.Screen;
import com.movie.domain.movie.dto.command.ScheduleCommand;
import com.movie.domain.movie.dto.info.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public List<ScheduleInfo.Get> getSchedules(Long theaterId) {
        List<Schedule> schedules = scheduleRepository.getSchedules(theaterId);

        Map<Screen, List<Schedule>> groupedByScreen = schedules.stream()
                .collect(Collectors.groupingBy(Schedule::getScreen));

        return groupedByScreen.entrySet().stream().map((entry) -> {
            List<TimeTableInfo.Get> timeTables = entry.getValue().stream()
                    .map(schedule -> TimeTableInfo.Get.of(schedule.getStartTime(), schedule.getEndTime()))
                    .toList();
            Schedule schedule = entry.getValue().get(0);

            return ScheduleInfo.Get.of(
                    schedule.getId(), TheaterInfo.Get.from(schedule.getTheater()),
                    ScreenInfo.Get.from(schedule.getScreen()), MovieInfo.Get.from(schedule.getMovie()),
                    timeTables
            );
        }).toList();
    }

    public List<ScheduleInfo.Get> getSchedules(ScheduleCommand.Search search) {
        return scheduleRepository.getSchedules(search);
    }

}
