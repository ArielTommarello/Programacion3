from Dron import Dron
from MaquinaEnsamblaje import MaquinaEnsamblaje
from Ensamble import Ensamble
from BrazoRobotico import BrazoRobotico
from SensorInfrarrojo import SensorInfrarrojo
from Taser import Taser

class Empresa:
    
    def main():

        brazo=BrazoRobotico()
        sensor=SensorInfrarrojo()
        taser=Taser()

        dron=Dron("Dron A001",120,1800)
        dron._ensamble=taser     
                

        mEnsamble=MaquinaEnsamblaje()

        mEnsamble.procesarEnsamble(dron)

        print(f"Nombre: {dron._nomb}-Altura alcanzada: {dron._altura}-Velocidad Alcanzada: {dron._velocidad} -Ensamble tipo: {dron._ensamble._nombre}")

    if __name__ == "__main__":
        main()