letrasDNI = {0:"T",1:"R",2:"W",3:"A",4:"G",5:"M",6:"Y",7:"F",8:"P",9:"D",10:"X",11:"B",12:"N",13:"J",14:"Z",15:"S",16:"Q",17:"V",18:"H",19:"L",20:"C",21:"K",22:"E"}


def comprobarDNI(dni): 
    # A COMPLETAR
    num = int(dni[0:8])
    letra = dni[-1:]
    resto = num % 23
    pruebaLetra = letrasDNI.get(resto)
    if (pruebaLetra == letra):
        print("DNI CORRECTO")
    else:
        print("DNI INCORRECTO")
#-------------------------------------

def gardarNota(diccionario, dni, nota):
    # A COMPLETAR 
    if (diccionario.get(dni) is None):
        diccionario[dni] = nota
    else: 
        diccionario.update({dni : diccionario[dni] + nota})

def consultarNota(diccionario, dni):
    if (dni not in diccionario):
        print("DNI de opositor/a incorrecto.")
    else:
        print("A nota acumulada do DNI ",dni," é: ",diccionario[dni])


dicionario = {}
comprobarDNI('76930562H')
gardarNota(dicionario,'11111111H',1.5) 
gardarNota(dicionario,'11111111H',2.5) 
gardarNota(dicionario,'22222222B',2.1) 
consultarNota(dicionario,'11111111H') 