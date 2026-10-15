# Lab Sheet 02 - Operators, Loops and Control Statements

**Course:** BCA201P - Foundations of Java Development (BCA III Semester)

Each question is a separate Java file. The `output` folder has the output of every program for the sample input used.

## How to run

```
javac Q01_*.java
java Q01_ClassName
```

Replace `Q01_*` and `Q01_ClassName` with the file you want to run. The class name is the same as the file name without `.java`.

In VS Code you can also open a file and click the **Run** button above the `main` method.

## Programs

| Q | Program | Question | Output |
|---|---------|----------|--------|
| 1 | [Q01_HeronsFormula.java](Q01_HeronsFormula.java) | Find the area of a triangle given its three sides using Heron's formula. | [output](output/Q01_HeronsFormula_output.txt) |
| 2 | [Q02_CompoundInterest.java](Q02_CompoundInterest.java) | Calculate compound interest given principal, rate and time. | [output](output/Q02_CompoundInterest_output.txt) |
| 3 | [Q03_DistanceBetweenPoints.java](Q03_DistanceBetweenPoints.java) | Find the distance between two points in a 2D plane using the distance formula. | [output](output/Q03_DistanceBetweenPoints_output.txt) |
| 4 | [Q04_VisitorCounter.java](Q04_VisitorCounter.java) | Demonstrate prefix and postfix increment by simulating a counter | [output](output/Q04_VisitorCounter_output.txt) |
| 5 | [Q05_NegativeValue.java](Q05_NegativeValue.java) | Take an integer and output its negative value using unary operators. | [output](output/Q05_NegativeValue_output.txt) |
| 6 | [Q06_ReduceByHalf.java](Q06_ReduceByHalf.java) | Gradually reduce a number by half using /= until it becomes less than 1, | [output](output/Q06_ReduceByHalf_output.txt) |
| 7 | [Q07_RainfallTotal.java](Q07_RainfallTotal.java) | Accumulate rainfall data for 7 days using += and find the total. | [output](output/Q07_RainfallTotal_output.txt) |
| 8 | [Q08_ValidTriangleAngles.java](Q08_ValidTriangleAngles.java) | Check whether three given angles form a valid triangle | [output](output/Q08_ValidTriangleAngles_output.txt) |
| 9 | [Q09_CompareStrings.java](Q09_CompareStrings.java) | Compare two strings for lexicographic (dictionary) order without using | [output](output/Q09_CompareStrings_output.txt) |
| 10 | [Q10_LeapYearInRange.java](Q10_LeapYearInRange.java) | Determine if a given year is both a leap year and within a given range. | [output](output/Q10_LeapYearInRange_output.txt) |
| 11 | [Q11_PassCourse.java](Q11_PassCourse.java) | Check if a student passes a course: they must have at least 40% in theory | [output](output/Q11_PassCourse_output.txt) |
| 12 | [Q12_SmallestOfFour.java](Q12_SmallestOfFour.java) | Find the smallest of four numbers using nested ternary operators. | [output](output/Q12_SmallestOfFour_output.txt) |
| 13 | [Q13_CharacterTypeTernary.java](Q13_CharacterTypeTernary.java) | Check if a character is a vowel, consonant, digit or special symbol | [output](output/Q13_CharacterTypeTernary_output.txt) |
| 14 | [Q14_SwapUsingXOR.java](Q14_SwapUsingXOR.java) | Swap two integers without using a temporary variable (use XOR). | [output](output/Q14_SwapUsingXOR_output.txt) |
| 15 | [Q15_CountSetBits.java](Q15_CountSetBits.java) | Count the number of set bits (1s) in the binary representation of a number | [output](output/Q15_CountSetBits_output.txt) |
| 16 | [Q16_ShiftMultiplyDivide.java](Q16_ShiftMultiplyDivide.java) | Perform fast multiplication and division of a number by powers of two | [output](output/Q16_ShiftMultiplyDivide_output.txt) |
| 17 | [Q17_RotateBitsLeft.java](Q17_RotateBitsLeft.java) | Cyclically rotate the bits of an integer to the left by 2 positions. | [output](output/Q17_RotateBitsLeft_output.txt) |
| 18 | [Q18_Fibonacci.java](Q18_Fibonacci.java) | Print the first 20 terms of the Fibonacci sequence using a for loop. | [output](output/Q18_Fibonacci_output.txt) |
| 19 | [Q19_ArmstrongNumbers.java](Q19_ArmstrongNumbers.java) | Print all Armstrong numbers between 1 and 1000 using a for loop. | [output](output/Q19_ArmstrongNumbers_output.txt) |
| 20 | [Q20_PasswordCheck.java](Q20_PasswordCheck.java) | Repeatedly accept a password until the correct one is entered (use do-while). | [output](output/Q20_PasswordCheck_output.txt) |
| 21 | [Q21_FactorsDoWhile.java](Q21_FactorsDoWhile.java) | Display all factors of a number using a do-while loop. | [output](output/Q21_FactorsDoWhile_output.txt) |
| 22 | [Q22_ReverseDigits.java](Q22_ReverseDigits.java) | Reverse the digits of an integer using a while loop. | [output](output/Q22_ReverseDigits_output.txt) |
| 23 | [Q23_PalindromeWhile.java](Q23_PalindromeWhile.java) | Determine if a number is a palindrome using a while loop. | [output](output/Q23_PalindromeWhile_output.txt) |
| 24 | [Q24_MaxMinForEach.java](Q24_MaxMinForEach.java) | Find the maximum and minimum values in an integer array using a for-each loop. | [output](output/Q24_MaxMinForEach_output.txt) |
| 25 | [Q25_AverageMarks.java](Q25_AverageMarks.java) | Calculate the average marks of students stored in a 2D array using a for-each loop. | [output](output/Q25_AverageMarks_output.txt) |
| 26 | [Q26_WeekdayOrWeekend.java](Q26_WeekdayOrWeekend.java) | Take a day number (1-7) and display whether it is a weekday or weekend using switch-case. | [output](output/Q26_WeekdayOrWeekend_output.txt) |
| 27 | [Q27_GradeMeaning.java](Q27_GradeMeaning.java) | Take a grade (A-F) and print its qualitative meaning using switch-case. | [output](output/Q27_GradeMeaning_output.txt) |
| 28 | [Q28_SkipPerfectSquares.java](Q28_SkipPerfectSquares.java) | Print numbers from 1 to 50, skipping all perfect squares using continue. | [output](output/Q28_SkipPerfectSquares_output.txt) |
| 29 | [Q29_RandomBreak.java](Q29_RandomBreak.java) | Generate random integers between 1 and 100 and stop when a number divisible | [output](output/Q29_RandomBreak_output.txt) |
| 30 | [Q30_MixedAdvanced.java](Q30_MixedAdvanced.java) | Mixed program: | [output](output/Q30_MixedAdvanced_output.txt) |
