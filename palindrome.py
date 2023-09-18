"""
Problem 2:  Determine whether a given string is Palindrome
A string “madam” is a palindromic string because it reads the same forwards and backward. 
Input: “anna”
Output: true

Input: “India”
Output: false

"""

class Palindrome:
    """ Class Representing the Palinndrome"""
    def __init__(self, string):
        self.string = string

    def is_palindrome(self):
        """ Function check if string palindrome or not"""
        return (self.string == self.string[::-1])
    
anna = Palindrome("anna")
print(anna.is_palindrome())

India = Palindrome("India")
print(India.is_palindrome())
