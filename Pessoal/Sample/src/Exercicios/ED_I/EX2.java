package Exercicios.ED_I;

class EX2 {

    static final int MAX = 50;

    static void main(){

        float[] V = new float[MAX];

        for (int i = 0; i < MAX; i++){
            V[i] = (i + 5 * i) % (i + 1);
        }

        printV(V);

    }

    static void printV(float[] V){
        for (int i = 0; i < MAX; i++){
            System.out.print(V[i] + " ");
        }
    }

}
