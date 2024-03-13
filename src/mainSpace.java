public class mainSpace {


        public static void main(String[] args) {

            printLuckySpcrafNumbers (100);
        }

        public static void printLuckySpcrafNumbers(int total) {
            int count= 0;
            for(int i = 1; count < total;i++){

                if(!containsUnluckyDigits(i)) {
                    System.out.println("Космический аппарат №" +i);
                    count++;
                }
            }
        }

        public static boolean containsUnluckyDigits(int number) {
            while (number > 0) {
                int digit = number % 10;
                if (digit ==4 || digit ==9) {
                    return true;
                }
                number /=10;
            }
            return false;
        }

    }

