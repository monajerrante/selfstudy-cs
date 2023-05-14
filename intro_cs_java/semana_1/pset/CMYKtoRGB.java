/******************************************************************
 * CMYKtoRGB.java
 * 
 * Problem Set 1.
 * 
 * Problem 4. Type conversion. 
 * 
 * Several different formats are used to represent color.
 * For example, the primary format for LCD displays, digital
 * cameras, and web pages—known as the RGB format—specifies
 * the level of red (R), green (G), and blue (B) on an integer
 * scale from 0 to 255. The primary format for publishing books
 * and magazines — known as the CMYK format—specifies the level
 * of cyan (C), magenta (M), yellow (Y), and black (K) on a real
 * scale from 0.0 to 1.0.
 * 
 * Write a program CMYKtoRGB.java that converts from CMYK format
 * to RGB format using these mathematical formulas:
 *   white = 1 − black
 *   red = 255 × white × (1 − cyan)
 *   green = 255 × white × (1 − magenta)
 *   blue = 255 × white × (1 − yellow)
 * 
 * Your program must take four double command-line arguments cyan,
 * magenta, yellow, and black; compute the corresponding RGB values,
 * each rounded to the nearest integer; and print the RGB values,
 * as in the following sample executions:
 * 
 * ~/Desktop/hello> javac CMYKtoRGB.java
 * ~/Desktop/hello> java CMYKtoRGB 0.0 1.0 0.0 0.0
 * red = 255
 * green = 0
 * blue = 255        // magenta
 * 
 * ~/Desktop/hello> java CMYKtoRGB 0.0 0.4392156862745098 1.0 0.0
 * red = 255
 * green = 143
 * blue = 0
 ******************************************************************/
 
public class CMYKtoRGB{
    public static void main(String[] args){
        
        double black   = Double.parseDouble(args[3]);
        double cyan    = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);        
        double yellow  = Double.parseDouble(args[2]);
        
        double white = 1 - black;
        double red   = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue =  255 * white * (1 - yellow); 
        
        System.out.println( "red = " + Math.round(red) );
        System.out.println( "green = " + Math.round(green) );
        System.out.println( "blue = " + Math.round(blue) );
    }
}
