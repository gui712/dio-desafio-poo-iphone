# DIO - Desafio Modelagem e Diagramação do Componente iPhone

Este repositório contém a resolução do desafio de POO da DIO, modelando o lançamento do iPhone de 2007 com suas três características principais: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Diagrama UML (Mermaid)

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class Iphone {
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
```

## Como Executar

1. Compile os arquivos Java localizados em `src/`.
2. Execute a classe `App.java` para ver a simulação dos métodos no console.