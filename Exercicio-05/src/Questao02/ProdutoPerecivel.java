package Questao02;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    public LocalDate dataValidade;

    public boolean produtoPerecível(){
        if(this.dataValidade.isAfter(LocalDate.now()))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
