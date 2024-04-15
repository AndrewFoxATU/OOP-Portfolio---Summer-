import unittest
from src.Counter import Counter

class CounterTest(unittest.TestCase):

    def setUp(self):
        self.myCount = Counter()

    def test_add(self):
        self.assertEqual(1, self.myCount.inc())

    def test_sub(self):
        self.assertEqual(-1, self.myCount.dec())


if __name__ == '__main__':
    unittest.main()
