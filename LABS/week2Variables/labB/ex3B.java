// Karol G00436758
public class ex3B {
    public static void main(String[] args) {
        // byte
        // Byte data type is an 8-bit integer
        // Minimum value is -128
        // Maximum value is 127
        // Default value is 0
        byte b = 100;

        // short
        // Short data type is a 16-bit integer
        // Minimum value is -32,768
        // Maximum value is 32,767
        // Default value is 0
        short s = 32000;

        // int
        // Int data type is a 32-bit integer
        // Minimum value is -2,147,483,648
        // Maximum value is 2,147,483,647
        // Default value is 0
        int i = 1234;

        // long
        // Long data type is a 64-bit integer
        // Maximum value is 9,223,372,036,854,775,807
        // Default value is 0L
        long l = 123456789L;

        // float
        // Float data type is a single-precision 32-bit IEEE 754 floating point
        // Float is mainly used to save memory in large arrays of floating point numbers
        // Default value is 0.0F
        float f = 1.5F;

        // double
        // Double data type is a double-precision 64-bit IEEE 754 floating point
        // Double is generally used as the default data type for decimal values, generally the default choice
        // Default value is 0.0D
        double d = 12.345D;

        // boolean
        // Boolean data type represents one bit of information
        // There are only two possible values: true and false
        // Default value is false
        boolean bool = true;

        // char
        // Char data type is a single 16-bit Unicode character
        char c = 'A';
        
        System.out.println("byte: " + b + "\nshort: " + s + "\nint: " + i + "\nlong: " + l + "\nfloat: " + f + "\ndouble: " + d + "\nboolean: " + bool + "\nchar: " + c);
    }
}
