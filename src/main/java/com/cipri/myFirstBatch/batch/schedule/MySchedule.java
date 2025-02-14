package com.cipri.myFirstBatch.batch.schedule;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {

    private final JobLauncher jobLauncher;
    private final Job helloJob;


    public MySchedule(JobLauncher jobLauncher, Job helloJob) {
        this.jobLauncher = jobLauncher;
        this.helloJob = helloJob;
    }

    @Scheduled(fixedDelayString = "${my.scheduled.task.fixed.delay}")
    public void performJob() throws Exception {
        jobLauncher.run(helloJob, new JobParametersBuilder()
                .addLong("time", System.currentTimeMillis()) // Parámetro único
                .toJobParameters());
    }

}
