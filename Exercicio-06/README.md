# Exercícios sobre herança, polimorfismo, sobrecarga e sobrescrita

# Questão 04

Animal a = new Bovino();
a.setProducaoLeite(5);

O problema é que o tipo do objeto instaciado Animal criado não pode acessar a classe filha Bovino
A solução seria criar um objeto Bovino

Peixe p = new Animal();

Não é possivel, pois não pode instaciar um objeto tipo Peixe com um objeto do 
tipo Animal

# Questão 04

Porque o tipo do array é possivel instanciar objetos descendentes de uma classe pai