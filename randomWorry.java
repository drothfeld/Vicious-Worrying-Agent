import JSHOP2.*;
import java.util.Random;

public class randomWorry implements Calculate {
  public Term call(List w) {
    // Generate random value
    Random ran = new Random();
    int ranValue = ran.nextInt(8) + 3;
    System.out.println("Random WORRY value generated: " + ranValue);

    // Return random value
  	return new TermNumber(ranValue);
  }
}
