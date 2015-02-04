
import org.junit.Test;

import java.util.HashSet;
import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.Assertions.fail;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

/**
 * Created by wangbailin on 15-2-4.
 */
public class AnswerGeneratorTest {
    @Test
    public void should_not_int() {
        Random random  = mock(Random.class);
        AnswerGenerator answer = new AnswerGenerator(random);
        String result = answer.randAnswer();
        System.out.print(result);
        try {
            Integer.parseInt(result);
        } catch (NumberFormatException ex) {
            fail("result should be a number");
        }
    }
    @Test
    public void should_not_length_4(){
        Random random  = mock(Random.class);
        AnswerGenerator answer = new AnswerGenerator(random);
        String result = answer.randAnswer();
        assertThat(result.length()).isEqualTo(4);
    }
    @Test
    public void should_not_number(){



    }
    @Test
    public void test_up_method(){

        Random random  = mock(Random.class);
        AnswerGenerator answer = new AnswerGenerator(random);
        given(random.nextInt(10))
                .willReturn(1,2,3,4)
                .willReturn(2,3,4,5)
                .willReturn(3,4,5,6)
                .willReturn(7,8,9,0);
        HashSet<String> set = new HashSet<String>();
        set.add(answer.randAnswer());
        set.add(answer.randAnswer());
        set.add(answer.randAnswer());
        assertThat(set.size()).isEqualTo(3);
        System.out.print(answer.randAnswer());

    }

}
