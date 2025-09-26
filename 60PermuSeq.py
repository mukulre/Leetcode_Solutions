import math

class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        self.digits = [i for i in range(1, n+1)]
        return self.extract(n, k)

    def extract(self, n, k):
        if len(self.digits) == 1:
            return str(self.digits[0])

        column_size = math.factorial(n - 1)
        i = (k - 1) // column_size
        k -= i * column_size
        
        ans = self.digits.pop(i)
        return str(ans) + self.extract(n-1, k)