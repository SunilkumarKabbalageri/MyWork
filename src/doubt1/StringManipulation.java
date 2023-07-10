package doubt1;

public class StringManipulation {
    public static void main(String[] args) {
        String input1 = "9880127431";
        String input2 = "johnson";
        
        String output = manipulateStrings(input1, input2);
        System.out.println("Output: " + output);
    }
    
    public static String manipulateStrings(String input1, String input2) {
        StringBuilder output = new StringBuilder();
        int length1 = input1.length();
        int length2 = input2.length();
        
        int minLength = Math.min(length1, length2);
        
        for (int i = 0; i < minLength; i++) {
            output.append(input1.charAt(i));
            output.append(input2.charAt(i));
        }
        
        if (length1 > length2) {
            output.append(input1.substring(length2));
        } else if (length2 > length1) {
            output.append(input2.substring(length1));
        }
        
        return output.toString();
    }
}
