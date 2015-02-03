/**
 * Created by wangbailin on 15-2-3.
 */
public class CompareNumber {
    public String rand(String answer,String ran){
              //记录数字和位置正确的个数
              int a = 0;
              //记录数字正确但位置不正确的个数
              int b = 0;

        for(int i = 0; i <answer.length();i++){
            //判断当前阶段答案字符是否等于用户输入当前阶段的字符,如果等于a加1
            if(answer.substring(i,i+1) .equals(ran.substring(i,i+1)) ){
                a = a +1;
            }else {
                //判断上一层截断的答案字符是否等于用户输入的字符,如果等于b加一
                for(int x = 0; x<ran.length();x++){
                    if(answer.substring(i,i+1) .equals(ran.substring(x,x+1) ) ){
                        b = b + 1;
                    }
                }
            }
        }
                return  a + "A" + b+"B";
    }
}
