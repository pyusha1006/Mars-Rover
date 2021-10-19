package com.browze.MarsRover;

import com.browze.MarsRover.domain.RoverRobot;
import com.browze.MarsRover.factory.ServiceFactory;
import com.browze.MarsRover.service.MarsRoverService;

import java.util.Scanner;

public class Main {

    /**
     * Main method of Mars Rover problem
     * @param args arguments
     */

    public static void main(String[] args) throws Exception {
        MarsRoverService marsRoverService = ServiceFactory.getMarsRoverService();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        RoverRobot roverRobot;
        while (true) {
            int roverX = scanner.nextInt();
            int roverY = scanner.nextInt();
            char roverOrientation = scanner.next().charAt(0);
            String instructions = scanner.next();

            roverRobot = marsRoverService.solve(x, y, roverX, roverY, roverOrientation, instructions);

            System.out.print(roverRobot.getX());
            System.out.print(' ');
            System.out.print(roverRobot.getY());
            System.out.print(' ');
            System.out.println( roverRobot.getOrientation());
        }
    }

}