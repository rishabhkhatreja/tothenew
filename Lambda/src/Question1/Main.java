/*
Write the following a functional interface and implement it using lambda:

    (1) First number is greater than second number or not         Parameter (int ,int ) Return boolean
    (2) Increment the number by 1 and return incremented value    Parameter (int) Return int
    (3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
    (4) Convert a string to uppercase and return .                Parameter (String) Return (String)

 */


package Question1;


public class Main {
    public static void main(String[] args) {

        // 1st number is greater
        GreaterOrNot referenceGreater=(number1,number2)->{if(number1>number2) return true;else return false;};
        System.out.println("first number is greater or not="+referenceGreater.Greater(20,10));

        //2nd increment of a number
        IntegerIncrement referenceIncrement=(a)->++a;
        System.out.println("Incremented number is="+referenceIncrement.increment(10));

        //concat of strings
        StringConcat referenceConcat=(string1,string2)->string1+string2;
        System.out.println("String concat="+referenceConcat.Concat("Rishabh","Khatreja"));

        //convert into upper case
        StringToUpper referenceUpperCase = (s) -> s.toUpperCase();
        System.out.println("String in to uppercase="+referenceUpperCase.UpperCase("Rishabh"));
    }
}
