import java.util.Scanner;

public class LV1{
    public static void main(String[] args) {
        int [][]arrayA=new int[3][2];
        int[][]arrayB=new int[2][3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("input arrayA");
        for (int y=0;y<3;y++){
            for (int x=0;x<2;x++){
                arrayA[y][x]=scanner.nextInt();
            }
        }
        System.out.println("input arrayB");
        for (int y=0;y<2;y++){
            for (int x=0;x<3;x++){
                arrayB[y][x]=scanner.nextInt();
            }
        }
        System.out.println("output arrayC");
        int[][]arrayC=new int[3][3];
        int ar=0,bc=0;
        for (int y=0;y<3;y++){
            for (int x=0;x<3;x++){
                arrayC[y][x]=arrayA[ar][0]*arrayB[0][bc]+arrayA[ar][1]*arrayB[1][bc];
                bc++;
            }
            ar++;
            bc=0;
        }
        for(int y=0;y<3;y++){
            for (int x=0;x<3;x++){
                System.out.print(arrayC[y][x]+"\t");
            }
            System.out.println();
        }
    }
}