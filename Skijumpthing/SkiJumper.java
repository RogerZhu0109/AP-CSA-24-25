package Skijumpthing;

public class SkiJumper extends Athlete implements Flier {
    private int numberOfJumps;

    public SkiJumper(String name, String sport, int hoursTraining, int numberOfJumps) {
        super(name, sport, hoursTraining);
        this.numberOfJumps = numberOfJumps;
    }

    public void fly() {
        System.out.println("Fly!! yay");
    }

    public int getJumps() {
        return numberOfJumps;
    }

    public void train() {
        super.train();
        numberOfJumps++;
        System.out.println(getName() + " has completed another jump. Total jumps: " + numberOfJumps);
    }

}
