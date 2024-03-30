package Sy1;
import java.util.Scanner;

public class NiZhi {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scanner=new Scanner(System.in);
        String str =scanner.nextLine();
        String[] number =str.split(" ");
        int[] nums=new int[number.length];
        for(int i=0;i< number.length;i++) {
            nums[i] = Integer.parseInt(number[i]);
        }
        int t;
        for(int start=0,end= nums.length-1;start<end;start++,end--) {
            t = nums[start];
            nums[start]=nums[end];
           nums[end] = t;
        }
for(int i=0;i<nums.length;i++)
    System.out.print(nums[i]+"\t\t");
    }
}
