package main.java.com.singleton;

public class DbSingleton {
    /*stamos diciendo al compilador que el valor contenido en esa
    dirección de memoria puede modificarse en cualquier momento,
    y queremos que dicha modificación sea visible inmediatamente para
    todos los hilos que están accediendo a ella,
    no queremos que su valor sea copiado en la caché del procesador.*/
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
    public static DbSingleton getInstance(){
        if(instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }
}
