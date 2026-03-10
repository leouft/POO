package Exercicios.ED_I;
import java.util.Scanner;

public class EX4 {

    static Scanner sc = new Scanner(System.in);

    public static void main()
    {
        int capacidade = 0;

        Contato[] c = new Contato[100];

        int op;

        do {
            System.out.print("\nO que deseja fazer?\nNovo contato [1]\nExibir contato [2]\nSair [0]\nOpção: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op)
            {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    if (capacidade >= 99)
                    {
                        System.out.println("\nCapacidade máxima de contatos atingida.");
                    }
                    else
                    {
                        novoContato(c, capacidade);
                        capacidade++;
                    }
                    break;
                case 2:
                    if (capacidade == 0)
                    {
                        System.out.println("\nNenhum contato cadastrado.");
                    }
                    else
                    {
                        exibirContato(c, capacidade);
                    }
            }
        } while (op != 0);
        sc.close();
    }

    static void novoContato(Contato[] c, int capacidade)
    {
        Contato contato = new Contato();
        System.out.print("\nInsira o nome do contato: ");
        contato.nome = sc.nextLine();
        System.out.print("Insira o telefone do contato (DDDXXXXXXXXX): ");
        contato.telefone = sc.nextLine();

        c[capacidade] = contato;
    }

    static void exibirContato(Contato[] c, int capacidade)
    {
        System.out.println("\nContatos salvos:");
        for (int i = 0; i < capacidade; i++)
        {
            System.out.println(c[i].nome);
        }
        System.out.print("\nQual contato deseja exibir? (Insira o nome): ");
        String op = sc.nextLine();
        for (int i = 0; i < capacidade; i++)
        {
            if (c[i].nome.equals(op))
            {
                System.out.println("\nNome: " + c[i].nome);
                System.out.printf("Telefone: (%.3s) %.5s-%.4s\n", c[i].telefone, c[i].telefone.substring(3, 8), c[i].telefone.substring(8));
            }
        }
    }
}

class Contato {
    String nome;
    String telefone;
}
