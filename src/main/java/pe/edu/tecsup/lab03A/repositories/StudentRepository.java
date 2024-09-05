package pe.edu.tecsup.lab03A;

public class StudentRepository {

    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        StudentRepository repo = new StudentRepository();

        int suma = repo.sumar(5, 3);
        int resta = repo.restar(5, 3);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}
