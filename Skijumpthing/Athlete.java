package Skijumpthing;

public class Athlete {
    private String name;
    private String sport;
    private int hoursTraining;

    // Constructor
    public Athlete(String name, String sport, int hoursTraining) {
        this.name = name;
        this.sport = sport;
        this.hoursTraining = hoursTraining;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getHoursTraining() {
        return hoursTraining;
    }

    // Train method
    public void train() {
        hoursTraining++;
        System.out.println(name + " has trained for one more hour. Total hours: " + hoursTraining);
    }
}
