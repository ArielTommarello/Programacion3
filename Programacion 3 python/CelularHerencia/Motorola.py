from Celular import Celular
from abc import ABC,abstractmethod

from EmptyBatteryException import EmptyBatteryException

class Motorola(Celular):

    def __init__(self, nombre):
        super().__init__(nombre)    
        self.modelo=''            
        self.llamada=0.25        
        self.maxBat=5
        self.bateria=self.maxBat
        


    def realizarLlamada(self):         
        if(self.bateria==0):
             raise EmptyBatteryException("La bateria del Iphone esta vacia no puede hacer mas llamados, carguela",827)  
        else:
            self.bateria=self.bateria-self.llamada

    def consultarBat(self):       
        if(self.bateria==0):
             raise EmptyBatteryException("La bateria del Iphone esta vacia, carguela",327)
        else:  
            print(f"La bateria  del Motorola  {self.modelo} de {self.nombre} es de {self.bateria}")
            super().consultarBat

    def recargaCelular(self):
        self.bateria=self.maxBat             






    
 