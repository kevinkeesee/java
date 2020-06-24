package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    static int[] nums = {10,23,3,4,5,2,1};
    static String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
    static boolean[] binaries = {false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false};

    static void printNums() {
    	for (int element : nums) {
        	System.out.print(element + ", ");
        }
    	System.out.println();
    };
    
    static void printGreetings() {
    	for (String element : greetings) {
        	System.out.print(element + ", ");
        }
    	System.out.println();
    };
    
    static void printBinaries() {
    	for (boolean element : binaries) {
        	System.out.print(element + ", ");
        }
    	System.out.println();
    };
}