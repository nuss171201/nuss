public class StringExample {
    public static void main(String[] args){

        // creating string using literals
        String greeting = "Hello, World!";
        String name = "Alice";

        // printing strings
        System.out.println("greeting:"+ greeting);
        System.out.println("name:"+ name);

        // string concatenation
        String welcomeMessage= greeting + "  " + name + "!";
        System.out.println("Welcome Message:"+ welcomeMessage);

        // getting the length of a string
        int length = greeting.length();
        System.out.println("length of greeting:" + greeting);

        // accessing the characters in a string
        char firstChar = name.charAt(0);
        char secondChar = name.charAt(1);
        char thirdChar = name.charAt(2);
        char fourthChar = name.charAt(3);
        System.out.println("First Character of Name:" +firstChar);
        System.out.println("second Character of Name:"+ secondChar);
        System.out.println("third Character of Name:"+ thirdChar);
        System.out.println("fourth Character of Name:" + fourthChar);

        // substring
        String subStr = greeting.substring(7,12);
        System.out.println("substring of greeting:" + subStr);






    }
}
