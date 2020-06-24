package exercise2;
import java.util.ArrayList;

public class Colors {

    String[] colorful(String[] strings) {
    	// For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        
    	String[] colorList = {"red", "yellow", "green", "blue", "black", "pink"};
    	ArrayList<String> colorNameList = new ArrayList<String>();
    	
    	// Nested loop, to check each element of strings[] against colorList
    	for(String element : strings) {
    		for(String color : colorList) {
    			if(element.startsWith(color)) {
    				colorNameList.add(element);
    			}
    		}
    	}
    	
    	// testing the results
    	for (int i = 0; i < colorNameList.size(); i++) {
    	      System.out.println(colorNameList.get(i));
    	}
    	
    	return colorNameList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }
}