package entities;

public class Aluno {
    private String name;
    private double[] nota = new double[2];

    public Aluno(String name, double[] nota) {
        this.name = name;
        this.nota[0] = nota[0];
        this.nota[1] = nota[1];
    }

    public boolean aproved(){
        return (nota[0] + nota[1]) / 2 >= 6;
    }

    public String getName(){
        return name;
    }
}
