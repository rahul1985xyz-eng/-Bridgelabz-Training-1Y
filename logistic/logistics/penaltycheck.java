package logistic.logistics;

public class penaltycheck {
    public static double calculatePenalty(String checkpointType, int expectedTime, int actualTime) {
        int delay = actualTime - expectedTime;
        if (delay <= 0)
            return 0;

        switch (checkpointType.toLowerCase()) {
            case "delivery":
                return delay * 2.0;
            case "fuel":
                return 10.0;
            case "rest":
                if (delay > 30) {
                    return delay * 0.5;
                }
                return 0;
            default:
                return 0;
        }
    }
}


