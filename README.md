Proflex Backend (Java)

Desenvolvido por Fernando Fogaça
Professor: Elberth Moraes
Entrega TP01, TP02 e TP03 – 2025

Visão Geral

Este repositório guarda a evolução do backend do Proflex, um sistema que estou desenvolvendo para organizar e acompanhar pacientes, consultas e informações clínicas.
A proposta é criar uma base em Java que, mais para frente, será conectada ao Proflex Web e ao Proflex Mobile.

O projeto cresceu aos poucos durante os TPs.
No TP01 foi montada a estrutura inicial.
No TP02 o sistema passou a receber dados pelo console.
No TP03 entrou a parte da POO, com novas classes, enums e métodos organizados.

TP01 – Estrutura Inicial

O TP01 serviu para configurar tudo e começar com as primeiras classes.

O que foi feito:

Configuração do JDK 21 e Eclipse

Criação do projeto base usando Spring Boot

Primeiras classes:

Paciente

Endereco

Criação de objetos e impressão no console

Testes simples com entrada de dados e debug no Eclipse

Estrutura inicial:
fogaca_api/
└── src/main/java/br/edu/infnet/fogaca_api/
    ├── FogacaApiApplication.java
    ├── model/domain/Paciente.java
    └── model/domain/Endereco.java


O sistema exibia alguns pacientes fixos criados direto no código.

TP02 – Entrada de Dados, Validações e Controle de Fluxo

No TP02 o código virou um pequeno sistema de console com menu.

Implementações:

Menu principal com:

Cadastrar paciente

Listar pacientes

Buscar por nome

Sair

Entrada com Scanner

Lista de pacientes usando ArrayList

Validações básicas (nome vazio, idade inválida, etc.)

Laço while mantendo o sistema rodando até o usuário sair

Esse TP garantiu prática com condicionais e repetições.

TP03 – Programação Orientada a Objetos

O TP03 levou o projeto para a estrutura de POO, com novas classes e organização mais completa.

O que foi adicionado:
1. Novas classes e enums

Genero (enum)

TipoConsulta (enum)

Consulta (classe representando a consulta do paciente)

2. Melhorias na classe Paciente:

Atributos privados

Getters e setters

Construtores diferentes

Código simples de identificação do paciente

Métodos como:

registrar consulta

exibir resumo

checar email

mostrar dados atualizados

3. Novas opções no sistema:

O menu ganhou a parte de registrar consulta de um paciente.

4. Testes no main:

Todos os objetos criados foram testados no próprio menu.

Aprendizados ao longo dos TPs

Durante o TP01, TP02 e TP03 foram praticados:

Criação de projetos Java

Classes, objetos, atributos e métodos

Construtores e sobrecarga

Uso de enums

Encapsulamento

Laços de repetição e condicionais

Organização em pacotes

Interação via console

Relacionamento entre classes

Tudo isso fez o sistema evoluir de um código fixo para algo interativo e depois para algo mais próximo de um modelo real de sistema.

Próximos Passos (para frente)

Criar camada de serviço

Separar melhor responsabilidades

Preparar primeiros endpoints REST

Integrar futuramente com o Proflex Web e Mobile

Outros Repositórios do Proflex

Proflex Web (React):
github.com/FernandoFogaca/proflex

Proflex Mobile (React Native):
github.com/FernandoFogaca/ProflexApp

Status Final

TP01: concluído

TP02: concluído

TP03: concluído

Sistema testado no macOS com Eclipse IDE (2025-12 M1) e JDK 21.
