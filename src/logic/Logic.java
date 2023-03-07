package logic;

public class Logic {
    private int count;
    private int countDos;

    private String aux;

    public String Mayor ( int EnterA, int EnterB ,int EnterC ) {
        int numerosArreglo[] = {EnterA , EnterB , EnterC} ;
     for ( count = 0; count < numerosArreglo.length ; count++ ) {
        countDos = numerosArreglo[count] ;
        if ( countDos > EnterA && countDos > EnterB) {
            aux = countDos + "";
        } else if (countDos > EnterA && countDos > EnterC) {
            aux = countDos + "";
        }else if (countDos > EnterA && countDos > EnterB) {
            aux = countDos + "";
        }else if (countDos > EnterB && countDos > EnterC) {
            aux = countDos + "";
        }
     }
     return aux;
    }

    public String Menor ( int EnterA, int EnterB ,int EnterC ) {
        int numerosArreglo[] = {EnterA , EnterB , EnterC} ;
        for ( count = 0; count < numerosArreglo.length ; count++ ) {
            countDos = numerosArreglo[count] ;
            if ( countDos < EnterA && countDos < EnterB) {
                aux = countDos + "";
            } else if (countDos < EnterA && countDos < EnterC) {
                aux = countDos + "";
            }else if (countDos < EnterA && countDos < EnterB) {
                aux = countDos + "";
            }else if (countDos < EnterB && countDos < EnterC) {
                aux = countDos + "";
            }
        }
        return aux;
    }
}
