from Sistema_Operativo import Sistema_Operativo
from T_Sistema import T_Sistema
from T_Usuario import T_Usuario


class Mainly:

    def main():

        usu=T_Usuario
        listaU=list()
        sis=T_Sistema
        listaS=list()
              
        acc=Sistema_Operativo

        usu=acc.crearTareaUsu(acc,"tarea1",1,190)
        listaU.append(usu)
        usu=acc.crearTareaUsu(acc,"tarea2",0,110)
        listaU.append(usu)
        usu=acc.crearTareaUsu(acc,"tarea3",0,190)
        listaU.append(usu)
        usu=acc.crearTareaUsu(acc,"tarea4",1,110)
        listaU.append(usu)   

        for us in len(listaU):            
           print(f"Nombre: {us._nombre}")
            
        

    if __name__ == '__main__':
        main()
    
             

            

