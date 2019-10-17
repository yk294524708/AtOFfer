package cn.icrn.Demo10;
/**
 * Created by yan on 2016/10/8.
 * 10.二进制中1的个数
 * 输入一个整数，输出该数二进制表示中1的个数。
 * 其中负数用补码表示。
 */
public class Solution {
    public int  NumberOf1(int n) {
         int count = 0;
         while(n!=0){
             n=n&(n-1);
             count++;
         }
    	return count;
    }
}