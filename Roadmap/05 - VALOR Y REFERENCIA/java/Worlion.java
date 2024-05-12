/*
 * EJERCICIO: Valor y Referencia
 */

public class Worlion {

    public static void main(String[] args) {
        new Worlion().run();
    }

    public void run() {
        valueOrReference();
    }


    private void valueOrReference() {
    
        System.out.println("\nValor y referencia:");
        // En java los tipos primitivos se pasan por valor: Son dos objetos diferentes
        int a = 1;
        int b = a;
        System.out.println("\na: " + a + " - b: " + b);
        System.out.println("Direccion de memoria de a: " + System.identityHashCode(a));
        System.out.println("Direccion de memoria de b: " + System.identityHashCode(b));

        a=20;
        System.err.println("Modificamos a");
        System.out.println("a: " + a + " - b: " + b);
        System.out.println("Direccion de memoria de a: " + System.identityHashCode(a));
        System.out.println("Direccion de memoria de b: " + System.identityHashCode(b));

        // En java los objetos se pasan por referencia: Son dos punteros apuntando al mismo objeto!
        Chorizo c = new Chorizo("Sarta", 2);
        Chorizo d = c;
        System.out.println("\nc: " + c + " - d: " + d);
        System.out.println("Direccion de memoria de c: " + System.identityHashCode(c));
        System.out.println("Direccion de memoria de d: " + System.identityHashCode(d));

        c.setPicantez(4);
        System.err.println("Modificamos c");
        System.out.println("c: " + c + " - d: " + d);
        System.out.println("Direccion de memoria de c: " + System.identityHashCode(c));
        System.out.println("Direccion de memoria de d: " + System.identityHashCode(d));

        // Funciones:

        // En java los tipos primitivos se pasan por valor: Se crea una copia de la variable
        System.out.println("\n\nFunciones:");
        int _a = 5;
        System.out.println("a: " + _a);
        cuadrado(_a);
        System.out.println("a: " + _a +" (no se ha modificado)");

        // En java los objetos se pasan por referencia: Se pasa la referencia al objeto
        Chorizo _c = new Chorizo("Sarta", 2);
        System.out.println("c: " + _c);
        picante(_c);
        System.out.println("c: " + _c + " (se ha modificado)");
    }
    
    class Chorizo {
        private String nombre;
        private int picantez;

        public Chorizo(String nombre, int picantez) {
            this.nombre = nombre;
            this.picantez = picantez;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPicantez() {
            return picantez;
        }

        public void setPicantez(int picantez) {
            this.picantez = picantez;
        }

        public String toString() {
            return "Chorizo: " + nombre + " - Picantez: " + picantez;
        }
    }

    private void cuadrado(int x) {
        x =  x * x;
    }

    private void picante(Chorizo c) {
        c.setPicantez(c.getPicantez() * 2);
    }
}
