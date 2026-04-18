public class StringPractice {
    public static void main(String[] args) {

        // Declare and initialize String variables
        String str1 = "Hello";
        String str2 = "World";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2 concat() 
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + combined);

        // 3 toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        // 4 substring()
        String sub = combined.substring(0, 5);
        System.out.println("Substring (0 to 5): " + sub);

        // 5 equals() 
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 6 replace()
        String replaced = combined.replace("World", "Java");
        System.out.println("Replaced String: " + replaced);

        // 7 charAt()
        char ch = str1.charAt(1);
        System.out.println("Character at index 1 in str1: " + ch);
    }
}
