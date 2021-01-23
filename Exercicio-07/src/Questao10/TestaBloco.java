package Questao10;

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

    public static class TipoExcecao2 extends TipoExcecao1{
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
        } catch (TipoExcecao2 aEx) {
            System.out.println(aEx.getMessage());
        } catch (TipoExcecao1 ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Programa finalizado com sucesso");
        }
    }
}
