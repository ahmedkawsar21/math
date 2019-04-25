package Math;

public class Pyramids {

    //implement a pyramid with 6x6 stars and space after each star

    public static void main(String[] args) {
        //for spaces
        // for stars

        for (int i=0; i<6; i++) {
            for (int x =5; x>=i; x--) {
                System.out.println("z");
            }
            for (int z=0; z<=i; z++) {
                System.out.println("* ");
            }
            System.out.println(" ");
        }
    }

}


