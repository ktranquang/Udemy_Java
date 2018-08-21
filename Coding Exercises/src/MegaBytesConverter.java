/**
 * Created by Khoi on 2018-08-21.
 */
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
        System.out.println(bark(true,1));
        System.out.println(bark(false,2));
        System.out.println(bark(true,8));
        System.out.println(bark(true,-1));
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kiloBytes + " KB = " + kiloBytes/1024 +
                    " MB " + "and " + kiloBytes%1024);
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if(barking && (hourOfDay < 9 || hourOfDay > 22 )) {
            return true;
        }
        else if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else{
            return false;
        }
    }
}
