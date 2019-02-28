
/*
Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits
And Other Special Characters In A String.
 */

public class DigitLowercaseUppercaseSpecialCharacter
{
    public static void main(String[] args) {
        String string="My name is rishabh & my EmailID:Rishabh.Khatreja03@gmail.com";
        int lowerCase=0,upperCase=0,digits=0,SpecialCharacter=0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)>='a' && string.charAt(i)<='z')
            {
                lowerCase=lowerCase+1;
            }
            else if(string.charAt(i)>='A' && string.charAt(i)<='Z')
            {
                upperCase=upperCase+1;
            }
            else if(Character.isDigit(string.charAt(i)))
            {
                digits=digits+1;
            }
            else if(!(string.charAt(i)==' '))
            {
                SpecialCharacter=SpecialCharacter+1;
            }
        }
        System.out.println("number of lowercase character="+lowerCase+" and % is="+((float)lowerCase/string.length())*100+"%");
        System.out.println("number of uppercase character="+upperCase+" and % is="+((float)upperCase/string.length())*100+"%");
        System.out.println("number of digits="+digits+" and % is="+((float)digits/string.length())*100+"%");
        System.out.println("number of special character="+SpecialCharacter+" and % is="+((float)SpecialCharacter/string.length())*100+"%");
    }

}
