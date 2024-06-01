import main.java.Tally;

public class TallyDriver {

    public static void main(String[] args) {
        
       Tally tally = new Tally();
        
        System.out.println("Tally: " + tally.getTally());
        
        tally.addBy(5);
        
        System.out.println("Tally: " + tally.getTally());
        
        tally.subtractBy(2);
        
        System.out.println("Tally: " + tally.getTally());

        tally.multiplyBy(3);
        
        System.out.println("Tally: " + tally.getTally());
    }
}
