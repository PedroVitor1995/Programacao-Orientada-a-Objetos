# Exercício sobre Exceções

# Questão 06

Sim, pois os metodos que são utilizados no método transferir estão sendo validados.

Sim, pois as validações que estão sendo feitas faz com uma operação seja feita feita
da forma correta sem que aconteça operação não permitida.

# Questão 08

Exceção Checada

    package Questao08;
    
    public class CheckedException {
    
        public static void main(String[] args) {
    
            int num1 = 10;
            int num2 = 0;
            int res = 0;
    
            try {
                res = num1 / num2;
            } catch (ArithmeticException ex) {
                throw new ArithmeticException("Não é possivel divisão por sero");
            }
        }
    }


Exceção não Checada

    package Questao08;

    public class UncheckedException {
    
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 0;
    
            System.out.println("A resposta da divisão é: " + num1/num2);
    
        }
    }


Adicionando o throws AplicacaoException aos métodos e aos construtores onde
são lançadas exception

# Questão 09

    package Questao09;

    public class TestaBloco {
        public static class TipoExcecao1 extends Exception{
            private String msg;
            public TipoExcecao1(String msg){
                super(msg);
                this.msg = msg;
            }
            public String getMessage(){
                return msg;
            }
        }

        public static class TipoExcecao2 extends Exception{
            private String msg;
            public TipoExcecao2(String msg){
                super(msg);
                this.msg = msg;
            }
            public String getMessage(){
                return msg;
            }
        }

        public static void main(String[] args) {
            try {
                int num = 12;
                if(num < 0)
                    throw new TipoExcecao1("Número negativo");
    
                String teste = "";
                if(teste.length() == 0)
                    throw new TipoExcecao2("String vazia");
            } catch (TipoExcecao1 ex) {
                System.out.println(ex.getMessage());
            } catch (TipoExcecao2 aEx) {
                System.out.println(aEx.getMessage());
            } finally {
                System.out.println("Programa finalizado com sucesso");
            }
        }
    }   

# Questão 10

Ocorrerá que o código não vai ser compilado, pois a TipoExcecao1 tem
ser depois da TipoExcecao2 no bloco.

# Questão 11

Na classe main será lançada a exceção RuntimeException que estar dentro do
primeiro try, e seguida será executado o primeiro catch, dentro desse catch
existe outro try que lança outra exceção RuntimeException que será executado o 
segundo catch onde é checada a exceção,depois é checada a exceção do primeiro
catch e por ultimo será executada uma saida.

# Questão 12

a)  

1 - Desconsiderar a operação deixa o usuário sem saber se a operação deu certo ou não
    
2 - Exibir uma mensagem de erro deixa o código muito amarrado nas concionais
    
3 - Retornar um código de erro deixar código complicado quando existe varios erros
pra retorna um código

b)

Porque as exceções vão garantir que algumas falhas não venha acontecer

c)

sim, princimalmente quando se fazer uma verificação em vários métodos
