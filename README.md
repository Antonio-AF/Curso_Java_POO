#  Curso Java POO

Curso do Prof. Nelio Alves  Java e OO, UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB.


## O que é Java?
Java é uma linguagem de programação popular, criada em 1995, por **James Gosling**.

![A Figura 1 Temos a Foto do James Goslin.](https://javaapplications.files.wordpress.com/2011/05/james-gosling_11.jpg)

Nos dias de hoje o Java é propriedade da Oracle, e mais de 3 bilhões de dispositivos executam Java.

É usado para:

* Aplicativos móveis (especialmente aplicativos Android)
* Aplicativos de desktop
* Aplicações web
* Servidores web e servidores de aplicativos
* Jogos
* Conexão com banco de dados
* E muito, muito mais!


## Por que usar Java?

* Java funciona em diferentes plataformas (Windows, Mac, Linux, Raspberry Pi, etc.)
* É uma das mais populares linguagem de programação do mundo
* É fácil de aprender e simples de usar
* É de código aberto e gratuito
* É seguro, rápido e poderoso
* Ele tem um enorme apoio comunitário (dezenas de milhões de desenvolvedores)
* Java é uma linguagem orientada a objetos que dá uma estrutura clara aos programas e permite que o código seja reutilizado, reduzindo os custos de desenvolvimento
* Como java é perto de C++ e C#, torna mais fácil para os programadores mudar para Java ou vice-versa

# Introdução.

## Estes são os tipos primitivos numéricos:

    - byte: inteiro de 8 bits;
    - short: inteiro de 16 bits;
    - int: inteiro de 32 bits;
    - long: inteiro de 64 bits;
    - double: decimal de 32 bits;
    - float: decimal de 64 bits.

> Um dado do tipo String pertence a uma classe String, deixando de ser um dado primitivo.
> String não é um tipo primitivo - deriva de java.lang.Object.

## O segredo da portabilidade

Como mencionamos anteriormente, Java é independente de sistema operacional ou hardware. Isso dá o poder de portabilidade aos nossos programas. Sendo assim, um sistema escrito em Java desenvolvido, por exemplo, para Windows, pode ser facilmente adaptado para Linux, utilizando praticamente o mesmo código.

Diferentemente do Java, uma aplicação escrita em C, por exemplo, quando é compilada para linguagem de máquina, gera um executável com instruções de máquina específicas para um sistema operacional e hardware, não sendo portável para outros sistemas.

![A Figura 2 demonstra o funcionamento do Java.](https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/6/2/image001.gif)

Quando compilamos o código, não é gerado um executável específico para um sistema operacional, como acontece em outras linguagens de programação. O compilador, chamado javac, traduz o código para bytecodes, e estes bytecodes serão interpretados pela JVM.

A JVM é uma máquina de computação abstrata (não física) que executa instruções, vindas de bytecodes, no sistema operacional e hardware específico sob o qual está rodando.

No final das contas, o problema da portabilidade ainda existe, mas não é uma preocupação do desenvolvedor. Assim, basta instalar a versão correta da JVM no sistema desejado e seu aplicativo será portável.

A estrutura de funcionamento
do Java
Figura 1. A estrutura de funcionamento do Java
Para nossos exercícios, utilizaremos o sistema operacional Windows e criar as nossas primeiras aplicações em um simples bloco de notas. Não precisamos necessariamente de uma IDE (Integrated Development Environment ou em português, Ambiente de Desenvolvimento Integrado) como Eclipse ou NetBeans. As IDEs aceleram o desenvolvimento e nos dão maior produtividade, mas para iniciar, utilizaremos apenas um bloco de notas, que é o ideal até que você se familiarize com a linguagem. No entanto, antes de iniciar nossos estudos, vamos preparar o ambiente de desenvolvimento.
