public class StringMethods {

    public static void main(String[] args) {

        String name = "Bro Code";

        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf("o");
        //int lastIndex = name.lastIndexOf("o");

        // name = name.toLowerCase();
        name = name.replace("o", "a");

        if (name.isEmpty()){
            System.out.println("you are empty");
        }
        else {
            System.out.println("Hello " + name);
        }

        //System.out.println(name);
        //System.out.println(index);
        //System.out.println(lastIndex);



    }
}
