package com.MicroServico_Agendamento.Controller;

import com.MicroServico_Agendamento.Service.ConsultaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaController {

    private final ConsultaService service;

    public ConsultaController(ConsultaService service) {
        this.service = service;
    }
    // NÃO OBRIGATORIA
    // VERIFICAR RETORNO HORÁRIO
    @GetMapping("consulta/{id}")
    public ResponseEntity getConsultaId(@PathVariable Long id){
        var consulta = service.buscarAgendamento(id);
        return ResponseEntity.ok(consulta);
    }
}
