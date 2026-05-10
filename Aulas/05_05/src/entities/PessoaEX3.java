package entities;

public class PessoaEX3 {
    private String name;
    private int age;
    private double height;

    /**
     * Construtor do objeto Pessoa
     * @param name nome da pessoa
     * @param age idade da pessoa
     * @param height altura da pessoa
     */
    public PessoaEX3(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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
