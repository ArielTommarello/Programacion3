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

        usu=acc.crearTareaUsu("tarea1",1,190)
        listaU.append(usu)
        usu=acc.crearTareaUsu("tarea2",0,110)
        listaU.append(usu)
        usu=acc.crearTareaUsu("tarea3",0,190)
        listaU.append(usu)
        usu=acc.crearTareaUsu("tarea4",1,110)
        listaU.append(usu)   

        sis=acc.crearTareaSis("TareaS1",9,120)
        listaS.append(sis)
        sis=acc.crearTareaSis("TareaS2",7,1203)
        listaS.append(sis)
        sis=acc.crearTareaSis("TareaS3",1,190)
        listaS.append(sis)
        sis=acc.crearTareaSis("TareaS4",0,120)
        listaS.append(sis)


        acc.Prioritario(listaS,listaU)

    if __name__ == '__main__':
        main()
    
             

            

