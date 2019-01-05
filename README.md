# addOne
Adds one to an array of integers

Eg, [1, 2, 3, 5] -> [1, 2, 3, 6]
Takes into consideration edge cases such as:
  - Array ends with a 9, carry is required - [1, 2, 3, 9] -> [1, 2, 4, 0]
  - Starts with only 0 - [0] -> [1]
  - Holds all nines - [9, 9, 9] -> [1, 0, 0, 0]
  
Also includes testing with output displayed
