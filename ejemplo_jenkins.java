public class ejemplo_jenkins {
    /*
     * En este ejemplo, se declara la clase ejemplo_jenkins que recibe un parámetro
     * por consola. Es decir, el programa se compila y al momento de ejecutarlo se
     * le pasa un nombre por parámetro. Por ejemplo: java ejemplo_jenkins Macgyver
     * luego el parámetro se almacena en la variable name y se ejecutarán las ins-
     * trucciones dentro del ciclo For.
     */
    public static void main(String[] args) {
        // Verificamos que sólo un parámetro sea pasado al programa, si esto no se
        // cumple, mostramos en consola un ejemplo de uso e interrumplimos la eje-
        // cución del programa.
        if (args.length != 1) {
            System.err.println("Usage: java ejemplo_jenkins <NAME>");
            System.exit(1);
        }
        // Asignamos el parámetro pasado al programa a la variable name.
        String name = args[0];
        // Mostramos un mensaje en consola con un tiempo de espera aleatorio entre
        // 1 y 5 segundos para iteración del ciclo for.
        for (int i = 1; i <= 15; i++) {
            System.out.println("Hello, I am " + name + " and I am printing the number " + i);
            try {
                // Genera el tiempo de espera aleatorio
                int randomSleepTime = (int) (Math.random() * 4000) + 1000;
                Thread.sleep(randomSleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
