package Sy1;

public class YangHui {
    public static void main(String[] args) {
        int i,j;
        int Level=10;
        int iaYong[][]=new int[Level][];
        System.out.println("杨辉三角形");
        for(i=0;i<iaYong.length;i++)
            iaYong[i]=new int[i+1];
        iaYong[0][0]=1;
        for(i=1;i<iaYong.length;i++){
            iaYong[i][0]=1;
            for(j=1;j<iaYong[i].length-1;j++)
                iaYong[i][j]=iaYong[i-1][j-1]+iaYong[i-1][j];
            iaYong[i][iaYong[i].length-1]=1;
        }
for(i=0;i<iaYong.length;i++) {
    for (j = 0; j < iaYong[i].length; j++)
        System.out.print(iaYong[i][j] + " ");
    System.out.println();
}
}
    }
