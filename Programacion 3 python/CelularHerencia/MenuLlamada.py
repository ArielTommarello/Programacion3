from Iphone import Iphone
from Motorola import EmptyBatteryException, Motorola


class MenuLLamada:

    def main():


        try:    
            cat=Iphone("Catalina")
            cat.modelo="XS"    


            cat.realizarLlamada(10)
            cat.consultarBat()
            cat.recargaCelular()
            cat.consultarBat()
        

        
            mot=Motorola("Juliana")
            mot.modelo="G5"
            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()

            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()

            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()

            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()

            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()
            mot.realizarLlamada()

            mot.realizarLlamada()
            

            mot.consultarBat()
            mot.recargaCelular()
            mot.consultarBat()
        except EmptyBatteryException as e:
            print(e)
         

    
    if __name__ == '__main__':
        main()
    
    

    

