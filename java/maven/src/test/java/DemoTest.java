import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


/**
 * Created by wangbailin on 15-2-2.
 */
public class DemoTest {
   @Test
   public void should_return_string_hello(){
      Demo demo =  new Demo();
       String result = demo.say();
       assertThat(result).isEqualTo("hello");
       System.out.print(result);
   }
}
