import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> allNumbers=new ArrayList<>();
        ArrayList< Integer> evenNumbers=new ArrayList<>();
        ArrayList < Integer> oddNumbers=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Random ram=new Random();
            int a= ram.nextInt(100);
            allNumbers.add(i,a);
        }
        
        for (Integer a:allNumbers) {
            if (a%2==0){
                evenNumbers.add(a);
            }
            else { oddNumbers.add(a);
            }

        }
        System.out.println("SANDAR: " +allNumbers);
        System.out.println("jup sandar: "+evenNumbers);
        System.out.println("tak sandar: "+oddNumbers);

    }
}