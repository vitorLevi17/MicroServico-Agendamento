package com.MicroServico_Agendamento.DTO;

import java.util.List;

public record ListExceptionsDTO(List<String>errors, int status) {
}
