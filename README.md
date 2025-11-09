Proflex Backend (Java)
Developed by Fernando Fogaça

Professor: Elberth Moraes
Version: TP01 and TP02 – 2025

Overview

Este projeto marca o início do Proflex Backend, uma aplicação desenvolvida em Java que servirá como base para o Proflex Web e o Proflex Mobile.
O objetivo é criar um sistema completo para profissionais autônomos de fisioterapia e bem-estar, permitindo o gerenciamento de pacientes, consultas e registros clínicos.

Durante o TP01 e o TP02, foram aplicados os principais fundamentos da linguagem Java, com foco na construção de programas simples, leitura de dados, validações e estruturação de classes.

TP01   Fundamentos e Estrutura Inicial

A primeira etapa teve como foco o ambiente de desenvolvimento e os conceitos básicos da linguagem.

Etapas concluídas

Instalação e configuração do JDK 21 e Eclipse IDE

Criação do projeto base Spring Boot (fogaca_api)

Implementação das primeiras classes:

Paciente – armazena informações do paciente

Endereco – representa os dados de endereço

Uso de variáveis e tipos primitivos (String, int, boolean)

Leitura de dados do usuário com Scanner

Impressão de informações no console (System.out.println)

Introdução ao debug e inspeção de variáveis no Eclipse

Estrutura do projeto (TP01)
fogaca_api/
├── src/
│   ├── main/java/br/edu/infnet/fogaca_api/
│   │   ├── FogacaApiApplication.java
│   │   ├── model/domain/Paciente.java
│   │   └── model/domain/Endereco.java
│
├── pom.xml
└── README.md

Resultado

O sistema foi capaz de criar objetos de paciente e endereço manualmente, exibindo os dados no console.
Essa base serviu de ponto de partida para a próxima fase, onde o programa passou a receber entradas dinâmicas do usuário.

TP02 – Controle de Fluxo, Entrada de Dados e Validação

Na segunda etapa, o projeto foi aprimorado com estruturas condicionais, repetições e validações de entrada.
O sistema passou a funcionar de forma interativa, simulando um pequeno menu de cadastro.

Funcionalidades implementadas

Menu principal com quatro opções:

Cadastrar novo paciente

Listar pacientes

Buscar paciente por nome

Sair do sistema

Entrada de dados via console com a classe Scanner

Validação de campos obrigatórios (nome, idade, cidade, etc.)

Armazenamento em lista (ArrayList<Paciente>) para guardar múltiplos cadastros

Estruturas de decisão (if, else if, else) para controlar o fluxo

Laço de repetição while para manter o sistema em execução até o usuário optar por sair

Exemplo de execução
=== Sistema Proflex ===

--- MENU PRINCIPAL ---
1 - Cadastrar novo paciente
2 - Listar pacientes
3 - Buscar paciente por nome
4 - Sair
Escolha uma opção: 1

--- CADASTRO DE PACIENTE ---
Nome: Fernando Fogaça
Idade: 35
Email: fernando@proflex.com
Telefone: (63)8077-7605
Rua: Argostraat 150
Bairro: Centro
Cidade: Campos
Estado: RJ
CEP: 28000-000
Paciente cadastrado com sucesso!


O sistema permanece ativo até que o usuário escolha a opção “4 - Sair”.
Durante o cadastro, são feitas verificações básicas para evitar campos vazios ou incorretos.

Learning Outcomes

Durante o desenvolvimento do TP01 e TP02, foram consolidados os seguintes aprendizados:

Criação e execução de projetos Java no Eclipse

Uso de classes, atributos, construtores e métodos

Manipulação de listas (ArrayList) e objetos

Aplicação de estruturas condicionais e de repetição

Validação de entradas e controle de fluxo

Organização de pacotes (model/domain)

Interação com o usuário via console

Essas etapas reforçaram o domínio dos conceitos básicos da linguagem Java, conectando teoria e prática em um projeto real.

Next Steps (TP03 Preview)

A próxima etapa (TP03) dará continuidade à evolução do sistema, abordando:

Introdução à Programação Orientada a Objetos (POO) completa

Criação de herança e polimorfismo

Separação em camadas de serviço e controle

Início da implementação de endpoints REST.


Proflex é um sistema multiplataforma criado para auxiliar profissionais de fisioterapia e saúde integrativa no gerenciamento de atendimentos e pacientes.

Versões relacionadas:

Web (React): github.com/FernandoFogaca/proflex

Mobile (React Native): github.com/FernandoFogaca/ProflexApp

O Backend em Java é a nova camada que vai integrar essas aplicações por meio de uma API unificada.

Author’s Note

Este projeto foi desenvolvido como parte das atividades da disciplina de Programação em Java.
O objetivo foi aprender os conceitos da linguagem utilizando um projeto próprio e real — o Proflex — em vez de exemplos genéricos.

Status

TP01 – Concluído
TP02 – Concluído e funcional
TP03 – Em desenvolvimento (próxima etapa)

Sistema testado no macOS com Eclipse IDE (2025-12 M1) e JDK 21.
