
/*
Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
 */

class Overload
{
        public int add(int number1, int number2)
        {
            return number1+number2;
        }
        public double add(double number1, double number2)
        {
            return number1+number2;
        }
        public int multiply(int number1, int number2)
        {
            return number1*number2;
        }
        public Float multiply(float number1, float number2)
        {
            return number1*number2;
        }
        public String concat(String s1, String s2)
        {
            return s1+s2;
        }
        public String concat(String s1,String s2,String s3)
        {
            return s1+s2+s3;
        }
    }
    public class Overloading
    {
        public static void main(String[] args)
        {
            Overload obj=new Overload();
            int addIntResult=obj.add(10,20);
            double addDoubleResult=obj.add(10.40,20.45);
            int mulIntResult=obj.multiply(10,20);
            float mulFloatResult=obj.multiply(10.20f,20.45f);
            String concat2Strings=obj.concat("hello", "world");
            String concat3Strings=obj.concat("hello", "world","friends");
            System.out.println("integer add result="+addIntResult);
            System.out.println("double add result="+addDoubleResult);
            System.out.println("integer multiply result="+mulIntResult);
            System.out.println("float multiply result="+mulFloatResult);
            System.out.println("2 string concat result="+concat2Strings);
            System.out.println("3 string concat result="+concat3Strings);
        }
    }
