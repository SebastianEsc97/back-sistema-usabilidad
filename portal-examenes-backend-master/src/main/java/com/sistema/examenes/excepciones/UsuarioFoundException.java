package com.sistema.examenes.excepciones;

public class UsuarioFoundException extends  Exception{

    public UsuarioFoundException(){
        super("El nombre de usuario ya existe, vuelva a intentar");
    }

    public UsuarioFoundException(String mensaje){
        super(mensaje);
    }
}
