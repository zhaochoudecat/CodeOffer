package chap02;

/**
 * Created by zhaochoudecat on 2019/1/17
 * 给你一根长度为n的绳子，把绳子剪成m段（m、n都是整数且m > 1, n > 1）,m段绳子的长度依然是整数，求m段绳子的长度乘积最大为多少？
 * 比如绳子长度为8，我们可以分成2段、3段、4段...8段，只有分成3段且长度分别是2、3、3时能得到最大乘积18
 * 动态规划
 */
public class CutString {
    public static int maxProductAfterCutting(int length){
        if(length < 2) return 0;
        if(length == 2) return 1; // 两段 1 * 1
        if(length == 3) return 2; //1 * 2
        int[] products = new int[length + 1];//从下标1开始算
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;//代表长度
        for(int i = 4; i <= length; i++){
            int max = 0;

            for(int j = 1; j <= i/2; j++){
                int product = products[i] * products[i - j];
                if(product > max) max = product;
            }
           products[i] = max;
        }
        return products[length];
    }
}
