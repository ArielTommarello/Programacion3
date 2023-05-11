from Ejercicio3Practica.T_Sistema import T_Sistema
from Ejercicio3Practica.T_Usuario import T_Usuario


class Sistema_Operativo:

   
    def crearTareaUsu(self,nombre,prioridad,tiempo):
        usu=T_Usuario
        usu.set_nombre(nombre)
        usu.set_prioridad(prioridad)
        usu.set_tiempo_ejecucion(tiempo)
        return usu


    def crearTareaSis(self,nombre,prioridad,tiempo):
        sis=T_Sistema
        sis.set_nombre(nombre)
        sis.set_prioridad(prioridad)
        sis.set_tiempo_ejecucion(tiempo)
        return sis


    def Alternado(self,lista1,lista2):
        pass
        

    def Secuencial(self,lista1,lista2):
        for num in lista1:
            lista1.pop(num)
        for num2 in lista2:
            lista2.pop(num2)

        else:
            print("Secuencial Finalizado")      

    def Prioritario(self,lista1,lista2):
        lista1.sort(key=get_prioridad(_prioridad),reverse=True)

        n=lista1.get_prioridad()
        lista2.sort(key=get_prioridad(_prioridad),reverse=True)
        m=lista2.get_prioridad()

        while n!=0:
            lista1.pop()
            if n==0:
                while m==1:
                    lista2.pop()
                for num in lista1:
                    lista1.pop()
                    for num2 in lista2:
                        lista2.pop() 

        print("Prioritario Finalizado")                      




                



        
        
        
    

    




    
