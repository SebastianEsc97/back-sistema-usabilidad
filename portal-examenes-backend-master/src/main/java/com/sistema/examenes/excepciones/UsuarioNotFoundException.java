package com.sistema.examenes.excepciones;

public class UsuarioNotFoundException extends Exception {

    public UsuarioNotFoundException(){
        super("El nombre de usuario ya existe, vuelva a intentar");
    }

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }
}
