package com.example.diego.trabalhoandroidagenda;

import com.firebase.client.Firebase;

/**
 * Created by Diego on 21/04/2016.
 */
public class FirebaseUtil {
    //Classe para prover conexao com firebase
    private static Firebase firebase;
    private static final String URL ="https://auladalto.firebaseio.com/";


    /**
     *
     * @return  retorna conexao com firebase se a conexao ja exirtir mantem a mesma
     */
    public static Firebase getFirebase(){
        if( firebase == null ){
            firebase = new Firebase(URL);
        }
        return( firebase );
    }
}
