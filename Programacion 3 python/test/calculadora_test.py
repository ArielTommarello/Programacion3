from src.calculadora import Calculadora
from unittest import TestCase

class CalculadoraTest(TestCase):
    
    def test_suma_ok(self):
        calc=Calculadora()
        assert calc.suma(2,3) ==5
    def test_resta_ok(self):
        calc=Calculadora()
        assert calc.resta(2,1)==1