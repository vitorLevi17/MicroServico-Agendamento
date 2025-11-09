package com.MicroServico_Agendamento.Service.Exceptions;

public class NotFound extends RuntimeException{
    public NotFound(String mensagem){
        super(mensagem);
    }
}
