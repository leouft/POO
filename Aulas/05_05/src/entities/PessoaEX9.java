package entities;

public class PessoaEX9 {
    private String name;
    private int age;

    /**
     * Construtor do objeto Pessoa
     * @param name nome da pessoa
     * @param age idade da pessoa
     */
    public PessoaEX9(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Função para conseguir a idade da pessoa
     * @return idade da pessoa em inteiro.
     */
    public int getAge() {
        return age;
    }

    /**
     * Função para conseguir o nome da pessoa
     * @return nome da pessoa em String
     */
    public String getName() {
        return name;
    }
}
