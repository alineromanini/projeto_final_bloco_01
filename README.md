# Projeto Final Bloco 1 - Java

<br />

<div align="center">
	<img src="https://i.imgur.com/IaD4lwg.png" title="source: imgur.com" width="35%"/>
</div>
<br />

<div align="center">
  <img src="https://img.shields.io/github/languages/top/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/repo-size/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/languages/count/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/last-commit/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/issues/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/issues-pr/rafaelq80/aulas_java_t82?style=flat-square" />
</div>

------

<br />

## 1. Descrição

<br />


A **Livraria Gen** é um sistema de gestão de biblioteca projetado para simular e administrar operações relacionadas à livrarias. Oferece funcionalidades como **cadastro**, **consulta**, **atualização** e **remoção** de itens.

O sistema organiza as informações dos clientes — incluindo nome dos itens, categoria e preço — garantindo a realização segura das operações. Seu principal objetivo é automatizar e simplificar o gerenciamento de estoque, como inclusão, adição, consulta, alteração e exclusão promovendo agilidade e precisão na gestão do negócio.

Este projeto, desenvolvido em **Java**, foca no estudo e aplicação dos conceitos de **Programação Orientada a Objetos (POO)**, incluindo:

- Classes e Objetos;
- Atributos e Métodos;
- Modificadores de Acesso;
- Herança e Polimorfismo;
- Classes Abstratas;
- Interfaces.

Além de servir como um simulador funcional, o projeto oferece uma base prática para compreender os princípios fundamentais da POO aplicados a um cenário realista.

<br />

## 2. Funcionalidades do Projeto

<br />

1. **Cadastrar item** 
2. **Listar todos os itens** 
3. **Consultar item pelo ID** 
4. **Atualizar item** 
5. **Excluir item**

<br />

## 3. Diagrama de Classes

<br />

Um **Diagrama de Classes** é um modelo visual usado na programação orientada a objetos para representar a estrutura de um sistema. Ele exibe classes, atributos, métodos e os relacionamentos entre elas, como associações, heranças e dependências.

Esse diagrama ajuda a planejar e entender a arquitetura do sistema, mostrando como os componentes interagem e se conectam. É amplamente utilizado nas fases de design e documentação de projetos.

Abaixo, você confere o Diagrama de Classes do Projeto Livraria da Gen:

```mermaid
classDiagram
class Produto {
  - id: int
  - item: int
  - categoria: int
  - titular: String
  - preco: float
  + get id() int
  + get item() String
  + get categoria() int
  + get preco() float
  + set id(id: int) void
  + set item(item: int) void
  + set categoria(categoria: int) void
  + set titular(titular: String) void
  + set preco(preco: float) void
  + visualizar() void
}
class Livro {
  - titulo: String
  + get titulo() String
  + set titulo(titulo: String) void
  + visualizar() void
}
class Papelaria {
  - quantidade: int
  + get quantidade() int
  + set quantidade(quantidade: int) void
  + visualizar() void
}
Livro --> Produto
Papelaria --> Produto
```

<br />

## 4. Tela Inicial do Sistema - Menu

<br />

<div align="center">
   <img src="https://i.imgur.com/ELEXVLN.png" title="source: imgur.com" width="70%"/>
</div>


<br />

## 5. Requisitos

<br />

Para executar os códigos localmente, você precisará de:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Eclipse](https://eclipseide.org/) ou [STS](https://spring.io/tools)

<br />

## 6. Como Executar o projeto no Eclipse/STS

<br />

### 6.1. Importando o Projeto

1. Clone o repositório do [Projeto Livraria Gen]() (https://github.com/alineromanini/projeto_final_bloco_01) dentro da pasta do *Workspace* do Eclipse/STS

```bash
git clone https://github.com/alineromanini/projeto_final_bloco_01
```

2. **Abra o Eclipse/STS** e selecione a pasta do *Workspace* onde você clonou o repositório do projeto
3. No menu superior do Eclipse/STS, clique na opção: **File 🡲 Import...**
4. Na janela **Import**, selecione a opção: **General 🡲 Existing Projects into Workspace** e clique no botão **Next**
5. Na janela **Import Projects**, no item **Select root directory**, clique no botão **Browse...** e selecione a pasta do Workspace onde você clonou o repositório do projeto
6. O Eclipse/STS reconhecerá automaticamente o projeto
7. Marque o Projeto Conta Bancária no item **Projects** e clique no botão **Finish** para concluir a importação

<br />

### 6.2. Executando o projeto

1. Na guia **Package Explorer**, localize o Projeto Conta Bancária
2. Abra a **Classe Menu**
3. Clique no botão **Run** <img src="https://i.imgur.com/MtBQjUp.png" title="source: imgur.com" width="3%"/> para executar a aplicação
4. Caso seja perguntado qual é o tipo do projeto, selecione a opção **Java Application**
5. O console exibirá o menu do Projeto.

<br />

## 7. Contribuição

<br />

Este repositório é parte de um projeto educacional, mas contribuições são sempre bem-vindas! Caso tenha sugestões, correções ou melhorias, fique à vontade para:

- Criar uma **issue**
- Enviar um **pull request**
- Compartilhar com colegas que estejam aprendendo Java!

<br />

##  8. Contato

<br />

Desenvolvido por [**Aline Romanini**](https://github.com/alineromanini)
Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue.