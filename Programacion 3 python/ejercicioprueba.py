def suma(n1,n2):
    res=n1+n2
    return res

def main():
    n1=int(input("Ingresa n1: "))
    n2=int(input("Ingresa el n2 "))
    resultado=suma(n1,n2)
    print(f'El resultado es: {resultado}')    

if __name__=='__main__':
  main()