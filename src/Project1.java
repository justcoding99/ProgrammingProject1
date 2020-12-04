import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an integer between 1-3000");
        int number = scn.nextInt();
        int d1=number/1000;
        int d3=(number%100)/10;
        int d2=(number/100)%10;
        int d4=number%10;
        if (0<number && number<=3000)
            switch (d1){
                case 1:
                    System.out.print("Z");break;
                case 2:
                    System.out.print("ZZ");break;
                case 3:
                    System.out.print("ZZZ");break;


            }switch (d2) {
            case 1:
                System.out.print("B");
                break;
            case 2:
                System.out.print("BB");
                break;
            case 3:
                System.out.print("BBW");
                break;
            case 4:
                System.out.print("BW");
                break;
            case 5:
                System.out.print("W");
                break;
            case 6:
                System.out.print("WB");
                break;
            case 7:
                System.out.print("WBB");
                break;
            case 8:
                System.out.print("WBBB");
                break;
            case 9:
                System.out.print("BZ");
                break;

        }
        switch (d3){
            case 1:
                System.out.print("O");break;
            case 2 :
                System.out.print("OO");break;
            case 3:
                System.out.print("OOT");break;
            case 4:
                System.out.print("OT");break;
            case 5 :
                System.out.print("T");break;
            case 6 :
                System.out.print("TO");break;
            case 7 :
                System.out.print("TOO");break;
            case 8 :
                System.out.print("TOOO");break;
            case 9 :
                System.out.print("OB");break;

        }switch (d4){
            case 1 :
                System.out.println("A");break;
            case 2:
                System.out.println("AA");break;
            case 3:
                System.out.println("AAE");break;
            case 4 :
                System.out.println("AE");break;
            case 5 :
                System.out.println("E");break;
            case 6 :
                System.out.println("EA");break;
            case 7 :
                System.out.println("EAA");break;
            case  8:
                System.out.println("AAO");break;
            case 9 :
                System.out.println("AO");break;


        }
    }



}
