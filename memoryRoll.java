import JSHOP2.*;
import java.util.Random;

public class memoryRoll implements Calculate {
  public Term call(List w) {
    // Generate random value
    Random ran = new Random();
    int ranValue = ran.nextInt(4) + 1;
    System.out.println("Memory Chosen: " + ranValue);

    // Return random value
  	return new TermNumber(ranValue);
  }
}
