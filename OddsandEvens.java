import java.util.Scanner;
import java.util.Arrays;

public class OddsandEvens {
    private int[] nums, odd, even;
    int ocount = 0;
    int ecount = 0;

    public OddsandEvens() {
        nums = new int[]{2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
        setcounter();
    }

    public OddsandEvens(int[] list) {
        nums = list;
        setcounter();
    }

    public void setcounter() {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                ecount++;
            else
                ocount++;
        }
    }

    public void getOdds() {
        odd = new int[ocount];
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                index++;
                odd[index] = nums[i];
            }
        }
        if (index == -1) {
            odd = new int[0];
        }
    }

    public void getEvens() {
        even = new int[ecount];
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                index++;
                even[index] = nums[i];
            }
        }
        if (index == -1) {
            even = new int[0];
        }
    }

    public static void main(String[] args) {
        //creates object
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the list ----------> ");
        //sets user input to variable
        String resp = keyboard.nextLine();
        //splits user input and assigns to string array
        String[] stringlist = resp.split(" ");
        //creates int array and declares value
        int[] list = new int[stringlist.length];
        //parses string array values and converts into int and then places it into int array
        for (int i = 0; i < stringlist.length; i++) {
            list[i] = Integer.parseInt(stringlist[i]);
        }
        //instantiate objects
        OddsandEvens obj = new OddsandEvens();
        OddsandEvens obj2 = new OddsandEvens(list);
        //runs the methods
        obj2.getEvens();
        obj2.getOdds();
        //displays output
        System.out.println("Odd - " + Arrays.toString(obj2.odd));
        System.out.println("Even - " + Arrays.toString(obj2.even));
    }
}