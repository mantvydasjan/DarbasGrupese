package exceptions.example1;

public class BenefitsOfExceptions {
    /*
    Exceptions used to handle runtime errros so the normal flow of the application can be maintained.
    Exceptions is thrown only when preconditions are brojen. Something unexpected but known happen.

    We don't thow for example IncorrectInputException,
    we throw ComputerIsOnFire exeption.

     */
        public static void main(String[] args) {
            System.out.println( calculatePercentage(5, 0));
            System.out.println(calculatePercentageWithException(5, 0));

        }

        private static double calculatePercentage(int a, int b) {
            //100 * (a/b) -> formule

            if(b ==0) { //basic error handling
                return -1; //code program to understand what -1 means
            } else
                return (a/b) * 100;

    }

    private static double calculatePercentageWithException(int a, int b) {
            if (b == 0) {
                throw  new IllegalArgumentException("Second argument cannot be zero");
            } else {
                return (a/b) * 100;
            }
    }
}

