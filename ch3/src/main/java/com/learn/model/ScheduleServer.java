package com.learn.model;

public class ScheduleServer {
    ScheduleServer scheduleServer = new ScheduleServer();

    scheduleServer.startBooting();
    scheduleServer.readSystemConfigFile();
    scheduleServer.init();
    scheduleServer.initializeContext();
    scheduleServer.initializeListeners();
    scheduleServer.createSystemObjects();
    System.out.println("Start working......");
    System.out.println("After work done.........");
}
