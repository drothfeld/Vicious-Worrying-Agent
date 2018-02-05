import JSHOP2.*;
import java.util.Random;

public class randomEat implements Calculate {
  public Term call(List n) {
    // Generate random value
    Random ran = new Random();
    int ranValue = ran.nextInt(11) + 1;
    System.out.println("Random Value Generated: " + ranValue);

    // Return random value
  	return new TermNumber(ranValue);
  }
}
