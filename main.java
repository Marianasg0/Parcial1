import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        metodos mt = new metodos();
        ObjProductos o = new ObjProductos();

        int n=0;
        n=mt.dimension(n);

        ObjProductos[][] productos = new ObjProductos[n][n];
        productos=mt.llenarMatriz(productos);
        mt.mostrar(productos);

        System.out.println(mt.cantidadProductos(productos));

    }
}