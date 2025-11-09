package com.MicroServico_Agendamento.Service.Exceptions;

public class Conflict extends RuntimeException{
    public Conflict(String mensagem){
        super(mensagem);
    }
}
