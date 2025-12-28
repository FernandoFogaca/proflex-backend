 - Proflex Backend (Java)

Aluno: Fernando Fogaça
Professor: Elberth Moraes
Disciplina: Fundamentos de Desenvolvimento com Java
Entrega: AT – Destaque 4

Sobre o projeto

Este repositório contém o backend do sistema Proflex, desenvolvido ao longo da disciplina de forma incremental. O objetivo do projeto é organizar pacientes, consultas e informações clínicas, utilizando Java e conceitos de Programação Orientada a Objetos.

O código foi evoluindo conforme os conteúdos vistos em aula, sempre mantendo o funcionamento via console e reaproveitando o que já tinha sido feito nos trabalhos anteriores.

Evolução do trabalho

No início do projeto (TP01) foi feita a configuração do ambiente com JDK 21 e Eclipse, além da criação das primeiras classes, como Paciente e Endereco, com testes simples no console.

No TP02 o sistema passou a receber dados pelo console, com um menu interativo. Foram selecionadas opções para cadastrar pacientes, listar e buscar registros, usando Scanner e ArrayList. Após o feedback do professor, o menu foi ajustado para usar o switch-case.

No TP03 o foco foi Programação Orientada a Objetos. Entraram novas classes e enumerações, como Consulta, Genero e TipoConsulta. A classe Paciente foi melhor organizada, com atributos privados, getters e setters, construtores diferentes e métodos específicos para controle das consultas.

AT – Recurso 4

No AT da Feature 4 o sistema foi aprimorado para ficar mais robusto.

Foi criada a classe abstrata Pessoa, e a classe Paciente passou a herdar dela, aplicando herança, abstração e polimorfismo. Os métodos foram sobrescritos e o uso de super foi aplicado nos construtores.

O encapsulamento foi reforçado com validações nos setters, evitando dados inválidos. Também foi implementado o encadeamento de construtores, conforme solicitado no feedback do professor.

O tratamento de erros foi feito com try/catch no menu principal e lançamento de abordagens com throw em casos de erro.

Além disso, foi adicionada a persistência de dados em arquivo texto, utilizando FileWriter e BufferedWriter, permitindo salvar os pacientes cadastrados.

O que foi corrigido a partir dos feedbacks

Menu configurado para usar switch-case (TP02).
Construtor chama outro construtor para evitar reprodução de código.
Validações adicionadas nos setters para reforçar o encapsulamento (TP03).

Status

TP01: concluídos
TP02: concluídos
TP03: concluídos
AT – Recurso 4: concluídos

Projeto testado no macOS com Eclipse IDE e JDK 21.
