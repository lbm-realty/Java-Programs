public class syntax {
    public static void main (String[] args) {
        Person person1 = new Person();
        person1.name = "Labeeb";
        person1.age = 20;
        person1.school = "Texas Tech University";

        person1.data();
        
        int a = 4;
        int b = 9;
        int sum = a + b;

        double marks1 = 99.5;
        double marks2 = 88;
        double marks3 = 92.4;
        double average = (marks1 + marks2 + marks3) / 3;

        int num1 = 4;
        int num2 = 8;
        int product = num1 * num2;

        int x = 7;
        int y = 9;
        int remainder = y % x;

        String name = "Labeeb";
        System.out.println("The name given is: " + name);

        if (x == 2){
            System.out.println("The value for x is: " + x);
        } else if (x == 7){
            System.out.println("The value for x is: " + x);
        } else{
            System.out.println("All of the conditions failed, x is: " + x);
        }

        for (int i = 0; i < 7; i++){
            for (int j = 7; j > i; j--){
                System.out.print("#");
            }
            System.out.println();
        }

        int iterator = 9;
        while (iterator > 0){
            System.out.println("$");
            iterator--;
        }

        int[] newArray = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("The number at index " + i + " is : " + newArray[i]);
        }

        System.out.println("This is the Sum: " + sum);
        System.out.println("This is the Average: " + average);
        System.out.println("This is the Product: " + product);
        System.out.println("This is the Remainder: " + remainder);
        System.out.println("This is the proof of the function working: " + addNumbers(3, 9));
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

}