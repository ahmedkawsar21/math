package Math;

public class ReplaceFor {
    public static void main(String[] args) {
        for(int i=0; i<25; i++) {
            if ((i%5)==0) {
                System.out.println("buzz");
            }else if ((i%3)==0) {
                System.out.println("fuzz");
            }else if((i%3)==0 && (i%5)==0) {
                System.out.println("FuzzBuzz");

            }


        }
    }

}
