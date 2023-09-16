# Stream API - DIO


## Anotações 
Lambda e Method reference, algumas formas de simplificar o código.
- Lambda

São interfaces com um unico method e não tem uma assinatura igual os outros
methods, ficando (argumento) -> (corpo), exemplo:
 .mapToDouble(item -> item.getPreco() * item.getQuant()); 
Aqui eu declarei o argumento sendo item, e apos a "->" o que vai ser realizado.

- Method Reference

Surgiu no Java 8 sendo uma forma mais simples de *escrever* um Lambda, porém eu particularmente
acho um pouco mais complicado de entender na leitura de um código do que um lambda comum.
Para usa-lo, basta informar uma classe ou referência seguída do símbolo "::" e o nome do método sem os parenteses no final,
exemplo:
Comparator.comparingDouble(Pessoa::getAltura);

## Lambdas mais utilizadas

* Consumer<T>
é void e aceita argumentos

* BinaryOperator<T>
Combina 2 argumentos do tipo T e retorna um resultado do mesmo tipo.

* Function<T>
 Aceita um argumento do tipo T e retorna um resultado do tipo R
 usado para transformar ou mapear os elements do Stream em outros valores ou tipos.

* Predicate<T>
 Argumento do tipo T e retorna um boolean
 usado para filtrar elementos do Stream com base em alguma condição.

* Supplier

Não aceita nenhum argumento e retorna um resultado do tipo T.
Usado normalmente para criar ou fornecer novos objetos de um determinado tipo.