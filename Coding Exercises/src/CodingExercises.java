/**
 * Created by Khoi on 2018-08-21.
 */
public class CodingExercises {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);

        System.out.println(bark(true,1));
        System.out.println(bark(false,2));
        System.out.println(bark(true,8)); // false
        System.out.println(bark(true,-1)); // false
        System.out.println("---");
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kiloBytes + " KB = " + kiloBytes/1024 +
                    " MB " + "and " + kiloBytes%1024 + " KB");
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean status = false;

        if(hourOfDay>=0 && hourOfDay <= 23) {
            if ((barking == true && hourOfDay < 8) || (barking == true && hourOfDay > 22)) {
                status = true;
            } else if ((barking == true && hourOfDay < 0) || (barking == true && hourOfDay > 23)) {
                status = false;
            }
        }
        return status;
    }

        public static boolean isLeapYear(int year) {
            boolean status = false;
            if (year >= 1 && year <= 9999) {
                if((year%4 == 0 && year%100 !=0) || year%400 == 0) {
                    status = true;
                }
            }
            else {
                status = false;
            }
            return status;
        }


}
