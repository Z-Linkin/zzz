

public class LV2 {
    public static void main(String[] args) {
        DrawFunctionTool Function = new DrawFunctionTool();
        System.out.println("y=x^2");
        Function.Function1();
        System.out.println("y=x");
        Function.Function2();
        System.out.println("x^2+y^2=1");
        Function.Function3();
        System.out.println("y^2=x");
        Function.Function4();
        System.out.println("y=x^3");
        Function.Function5();
    }
}
class DrawFunctionTool {
    public void Function1() {
        int x = 1, y = 1;
        for (; y <= 17; y++) {
            switch (y) {
                case 1:
                    for (x = 1; x <= 10; x++) {
                        switch (x) {
                            case 1:
                                System.out.print("*");
                                break;
                            case 10:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print("\t");
                                break;
                        }
                    }
                    System.out.println("\n");
                    break;
                case 8:
                    for (x = 1; x <= 10; x++) {
                        switch (x) {
                            case 2:
                                System.out.print("*");
                                break;
                            case 9:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print("\t");
                                break;
                        }
                    }
                    System.out.println("\n");
                    break;
                case 13:
                    for (x = 1; x <= 10; x++) {
                        switch (x) {
                            case 3:
                                System.out.print("*");
                                break;
                            case 8:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print("\t");
                                break;
                        }
                    }
                    System.out.println("\n");
                    break;
                case 16:
                    for (x = 1; x <= 10; x++) {
                        switch (x) {
                            case 4:
                                System.out.print("*");
                                break;
                            case 7:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print("\t");
                                break;
                        }
                    }
                    System.out.println("\n");
                    break;
                case 17:
                    for (x = 1; x <= 10; x++) {
                        switch (x) {
                            case 5:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print("\t");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("\n");
                    break;
            }
        }
        System.out.println();
    }

    public void Function2() {
        int i=10;
        for (int y = 1; y <= 10; y++) {
            int x=1;
            for (;x<=i;x++) {
                System.out.print("\t");
            }
            i--;
            System.out.println("*");
        }
    }


    public void Function3() {
        for (int y=1;y<=11;y++){
            if(y==1){
                int x=1;
                for(;x<5;x++){
                    System.out.print("\t");
                }
                for (;x<9;x++){
                    System.out.print("*");
                }
                System.out.println();
            }else if (y==2){
                int x=1;
                for (;x<=11;x++){
                    if (x==3){
                        System.out.print("*");
                    }else if (x==9){
                        System.out.print("*");
                        break;
                    }else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }else if (y==3){
                int x=1;
                for (;x<=11;x++){
                    if (x==2){
                        System.out.print("*");
                    }else if(x==10){
                        System.out.print("*");
                        break;
                    }else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }else if(y==4){
                System.out.println();
            }else if (y==5){
                int x=1;
                for (;x<=11;x++){
                    if (x==1){
                        System.out.print("*");
                    }else if (x==11){
                        System.out.print("*");
                    }else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }else if (y==6){
                int x=1;
                for (;x<=11;x++){
                    if (x==1){
                        System.out.print("*");
                    }else if (x==11){
                        System.out.print("*");
                    }else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }else if (y==7){
                int x=1;
                for (;x<=11;x++){
                    if (x==1){
                        System.out.print("*");
                    }else if (x==11){
                        System.out.print("*");
                    }else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }else if(y==8){
                System.out.println();
            }else if (y==9){
                int x=1;
                for (;x<=11;x++){
                    if (x==2){
                        System.out.print("*");
                    }else if(x==10){
                        System.out.print("*");
                        break;
                    }else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }else if (y==10){
                int x=1;
                for (;x<=11;x++){
                    if (x==3){
                        System.out.print("*");
                    }else if (x==9){
                        System.out.print("*");
                        break;
                    }else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }else if(y==11){
                int x=1;
                for(;x<5;x++){
                    System.out.print("\t");
                }
                for (;x<9;x++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void Function4(){
        for (int y=10;y>1;y--){
            for (int i=y*y,x=1;;x++){
                if (x==i){
                    System.out.println("*");
                    break;
                }else{
                    System.out.print("\t");
                }
            }
        }
        for (int y=1;y<=10;y++){
            for (int i=y*y,x=1;;x++){
                if (x==i){
                    System.out.println("*");
                    break;
                }else{
                    System.out.print("\t");
                }
            }
        }
        System.out.println();
    }

    public void Function5(){
        int i=3,t=2;
        for (int y=27;y>0;y--){
            if (y==i*i*i){
                for (int x=1;;x++) {
                    if (x == i) {
                        System.out.print("\t\t\t*");
                        break;
                    } else {
                        System.out.print("\t");
                    }
                }
                i--;
            }else {
                System.out.println();
            }
        }
        System.out.println();
        for (int y=3;y<28;y++){
            if(y==(4-t)*(4-t)*(4-t)){
                for (int x=1;;x++){
                    if (x==t){
                        System.out.print("\t*");
                        break;
                    }else {
                        System.out.print("\t");
                    }
                }
                t--;
            }else {
                System.out.println();
            }
        }
    }
}