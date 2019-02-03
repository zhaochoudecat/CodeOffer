package chap02;

/**
 * Created by zhaochoudecat on 2019/1/26
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindIn2DArray {
    public boolean find(int target,int[][] array){
        if(array.length == 0 || array == null) return false;
        int i = array.length - 1, j = 0;// array[i][j]是左下角
        while(i >= 0 && j < array.length){
            if(target == array[i][j]){
                return true;
            }else if(target > array[i][j]){
                j++;
            }else if(target < array[i][j]){
                i--;
            }
        }
        return false;
    }
}
