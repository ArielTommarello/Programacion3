from abc import ABC,abstractmethod

class Tarea(ABC):

    def __init__(self):
        self._nombre=""
        self._prioridad=0
        self._tiempo_ejecucion=0


