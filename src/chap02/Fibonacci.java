package chap02;

/**
 * Created by zhaochoudecat on 2019/1/24
 */
public class Fibonacci {
    //迭代法
    public int fib2(int n){
        if(n <= 0)return 0;
        int a = 0;
        int b = 1;
        while(n > 0){
            b = a + b;
            a = b - a;//a + b - a = b,将原来的b赋值给a
            n--;
        }
        return a;//从 0 1开始的，所以是a
    }

    //递归
    public int fib(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return fib(n-2) + fib(n-1);
    }
}
