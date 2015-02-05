import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by wangbailin on 15-2-5.
 */
public class GameTest {
    @Test
    public void should_print_welcome_first_when_game_start(){
      PrintStream out =   mock(PrintStream.class);
        Game game = new Game(out);
        verify(out,never()).println("welcome");
        game.game();
        verify(out).println("welcome");
    }
    @Test
    public void should_print_please_input_your_answer_second_when_game_start(){
      PrintStream out =    mock(PrintStream.class);
        Game game = new Game(out);
        game.game();
        //测试顺序是否相同
        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome");
        inOrder.verify(out).println("please input your answer(6)");

    }


}
