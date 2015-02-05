import com.sun.org.apache.bcel.internal.generic.LineNumberGen;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;


/**
 * Created by wangbailin on 15-2-5.
 */
public class GameTest {
    private PrintStream out;
    private Game game;
    private BufferedReader buff;
    private  AnswerGenerator answerGenerator;
    private  CompareNumber compareNumber;
    @Before
    public void set_up() throws IOException {
       out =   mock(PrintStream.class);
        buff =  mock(BufferedReader.class);
        answerGenerator =  mock(AnswerGenerator.class);
        compareNumber = new CompareNumber();
        game = new Game(out,answerGenerator,buff,compareNumber);
        given(buff.readLine()).willReturn("1234");
        given(answerGenerator.randAnswer()).willReturn("4321");
    }
    @Test
    public void should_print_welcome_first_when_game_start() throws IOException {
        verify(out,never()).println("welcome");
        game.game();
        verify(out).println("welcome");
    }
    @Test
    public void should_print_please_input_your_answer_second_when_game_start() throws IOException {
        game.game();
        //测试顺序是否相同
        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome");
        inOrder.verify(out).println("please input your answer(6)");
    }

    @Test
    public void should_print_compare_result_when_answer_is_wrong() throws IOException {

        game.game();
        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome");
        inOrder.verify(out).println("please input your answer(6)");
        inOrder.verify(out).println("0A4B");

    }
   @Test
   public void should_reduce_chance_one_when_answer_is_wrong() throws IOException {
        game.game();
       InOrder inOrder = inOrder(out);
       inOrder.verify(out).println("welcome");
       inOrder.verify(out).println("please input your answer(6)");
       inOrder.verify(out).println("0A4B");
       inOrder.verify(out).println("please input your answer(5)");
   }

}
