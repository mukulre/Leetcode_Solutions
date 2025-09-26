from collections import Counter
import heapq

class Solution(object):
    def topKFrequent(self, words, k):
        counter = Counter(words)
        heap = [(-freq, word) for word, freq in counter.items()]
        heapq.heapify(heap)
        return [heapq.heappop(heap)[1] for _ in range(k)]