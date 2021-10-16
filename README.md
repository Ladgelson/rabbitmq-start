# RabbitMQ e Microservicos

![rabbitmq-start](https://user-images.githubusercontent.com/45443883/137604465-4a208835-6c0c-42a8-8bd6-cad89d3d903b.png)

## Estrutura do projeto

- 1) Uma collection simbolizando o client que aciona o microservico

- 2) Um serviço que cria, faz bind e redireciona as mensagens para as filas de estoque e preço de acordo com o modelo direct

- 3) O proprio RabbitMQ

- 4) Um serviço em spring para consumir mensagens da fila de estoque

- 5) Um serviço em nodejs para consumir as mensagens da fila de preço

Thats all, primeiros passos com RabbitMQ!
