
/**
 * Runner for Problem Set 3.
 * Instructions at https://github.com/kellylougheed/java-pset3
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        System.out.println("Problem 3-0: Ouija Board");
        OuijaBoard ouija = new OuijaBoard();
        // Call askQuestion and answer on ouija
        
        System.out.println("Problem 3-1: Seating Chart");
        SeatingChart chart = new SeatingChart();
        // Make and print a seating chart
        
        System.out.println("Problem 3-2: Budget Tracker");
        // Create a BudgetTracker with a budget of $2000
        // Make four purchases, repeating one category once
        // Print the most frequency category
        
        System.out.println("Problem 3-3: Word Frequency");
        WordFrequency wf = new WordFrequency();
        String[] arg = {};
        wf.main(arg);
    }
}
