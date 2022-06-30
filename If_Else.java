public class If_Else {
    public static void main(String[] args) {
        int age = 19;
        String name = "Peter";

        if( age == 19 && name == "Unknown") {
            System.out.println("Your age is 18.");
        } else if(age == 19 && name == "Peter") {
            System.out.println("Peter age is 18.");
        } else {
            System.out.println("Information error.");
        }
    }
}
