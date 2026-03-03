public class Main {

    static void main(){

        Pessoa p1 = new Pessoa();
        p1.nome = "Maria";
        p1.idade = 31;
        p1.renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$%.2f", p1.nome, p1.idade, p1.renda);

    }
}
