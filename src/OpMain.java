import java.util.Scanner;
public class OpMain {

    public void op() {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int inicio;
        int fin;
        System.out.println("Ingresa una palabra");
        String palabra = scanner.nextLine();
        System.out.println("Ingresa una letra para buscar: ");
        String buscar = scanner.next();
        System.out.println("Ingresa el inicio para extrer de la palabra: ");
        inicio = scanner.nextInt();
        System.out.println("Ingresa el fin para extrer de la palabra: ");
        fin = scanner.nextInt();
        System.out.println("\n______________________________________________________");
        operaciones.contMayMin(palabra);
        operaciones.contMin(palabra);
        operaciones.buscaCaracter(palabra, buscar);
        operaciones.extraer(palabra, inicio, fin);
        operaciones.voltea(palabra);
    }
}
