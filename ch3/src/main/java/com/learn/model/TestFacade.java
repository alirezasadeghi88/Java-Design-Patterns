package com.learn.model;

public class TestFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer=new ScheduleServer();
        ScheduleServerFacade facadeServer=new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();
    }
}
