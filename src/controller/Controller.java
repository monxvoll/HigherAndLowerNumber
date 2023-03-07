package controller;

import logic.Logic;

public class Controller {
    Logic Log = new Logic();

    public  String  Metod( String  EnterA, String EnterB ,String EnterC ){
        String aux ;
        int auxB;
        int auxC;
        int auxD;
        auxB = Integer.parseInt(EnterA);
        auxC = Integer.parseInt(EnterB);
        auxD = Integer.parseInt(EnterC);
        aux = Log.Mayor(auxB , auxC , auxD);
        return aux;
    }

    public  String  MetodDos( String  EnterA, String EnterB ,String EnterC ){
        String aux ;
        int auxB;
        int auxC;
        int auxD;
        auxB = Integer.parseInt(EnterA);
        auxC = Integer.parseInt(EnterB);
        auxD = Integer.parseInt(EnterC);
        aux = Log.Menor(auxB , auxC , auxD);
        return aux;
    }

}
