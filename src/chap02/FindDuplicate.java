package chap02;

import java.util.Arrays;

/**
 * Created by zhaochoudecat on 2019/1/24
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2或者3。
 */
public class FindDuplicate {
    //先排序，然后对比相邻的元素
    public boolean duplicate(int numbers[],int lenght,int[] duplicate){
        if(numbers.length == 0 || numbers == null) return false;

        //排序
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == numbers[i+1]){
                duplicate[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    /*相当于排序，将numbers[i]的值放在对应的序号上，如numbers[2] = 2，因为题目要求元素值在0 - n-1，所以这样
    * 效率最高。
    */
    public boolean duplicate2(int[] numbers,int length,int[] duplicate){
        if(numbers.length == 0 || numbers == null) return false;

        //判断数组值是否在0- n-1之间
        for(int i : numbers){
            if(i < 0 || i > numbers.length - 1){
                return false;
            }
        }

        for(int i = 0; i < numbers.length; i++){
            while(numbers[i] != i){
                if(numbers[i] == numbers[numbers[i]]){
                    duplicate[0] = numbers[i];
                    return true;
                }
                swap(numbers,i,numbers[i]);
            }
        }
        return false;

    }
    private void swap(int[] nums,int p,int q){
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}
