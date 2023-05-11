from Tarea import Tarea
from abc import ABC,abstractmethod

class T_Usuario(Tarea):

    def __init__(self):
        self._nombre=""
        self._prioridad=1
        self._tiempo_ejecucion=100

    def get_nombre(self):
        return self._nombre
    
    def set_nombre(self,valor):
        self._nombre=valor

    _nombre=property(get_nombre,set_nombre)


    def get_prioridad(self):
        return self._prioridad
    
    def set_prioridad(self,valor):
        self._prioridad=valor

    _prioridad=property(get_prioridad,set_prioridad)    

    def get_tiempo_ejecucion(self):
        return self._tiempo_ejecucion
    
    def set_tiempo_ejecucion(self,valor):
        self._tiempo_ejecucion=valor

    _tiempo_ejecucion=property(get_tiempo_ejecucion,set_tiempo_ejecucion)    