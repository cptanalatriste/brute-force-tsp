package aco.intro;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Main {

    private static void solveTsp(Map<String, Map<String, Integer>> distanceMap) {

        Instant start = Instant.now();
        BruteForceTsp solver = new BruteForceTsp();
        List<String> optimalRoute = solver.findOptimalRoute(distanceMap);
        Instant end = Instant.now();
        System.out.println("Optimal route: " + optimalRoute);
        System.out.println("Optimal distance (miles): " + TravellingHelper.calculateDistance(optimalRoute, distanceMap));
        System.out.println("Execution time (milliSeconds): " + Duration.between(start, end).toMillis());
    }

    public static void main(String[] args) {

        System.out.println("Solving very small problem ");
        solveTsp(TravellingHelper.getVerySmallProblem());

        System.out.println("Solving small problem ");
        solveTsp(TravellingHelper.getSmallProblem());


    }
}
