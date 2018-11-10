# Sum-String


Steps to compile and run program in terminal:

1. javac SumString.java
2. java SumString -x -f targetstring

-x: Optional parameter, allows reading of hex characters in targetstring

-f: Optional parameter, if specified, targetstring should be the name of the file in the folder as SumString.java
    eg. java SumString -f sample.txt
    
targetstring: Required parameter, specifies the string to calculate the sum of digits. Should be the name of the file if using              the -f flag



To run the automated test file:
1. javac SumStringTester.java
2. java SumStringTester
