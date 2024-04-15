import unittest
from src.Calc import Calc

class CalcTest(unittest.TestCase):

    def setUp(self):
        self.myCalc = Calc()

    def test_add(self):
        self.assertEqual(4, self.myCalc.add(2,2))

    def test_sub(self):
        self.assertEqual(3, self.myCalc.sub(6,3))


if __name__ == '__main__':
    unittest.main()
