package com.browze.MarsRover.factory;

import com.browze.MarsRover.controller.PlateauControllerImpl;
import com.browze.MarsRover.controller.RobotControllerImpl;
import com.browze.MarsRover.service.MarsRoverService;
import com.browze.MarsRover.service.MarsRoverServiceImpl;

public class ServiceFactory {

    private static MarsRoverService marsRoverService;

    public static MarsRoverService getMarsRoverService() {
        if (marsRoverService == null) {
            marsRoverService =
                    new MarsRoverServiceImpl(
                            new RobotControllerImpl(),
                            new PlateauControllerImpl());
        }
        return marsRoverService;
    }

}
