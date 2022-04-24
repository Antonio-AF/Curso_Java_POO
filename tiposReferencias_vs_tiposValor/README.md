# Tipos referência Vs. Tipos Valor


## Classes são tipos referência

Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "tentáculos" (Ponteiros) para caixas.


Ex.:

```
Product p1, p2;

p1 = new Product("TV", 900.00, 0); // Na Stack o p1 recebe um endereço que representao espaço onde está alocado o Objeto no Heap.

p2 = p1 // p2 Não recebe uma cópia de p1 ele passa a apontar para o mesmo enderço de mémoria do Heap.

veja a imagen aseguir.

p2 = p1 
//p2 passa a apontar para onde p1 aponta.

```
![Imagem ilustra a memória de endereçamento](https://raw.githubusercontent.com/Antonio-AF/Curso_Java_POO/main/tiposReferencias_vs_tiposValor/src/aplication/Tipo%20Referencia.png)

Na memória, temos dois espaços que o sistema operacional disponibiliza ao carregar um programa, chamado de espaço de endereçamento Stack e Heap onde ficam alocados as variaveis e dados.

O Heap, denominado área de alocação dinâmica, é um espaço reservado para variáveis e dados criados durante a execução do programa (runtime). Em outras palvravas dizemos que o Heap é a memória Global do programa.

Já o Stack ou pilha de funções, é a área disponibilizada dentro da memória responsável por guardar as variáveis locais, dados e ponteiros caregados pelo programa. 

## Tipos primitivos são tipos valor.

Em Java, tipos primitivos são tipos valor. Tipos valor são Caixas e não ponteiros.

Ex.:

```
double x, y;

x = 10;

y = x;

y = x;

//y recebe uma cópia de x.

veja a imagen aseguir.

```
![Imagem ilusta o endereçamento de memória](https://raw.githubusercontent.com/Antonio-AF/Curso_Java_POO/main/tiposReferencias_vs_tiposValor/src/aplication/Tipo%20Valor.png)
