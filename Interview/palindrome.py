def is_palindrome(s):
    # Remove spaces and convert to lowercase for accurate comparison
    cleaned_input = ''.join(s.split()).lower()
    return cleaned_input == cleaned_input[::-1]

if __name__ == "__main__":
    user_input = input("Enter a string: ")
    if is_palindrome(user_input):
        print(f'"{user_input}" is a palindrome.')
    else:
        print(f'"{user_input}" is not a palindrome.')
