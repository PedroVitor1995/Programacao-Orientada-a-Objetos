# Exercícios sobre herança, polimorfismo, sobrecarga e sobrescrita

# Questão 04

Animal a = new Bovino();

a.setProducaoLeite(5);

O problema é que o tipo do objeto instaciado Animal criado não pode acessar a classe filha Bovino
A solução seria criar um objeto Bovino

Peixe p = new Animal();

Não é possivel, pois não pode instaciar um objeto tipo Peixe com um objeto do 
tipo Animal

# Questão 05

Porque o tipo do array é possivel instanciar objetos descendentes de uma classe pai

# Questão 11

(V) em uma instancia b da classe B, se fizermos b instanceof A retorna true
(V) em uma instancia a da classe A, se fizermos a instanceof B retorna false
(F) B possui o atributo1
(V) Em B o atributo não é visível
(V) Caso o atributo fosse modificado de private para protected, poderia ser
acessado normalmente em B

# Questão 12

metodo 1, classe B

# Questão 13

Ocorre um erro, pois o metodo2 não exxiste em A

# Questão 14

metodo 1, classe A

# Questão 16

O código não é compilável porque existe dois metodos com mesmo nome e o
mesmo tipo de retorno e com a mesma quantidade de parametro

# Questão 17

Existe dois metodos com mesmo nome e o mesmo tipo de retorno e
com a mesma quantidade de parametro