package com.company;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.FormatStyle;

import static java.time.format.DateTimeFormatter.ofLocalizedTime;

@Component
public class Scheduler {

    @Scheduled(cron = "* * * ? * *")
    public void getCurrentTime(){
        LocalTime currentTime = LocalTime.parse(LocalTime.now().format(ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println("It's now: " + currentTime);
    }
}
