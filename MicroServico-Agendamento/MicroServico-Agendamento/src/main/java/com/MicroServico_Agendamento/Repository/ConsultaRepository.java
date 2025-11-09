package com.MicroServico_Agendamento.Repository;

import com.MicroServico_Agendamento.Model.ConsultaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaModel,Long> {
}
