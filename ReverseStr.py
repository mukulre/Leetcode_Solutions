class Stack:
    def __init__(self):
        self.stack = []

    def push(self, char):
        self.stack.append(char)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        return None

    def is_empty(self):
        return len(self.stack) == 0

def reverse_string(s):
    stack = Stack()
    for char in s:
        stack.push(char)

    reversed_s = ""
    while not stack.is_empty():
        reversed_s += stack.pop()

    return reversed_s

# Example usage:
original_string = "hello"
reversed_string = reverse_string(original_string)
print(f"Original string: {original_string}")
print(f"Reversed string: {reversed_string}")

def reverse_string(s):
    stack = list(s)
    reversed_s = ""
    while stack:
        reversed_s += stack.pop()
    return reversed_s



def reverse_string(s):
    return s[::-1]
