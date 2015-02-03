import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wangbailin on 15-2-3.
 */
public class CompareNumberTest {


    //测试是否返回4A0B
    @Test
    public void test_result_4A0B(){
         CompareNumber com = new CompareNumber();
         String result = com.rand("1234","1234");
        assertThat(result).isEqualTo("4A0B");
        System.out.print(result);
    }
    //测试是否返回3A0B
    @Test
    public void test_result_3A0B(){
        CompareNumber com = new CompareNumber();
        String result = com.rand("1534","1234");
        assertThat(result).isEqualTo("3A0B");
        System.out.print(result);
    }
    //测试是否返回0A4B
    @Test
    public void test_result_0A4B(){
        CompareNumber com = new CompareNumber();
        String result = com.rand("1534","4351");
        assertThat(result).isEqualTo("0A4B");
        System.out.print(result);
    }
    //测试是否返回2A2B
    @Test
    public void test_result_2A2B(){
        CompareNumber com = new CompareNumber();
        String result = com.rand("1534","1543");
        assertThat(result).isEqualTo("2A2B");
        System.out.print(result);
    }
    //测试是否返回0A0B
    @Test
    public void test_result_0A0B(){
        CompareNumber com = new CompareNumber();
        String result = com.rand("1234","6789");
        assertThat(result).isEqualTo("0A0B");
        System.out.print(result);
    }
    //测试是否返回2A1B
    @Test
    public void test_result_2A1B(){
        CompareNumber com = new CompareNumber();
        String result = com.rand("1234","1263");
        assertThat(result).isEqualTo("2A1B");
        System.out.print(result);
    }
}
