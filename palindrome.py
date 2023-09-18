"""
Problem 2:  Determine whether a given string is Palindrome
A string “madam” is a palindromic string because it reads the same forwards and backward. 
Input: “anna”
Output: true

Input: “India”
Output: false

"""

# str = "iliy"

# def isPalindrome(s):
#     return s == s[::-1]

# check = isPalindrome(str)
# print(check)

class Palindrome:
    """ Class Representing the Palinndrome"""
    def __init__(self, string) -> None:
        self.string = string

    def is_palindrome(self):
        """ Function check if string palindrome or not"""
        return self.string == self.string[::-1]
    
