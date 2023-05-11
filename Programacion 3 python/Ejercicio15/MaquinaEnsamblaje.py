from Dron import Dron
from Ensamble import Ensamble
from BrazoRobotico import BrazoRobotico
from SensorInfrarrojo import SensorInfrarrojo
from Taser import Taser


class MaquinaEnsamblaje():
    
    def procesarEnsamble(self,dron):

        menosDos=dron._ensamble._peso-200
        vecesCincuenta=menosDos/50
        penalAltura=dron._altura*0.05
        penalVelocidad=dron._velocidad*0.02

        dron._altura=dron._altura-(penalAltura*vecesCincuenta)
        dron._velocidad=dron._velocidad-(penalVelocidad*vecesCincuenta)

        print("..::Finalizo el Ensamblado::..")


    