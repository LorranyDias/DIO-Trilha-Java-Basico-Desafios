# iPhone - Projeto de Simulação de um iPhone 📱

## Descrição

Este projeto é uma simulação de um iPhone, implementada em Diagrama UML. O objetivo é demonstrar o funcionamento de um iPhone, utilizando conceitos de programação orientada a objetos, como herança e polimorfismo.
## Funcionalidades

O projeto inclui as seguintes funcionalidades:

* **Chamadas Telefônicas:**
    * Fazer Ligações 📞
    * Atender Chamadas
    * Encerrar Ligações
    * Iniciar Correio de Voz  :speech_balloon:
* **Música:**
    * Tocar Música :musical_note:
    * Pausar Música :pause_button:
    * Selecionar Música 
* **Navegador:**
    * Exibir Páginas :link:
    * Adicionar Abas
    * Atualizar Páginas 🔄
    * Fechar Abas ❌
* **Outras Funcionalidades:**
    * Ligar/Desligar o iPhone 📴
    * Ajustar Volume 🔊
    * Bloquear/Desbloquear Tela

## Arquitetura do Projeto

O projeto é estruturado da seguinte forma:

* **Classe Principal:** **`iPhone`** - Classe base que define as funcionalidades comuns a todos os iPhones.
* **Classes Derivadas:**
    * **`ReprodutorDeMusica`** - Classe que implementa as funcionalidades de reprodução de música.
    * **`AparelhoTelefonico`** - Classe que implementa as funcionalidades de chamadas telefônicas.
    * **`NavegadorInternet`** - Classe que implementa as funcionalidades do navegador de internet.
    
    * ## Diagrama UML do Projeto iPhone

```plantuml
@startuml
class iPhone {
    +ligar() : void
    +desligar() : void
    +ajustarVolume() : void
    +bloquearTela() : void
    +desbloquearTela() : void
    +fazerLigação(numero : String) : Void 
    +encerrarLigação() : Void
    +tocarMusica(nomeDaMusica : String) : Void
    +abrirNavegador(url : String) : Void
}

ReprodutorDeMusica --|> iPhone
AparelhoTelefonico --|> iPhone
NavegadorInternet --|> iPhone

class ReprodutorDeMusica {
    +tocar() : void
    +pausar() : void
    +selecionarMusica(musica : String) : void
}

class AparelhoTelefonico {
    +ligar(numero : String) : Void
    +atender() : Void
    +iniciarCorreioDeVoz() : Void 
}

class NavegadorInternet {
    +exibirPagina(url : String) : void 
    +adicionarNovaAba() : void 
    +atualizarPagina() : void
    +fecharAba() : void
}

@enduml
  