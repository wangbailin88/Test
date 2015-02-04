import java.util.ArrayList;
import java.util.Random;

/**
 * Created by wangbailin on 15-2-4.
 */
public class AnswerGenerator {
  private Random random;
   private final ArrayList<String> historyGenerateNumbers;
    public AnswerGenerator(Random random){
        this.historyGenerateNumbers = new ArrayList<String>();
        this.random = random;
    }
    public String randAnswer(){
         String digit = generateOnce();
        while(historyGenerateNumbers.contains(digit)){
            digit = randAnswer();
        }
        if(historyGenerateNumbers.size() ==2){
            historyGenerateNumbers.remove(0);
        }

        historyGenerateNumbers.add(digit);
        return digit;
    }
    private String generateOnce() {
        StringBuffer str = new StringBuffer();
        while (str.length() < 4){
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
