public class Rectangle {
    private double width, height;
    /*
    Representa um retângulo com largura e altura.
    As variáveis são private para garantir encapsulamento.
    Todos métodos são public para serem acessados por outras classes (no caso, a Main),
    e também não são static para cada objeto ter e operar suas próprias variáveis.
    */

    /**
     * Define a largura do retângulo.
     *
     * @param w largura do retângulo.
     */
    public void setWidth(double w) {
        width = w;
    }

    /**
     * Define a altura do retângulo.
     *
     * @param h altura do retângulo.
     */
    public void setHeight(double h) {
        height = h;
    }

    /**
     * Calcula a área do retângulo.
     *
     * @return área do retângulo.
     */
    public double area() {
        return width*height;
    }

    /**
     * Calcula o perímetro do retângulo.
     *
     * @return perímetro do retângulo.
     */
    public double perimeter() {
        return 2*(width+height);
    }

    /**
     * Calcula a diagonal do retângulo.
     *
     * @return diagonal do retângulo.
     */
    public double diagonal() {
        return (Math.sqrt(width*width+height*height));
    }

    /**
     * Representação em texto do objeto.
     *
     * @return string representado o objeto.
     */
    public String toString() {
        return String.format("Width=%.2f, Height=%.2f", width, height);
    }
}
