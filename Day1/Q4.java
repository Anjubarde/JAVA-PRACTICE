/*
    Write a program to convert: int to byte, double to int, char to int. Show both 
    implicit and explicit type casting.
*/
class Q4 
{
    public static void main(String[] args) 
    {
        
        int intValue = 18;
        byte byteValue = (byte) intValue; 
        System.out.println("int to byte: " + intValue + " : " + byteValue);

        double doubleValue = 67.34;
        int intFromDouble = (int) doubleValue;
        System.out.println("double to int: " + doubleValue + " : " + intFromDouble);

        char charValue = 'M';
        int intFromChar = charValue;
        System.out.println("char to int: '" + charValue + " : " + intFromChar);

        byte smallByte = 123;
        int widenedInt = smallByte;
        System.out.println("byte to int: " + smallByte + " : " + widenedInt);
    }
}


