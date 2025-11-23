package com.MicroServico_Agendamento.Config;

import com.MicroServico_Agendamento.DTO.ConsultaDTO;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String bootstrapAddres;

    public ProducerFactory<String, ConsultaDTO> consultaProducerFactory(){
        Map<String,Object> props = new HashMap<>();
        props.put(JsonSerializer.ADD_TYPE_INFO_HEADERS,false);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,false);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(props);
    }
    @Bean
    public KafkaTemplate<String, ConsultaDTO> consultaKafkaTemplate() {
        return new KafkaTemplate<>(consultaProducerFactory());
    }
}
