public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregaPuerta();
        System.out.println("Cantidad de Puertas:  " + miCoche.puertas);
    }

}
class Coche {
    public int puertas = 0;

    public void AgregaPuerta(){
        this.puertas++;
    }
}

