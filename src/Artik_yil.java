import java.util.Scanner;



public class Artik_yil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yıl Giriniz:");

        int yil = input.nextInt();


        if (yil % 100 == 0) {


            if (yil % 400 == 0) {

                System.out.println(yil + "bir artık yıldır !");}

            else {
                System.out.println (yil + "bir artık yıldır değildir !");}

        }


        else if ((yil % 100 != 0)){

            if (yil % 4== 0) {
                System.out.println (yil + "bir artık yıldır !");

        }

        else{


            System.out.println (yil + "bir artık yıldır değildir !");
    }


        }















    }
}