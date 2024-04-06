package Practice.Array;

import java.util.Random;

//生成验证码
public class Demo2 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25){
                //添加小写字母
                chs[i] = (char)(97 + i);
            }
            else {
                //添加大写字母
                chs[i] = (char) (65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for(int i = 0;i < 4;i++){
            //随机索引
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        int number = r.nextInt(10);
        result = result + number;
        System.out.print(result);
    }
}
//