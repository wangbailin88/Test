import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by wangbailin on 15-2-5.
 */
public class Game {
    private PrintStream out;
    private AnswerGenerator answerGenerator;
    private BufferedReader bufferedReader;
   private CompareNumber compareNumber;
    public Game(PrintStream out,AnswerGenerator answerGenerator,BufferedReader bufferedReader,CompareNumber compareNumber){
        this.out = out;
        this.bufferedReader = bufferedReader;
        this.compareNumber = compareNumber;
        this.answerGenerator = answerGenerator;
    }
     public void game() throws IOException {
         int chance = 6;
         out.println("welcome");
         while(chance >=1){
             out.println("please input your answer("+chance+")");
             String input = answerGenerator.randAnswer();
             String answer = bufferedReader.readLine();
             String result = compareNumber.rand(input,answer);
             if("4A0B".equals(result)){
                 out.println("congratulation");
                 return;
             }
                 out.println(result);

                 chance--;

         }
         out.println("game over");


     }
}
