package SamplePrograms.ArrayMethods;

public class SwimTimes {

    public static void main(String[] args) {
        String athletes[] = {"BOB", "SUE", "AMY", "JOE"};
        double times[][] = {
            {12.8, 14.2, 11.7},
            {13.8, 11.2},
            {10.9, 9.8, 10.7, 12.2},
            {12.8, 10.4}
        };
        double avgtimes[] = getAverages(times);
        for (int i = 0; i < athletes.length; i++) {
            System.out.print(athletes[i] + "\t");
            for (int j = 0; j < times[i].length; j++) {
                System.out.print(times[i][j] + " | ");
            }
            System.out.format("AVG: %.1f\n", avgtimes[i]);
        }
    }

    //method returns 1D array of average times, given a 2D grid of times
    public static double[] getAverages(double t[][]) {
        double avg[] = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                avg[i] += t[i][j];//adding up numbers in a row
            }
        }
        return avg;
    }
}
