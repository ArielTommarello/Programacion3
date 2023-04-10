def suma(n1,n2,n3):
    res=n1+n2+n3
    return res

def prom(res):
    resultado=res/3
    return resultado

def main():

    n1=int(input("Ingrese Nota 1: "))
    n2=int(input("Ingrese Nota 2: "))
    n3=int(input("Ingrese Nota 3: "))

    resu=prom(suma(n1,n2,n3))
    if resu < 4:
     print("Insuficiente")
    if resu > 4 and resu < 6:
     print("Regular") 
    if resu > 6 and resu < 8:
     print("Bien")    
    if resu > 8 and resu < 9:
     print("Muy Bien")
    if resu > 9 and resu < 10:
     print("Excelente")    

     


if __name__=='__main__':
  main()