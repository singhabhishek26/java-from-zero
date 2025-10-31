
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

size:   4 bytes(32 bits)
Range:  -2^31 to 2^31-1

ex - int x = 2147483648 -- CE integer number too large.
=========================================================================================
*/