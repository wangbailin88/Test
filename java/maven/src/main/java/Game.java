import java.io.PrintStream;

/**
 * Created by wangbailin on 15-2-5.
 */
public class Game {
    private PrintStream out;
    public Game(PrintStream out){
        this.out = out;
    }
     public void game(){
         out.println("welcome");
         out.println("please input your answer(6)");

     }
}
