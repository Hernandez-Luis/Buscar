import java.util.Arrays;

public class Operaciones {
    public void contMayMin(String palabra) {
        int contMin = 0;
        int contMay = 0;
        int dif = 0;

        for(int i = 0; i < palabra.length(); ++i) {
            char letra = palabra.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                ++contMin;
            } else if (letra >= 'A' && letra <= 'Z') {
                ++contMay;
            } else {
                ++dif;
            }
        }
        System.out.println("Hay " + contMin + " letras minusculas, " + contMay + " letras mayusculas y " + dif + " caracteres que no son letras");
    }

    public void contMin(String palabra) {
        int contMin = 0;
        int dif = 0;

        for(int i = 0; i < palabra.length(); ++i) {
            char letra = palabra.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                ++contMin;
            } else {
                ++dif;
            }
        }
        System.out.println("Hay " + contMin + " letras minusculas y " + dif + " caracter que no es minuscula");
    }

    public void buscaCaracter(String palabra, String buscar) {
        int contador = 0;

        for(int i = 0; i < palabra.length(); ++i) {
            char letra = palabra.charAt(i);
            char bus = buscar.charAt(0);
            if (letra == bus) {
                ++contador;
            }
        }
        System.out.println("La letra " + buscar + " se encuentra " + contador + " veces en la palabra " + palabra);
    }

    public void extraer(String palabra, int inicio, int fin) {
        char[] rango = new char[(fin - inicio)-1];

        for(int i = 0; i < rango.length; ++i) {
            rango[i] = palabra.charAt(inicio + i);
        }

        String nuevoRango = new String(rango);
        System.out.println("El rango de la palabra que elegiste es: " + nuevoRango);
    }

    public void voltea(String palabra) {
        char[] volteada = new char[palabra.length()];
        int j = 0;

        for(int i=palabra.length()-1;i>=0;i--) {
            volteada[j] = palabra.charAt(i);
            j++;
        }
        String alreves = new String(volteada);
        System.out.println("La palabra al reves es: " + alreves);

    }
}