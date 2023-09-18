"""
Problem 1: Program to count occurrences of a given character in a string.

 Count character 'e' in the below string.
	Input "geeksforgeeks".
	Output: 4

	Count character '3' in the below string.
	Input "abccdefgaa."
	Output : 3
"""


class CountOccurances:
    """ Class representing a Counter"""
    def __init__(self, string, character):
        self.string = string
        self.character = character
        self.count = 0

    def counter(self):
        """ Method to calculate the count """
        for i, _str in enumerate(self.string):
            if _str == self.character:
                self.count += 1

        return f"Character '{self.character}' in {self.string} occurs {self.count} times."

i_in_india = CountOccurances("india",'i')
print(i_in_india.counter())


e_in_geeksforgeeks = CountOccurances("geeksforgeeks", 'e')
print(e_in_geeksforgeeks.counter())

_3_in_abccdefgaa = CountOccurances("abccdefgaa.", '3')
print(_3_in_abccdefgaa.counter())
