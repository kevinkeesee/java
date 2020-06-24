package exercise2;

class Types {
//    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
    static boolean number;
    static int[] myArray = {3,4,5,6,76,12,2};
    static String movieA = "Harry and the Hendersons";
    static String movieB = "Star Wars";
    static char male = 'm';
    static char female = 'f';

    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables

    public static void main(String[] args) {
        System.out.println(number);
        
        for (int element : myArray) {
        	System.out.print(element + ", ");
        }
        System.out.println();
        
        System.out.println(movieA);
        System.out.println(movieB);
        System.out.println(male);
        System.out.println(female);
        
        Arrays.printNums();
        Arrays.printGreetings();
        Arrays.printBinaries();
    }
}