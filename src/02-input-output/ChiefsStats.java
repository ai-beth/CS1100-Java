//ChiefsStats.java
//print the desired table to show the chiefs stats


public class ChiefsStats {
    public static void main(String[] args) {
        //variables
        String team = "Chiefs";
        int week = 4;
        int wins = 1;
        int losses = 2;
        int tie = 0;
        double pct = 0.333333333;

        //print the header
        System.out.printf("%s Week %d Statistics\n", team, week);
        //print the column titles
        System.out.printf("Wins Loss Tie  Pct\n");
        //print the stats
        System.out.printf("%4d %4d %3d  %.3f\n", wins, losses, tie, pct);

    }
}
