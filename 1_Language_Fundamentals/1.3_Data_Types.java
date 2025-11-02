
// Data Types

/*
1. Java is a Strongly Typed Language
2. Every variable and exression has some type.
3. Every assignment should be checked by compiler for type compatibility - that's why Java is strongly typed Language.
4. Java has more object oriented nature than say C++.
   Java alone do not have many OOPs features.(operator overloading, multile imheritance, ..)

   Hence, Java is not pure oops language.

PRIMITIVE DATA TYPES (8) :-

1. Numeric Data Types
    1.1 Integral Data Type  (byte, short,int ,long)  - without decimal
    1.2 Floating Point Data Type (float, double)     - with decimal

2. Non-Numeric Data Types (char, boolean)

Note - Except boolean and char remaining data types are considered as Signed Data types because we can represent both + and - numbers.


1. byte Data Type -

size:       8 bits
max_value:  +127
min_value:  -128
Range:      -128 to 127

Out of 8 bits

1 bit(For sign) + 7 bit (for the actual number)
0 - positive      1 1 1 1 1 1 1
1 - negative

Note - The most significant bit acts as signed bit 0 - positive and 1 - negative
        where positive numbers will be represented directly in the memory whereas negative
        numbers will be represented in 2s complement form.
Note - Best place to use byte is either in file or network stream as they support byte form.
       Two types of Streams:
       -- Byte Streams
       -- Charachter Streams

ex- Possibles errors

byte b = 128;  Compile Time error: Possible loss of precision fount int required byte.

byte b = true; CE: incompatible types found boolean required byte.
==============================================================================
2. Short Data type

size:   2 bytes (16 bits)
Range:  -2^15 to 2^15-1
        -32768 to 32767

Most rarely used data type in java.
Short data type is best with 16 bit processors (8085 and 8086) but these processors are completely outdted.
========================================================================================
3. Int Data Type

size:   4 bytes (32 bits)
Range:  -2^31 to 2^31-1

ex - int x = 2147483648 -- CE integer number too large.
=========================================================================================
4. Long Data Type

size:   8 bytes (64 bits)
Range:  -2^63 to 2^63-1
=========================================================================================
5. float Data Type (less accuracy i.e less decimal places)

size:   4 byte (32 bits)
Range:  -3.4e38 to 3.4e38
=========================================================================================
6. double Data type (more accuracy i.e more decimal places)

size:   8 byte(64 bits)
Range:  -1.7e308 to 1.7e308 = 1.7*10^38
=========================================================================================
7. Boolean Data type

size:   Not Applicable (VM Dependency)
Range:  N/A (But alowed values are true or false)

ex-
boolean b = True;  CE: Cannot find symbol Symbol: variable True location: class Test.

int x= 0;
if(x) {
    SOP("Hello");
}
Above will result in compile time error: fount int required boolean.
=========================================================================================
8. char Data Type

Size: 2 byte(16 bits)
Range:0 to 65535

# Old Language (C/C++) has char as 1 byte as -
They were "ASCII Code based" and No of Allowed ASCII Code Charachters are 256
a to z, A to Z, 0 to 9, $, #, +, -, *, .....
And 8 bits (1 byte) are enough for 256 Chars.

# Java Language
Java is "Unicode Based" and no of different unicode charachters are >256 and <=65536
To represent these charachters 8 bits are not enough hence we use 16 bits in JAVA i.e 2 bytes
256 Charachters + 1 byte (Any symbol - ex - Tamil,Hindi,Chinese,etc.)
<= 65536

==========================================================================================


SUMMARY OF JAVA PRIMITIVE DATA TYPES
====================================

DATA TYPE       SIZE    RANGE                   WRAPPER CLASS       DEFAULT VALUE
===================================================================================================
byte            1       -127 to 128             Byte                0
short           2       -2^15 to 2^15-1         Short               0
int             4       -2^31 to 2^31-1         Integer             0
long            8       -2^63 to 2^63-1         Long                0
float           4       -3.4e38 to 3.4e38       Float               0.0
double          8       -1.7e308 to 1.7e308     Double              0.0
char            2       0 to 65535              Charachter          0 (Represents Space Character).
boolean         NA      NA (0, 1)               Boolean             false


Note :- Null is he default value for object reference and we can't apply for primitives if we are trying to use for primitive we will get compile time error
ex - char ch = null;
CE: incompatible types
    found nulltype
    required char
*/

class Data_Types {
    public static void main(String[] args) {
        boolean x = 0;
        if (x) {
            System.out.println("Hello");
        }
    }
}
