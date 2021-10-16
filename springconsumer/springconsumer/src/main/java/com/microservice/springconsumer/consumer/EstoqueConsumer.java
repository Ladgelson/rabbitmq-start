package com.microservice.springconsumer.consumer;

import constants.RabbitMQConstants;
import dto.EstoqueDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitMQConstants.FILA_ESTOQUE)
    private void consumidor(EstoqueDto estoqueDto) {
        System.out.println(estoqueDto.codigoProduto);
        System.out.println(estoqueDto.quantidade);
    }
}
