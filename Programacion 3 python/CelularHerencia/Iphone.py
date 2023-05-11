from Celular import Celular
from abc import ABC,abstractmethod

from EmptyBatteryException import EmptyBatteryException

class Iphone(Celular):

    def __init__(self, nombre):
        super().__init__(nombre)    
        self.modelo=''            
        self.llamada=0.01        
        self.maxBat=5
        self.bateria=self.maxBat
        


    def realizarLlamada(self,duracion):
        if(self.bateria==0):
             raise EmptyBatteryException("La bateria del Iphone esta vacia no puede hacer mas llamados, carguela",527)  
        else:
            self.bateria=self.bateria-(duracion*self.llamada)


    def consultarBat(self):  
       if(self.bateria==0):
            raise EmptyBatteryException("La bateria del Iphone esta vacia, carguela",627)        
       else:        
        print(f"La bateria  del Iphone  {self.modelo} de {self.nombre} es de {self.bateria}")
        super().consultarBat

    def recargaCelular(self):
        self.bateria=self.maxBat             

