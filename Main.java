import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        // get bit at a particular position (& 1)
        if((bitMask & n)==0)
            System.out.println("bit was zero");
        else
            System.out.println("bit was one");

        // set bit (| 1)
        int newNumber = n | bitMask;
        System.out.println(newNumber);  
        
        // clear bit (& with ~)
        int notBitMask = ~bitMask;
        newNumber = n & notBitMask;
        System.out.println(newNumber);
    }
}

// Bit Manipulation
//     |_ use "a = num >> 1" instead of "a = num / 2" in loops (faster)
//     |_ # last bit of num = 0 => even, = 1 => odd [ Use Masking (here, & with 1) to find last bit ] -> Use "num && 1 == 0" instead of "num % 2 == 0" to check even
//     |_ Swap a & b -> a = a ^ b -> b = a ^ b -> a = a ^ b [ ^ => XOR ]
//     |_ Bit Masking
//     |    |_ Find i'th bit  -> (n && (1<<i))
//     |    |_ Set i'th bit   -> (n || (1<<i))
//     |    |_ Clear i'th bit -> (n && (~(1<<i)))
//     |    |_ ** Find no. of set bits / to clear least significant set bits -> do ( n && (n-1) ) until n=0
//     |    |        |_ Eg: n = 13, 1101 -> 1100 -> 1000 -> 0000 => 3 set bits (count)
//     |    |_ Find no. of bits to change a to b -> find no. of set bits in a^b
//     |_ # 0^n = n, n^n = 0  
//     |_ Find 1 unique no. in array if other nos. repeat 2 times -> xor all numbers
//     |_ Find 2 unique nos. in array if other nos. repeat 2 times -> temp_result = xor all nos.
//     |                               -> find position(i) of right most set bit of temp_result
//     |                               -> divide array into 2 (one whose element's i'th bit is set and one whose is unset/clear)
//     |                                    -> first_num =  xor all elements whose ith bit is set
//     |                                    -> second_num = first_num ^ temp_result
//     |_ Find 1 unique no. in array if other nos. repeat 3 times -> make a count array of 32 size (for 32 bit)
//                                                                -> For each no. in array, change/increase count in array as per binary representation of the number 
//                                                                         |_ Eg. arr = [2,2,5]
//                                                                         |_ count = [...,1,0] -> [...,2,0] -> [...,1,2,1]
//                                                                -> divide each no. in count with 3 (if remainder=0, then store 0 else 1)
//                                                                -> convert the binary count representation to decimal