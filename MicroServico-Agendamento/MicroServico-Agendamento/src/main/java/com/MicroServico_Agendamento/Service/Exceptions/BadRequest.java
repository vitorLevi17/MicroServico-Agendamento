package com.MicroServico_Agendamento.Service.Exceptions;

public class BadRequest extends RuntimeException{
    public BadRequest(String mensagem){
        super(mensagem);
    }
}
