from abc import ABC,abstractmethod

class Celular(ABC):

    
    def __init__(self,nombre):
        self.nombre=nombre
        

    @abstractmethod
    def realizarLlamada(self):
        print(f"Estoy aca")

    @abstractmethod
    def consultarBat(self):
        print(f"Estoy aca")

    @abstractmethod
    def recargaCelular(self):
        print(f"Estoy aca")


