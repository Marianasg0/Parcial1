import java.util.Scanner;

public class metodos {
    
    Scanner sc = new Scanner(System.in);

    public int dimension(int n){
        System.out.println("Ingrese la dimension");
        n=sc.nextInt();
        return n;
    }

    public ObjProductos[][] llenarMatriz(ObjProductos[][] productos){
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                ObjProductos o = new ObjProductos();
                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el peso del producto");
                o.setPeso(sc.nextDouble());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la categoria del producto 1)Frutas 2)Verduras 3)Cereales");
                o.setCategoria(sc.nextInt());
                productos[i][j] = o;
            }
        }
        return productos;
    }

    public void mostrar(ObjProductos[][] productos){
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                System.out.println("Nombre: "+productos[i][j].getNombre());
                System.out.println("Peso: "+productos[i][j].getPeso());
                System.out.println("Precio: "+productos[i][j].getPrecio());
                switch (productos[i][j].getCategoria()) {
                    case 1:
                        System.out.println("Categoria: Frutas");
                        break;
                    case 2:
                        System.out.println("Categoria: Verduras");
                        break;
                    case 3:
                        System.out.println("Categoria: Cereales");
                        break;
                    default:
                        break;
                }
                System.out.println("------------------------------------- ");
            }
        }
    }

    public String cantidadProductos(ObjProductos[][] productos){
        int cantidadF=0;
        int cantidadV=0;
        int cantidadC=0;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                if(productos[i][j].getCategoria()==1){
                    cantidadF++;
                } else if(productos[i][j].getCategoria()==2){
                    cantidadV++;
                } else{
                    cantidadC++;
                }
            }
        }
        return "La cantidad de productos en cada categoria es: "+cantidadF+" Frutas, "+cantidadV+" Verduras, "+cantidadC+" Cereales";
    }


}
