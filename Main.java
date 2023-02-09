package Pedidos2ev;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Primer Cliente del Main
		Cliente cliente1 = new Cliente();
		// Segundo Cliente del Main
		Cliente cliente2 = new Cliente();
		// Tercer Cliente del Main
		Cliente cliente3 = new Cliente();



	// Productos
	Producto producto_main1 = new Producto();
	Producto producto_main2 = new Producto();
	Producto producto_main3 = new Producto();
	Producto producto_main4 = new Producto();
	Producto producto_main5 = new Producto();
	
	// Atributos
	String Nombre;
	String Apellido;
	String Direccion;
	String Historial;
	String prod1;
	String prod2;
	String prod3;
	String prod4;
	String prod5;
	double Precio;
	String Telefono;
	int Cantidad;
	
	// Menu para crear con la opción a un cliente o con la b un producto
	System.out.println("#####MENU INICIAL##### \n "
			+ "Opcion a) Crear Cliente" + "\n Opcion b) Crear Producto\n");
	
	char menu = sc.nextLine().charAt(0);
	
	switch (menu) {
	
	case 'a':
		// Primer Cliente
		System.out.println("Primer Cliente, inserte su nombre: ");
		Nombre = sc.next();
		cliente1.setNombre(Nombre);
		System.out.println("Primer Cliente, inserte su Apellido: ");
		Apellido = sc.next();
		cliente1.setApellido(Apellido);
		System.out.println("Primer Cliente, inserte la Fecha: ");
		sc.next();
		System.out.println("Primer Cliente, inserte su numero de telefono: ");
		Telefono = sc.next();
		int Telf = Integer.parseInt(Telefono);
		cliente1.setTelefono(Telf);
		System.out.println("Primer Cliente, inserte su direccion: ");
		Direccion = sc.next();
		cliente1.setDireccion(Direccion);
		System.out.println("Primer Cliente, inserte su historial: ");
		Historial = sc.next();
		cliente1.setHistorial(Historial);

		// Segundo Cliente
		System.out.println("\nSegundo Cliente, inserte su nombre: ");
		Nombre = sc.next();
		cliente2.setNombre(Nombre);
		System.out.println("Segundo Cliente, inserte su Apellido: ");
		Apellido = sc.next();
		cliente2.setApellido(Apellido);
		System.out.println("Segundo Cliente, inserte la Fecha: ");
		sc.next();
		System.out.println("Segundo Cliente, inserte su numero de telefono: ");
		Telefono = sc.next();
		cliente2.setTelefono(Telf);
		System.out.println("Segundo Cliente, inserte su direccion: ");
		Direccion = sc.next();
		cliente2.setDireccion(Direccion);
		System.out.println("Segundo Cliente, inserte su historial: ");
		Historial = sc.next();
		cliente2.setHistorial(Historial);

		// Tercer Cliente
		System.out.println("\nTercer Cliente, inserte su nombre: ");
		Nombre = sc.next();
		cliente3.setNombre(Nombre);
		System.out.println("Tercer Cliente, inserte su Apellido: ");
		Apellido = sc.next();
		cliente3.setApellido(Apellido);
		System.out.println("Tercer Cliente, inserte la Fecha: ");
		sc.next();
		System.out.println("Tercer Cliente, inserte su numero de telefono: ");
		Telefono = sc.next();
		cliente3.setTelefono(Telf);
		System.out.println("Tercer Cliente, inserte su direccion: ");
		Direccion = sc.next();
		cliente3.setDireccion(Direccion);
		System.out.println("Tercer Cliente, inserte su historial: ");
		Historial = sc.next();
		cliente3.setHistorial(Historial);


	case 'b':
		// Producto 1
		System.out.println("\n1 Producto: ");
		prod1 = sc.next();
		producto_main1.setNombre(prod1);
		System.out.println("Que cantidad de " + prod1 + " quieres?");
		Cantidad = sc.nextInt();
		producto_main1.setCantidad(Cantidad);
		System.out.println("Cuando seria el coste por cantidad de " + prod1 + "?");
		Precio = sc.nextInt();
		producto_main1.setPrecio(Precio);

		// Producto 2
		System.out.println("\n2 Producto: ");
		prod2 = sc.next();
		producto_main2.setNombre(prod2);
		System.out.println("Que cantidad de " + prod2 + " quieres?");
		Cantidad = sc.nextInt();
		producto_main2.setCantidad(Cantidad);
		System.out.println("Cuando seria el coste por cantidad de " + prod2 + "?");
		Precio = sc.nextInt();
		producto_main2.setPrecio(Precio);

		// Producto 3
		System.out.println("\n3 Producto: ");
		prod3 = sc.next();
		producto_main3.setNombre(prod3);
		System.out.println("Que cantidad de " + prod3 + " quieres?");
		Cantidad = sc.nextInt();
		producto_main3.setCantidad(Cantidad);
		System.out.println("Cuando seria el coste por cantidad de " + prod3 + "?");
		Precio = sc.nextInt();
		producto_main3.setPrecio(Precio);

		// Producto 4
		System.out.println("\n4 Producto: ");
		prod4 = sc.next();
		producto_main4.setNombre(prod4);
		System.out.println("Que cantidad de " + prod4 + " quieres?");
		Cantidad = sc.nextInt();
		producto_main4.setCantidad(Cantidad);
		System.out.println("Cuando seria el coste por cantidad de " + prod4 + "?");
		Precio = sc.nextInt();
		producto_main4.setPrecio(Precio);

		// Producto 5
		System.out.println("\n5 Producto: ");
		prod5 = sc.next();
		producto_main5.setNombre(prod5);
		System.out.println("Que cantidad de " + prod5 + " quieres?");
		Cantidad = sc.nextInt();
		producto_main5.setCantidad(Cantidad);
		System.out.println("Cuando seria el coste por cantidad de " + prod5 + "?");
		Precio = sc.nextInt();
		producto_main5.setPrecio(Precio);

		break;
		

		// If que hace que en el sysout si no dices ninguna de las opciones te de un
		// error y
		// te diga que ese producto no lo tenemos
		// if (producto_main1.equals(prod1.getNombre())) {
		// System.out.println("Has elegido Hamburguesa");
		// } else if (prod1.equals(producto_main2.getNombre())) {
		// System.out.println("Has elegido Pizza");
		// } else if (prod1.equals(producto_main3.getNombre())) {
		// System.out.println("Has elegido Sopa");
		// } else if (prod1.equals(producto_main4.getNombre())) {
		// System.out.println("Has elegido Kebab");
		// } else if (prod1.equals(producto_main5.getNombre())) {
		// System.out.println("Has elegido Patatas");
		// } else {
		// System.out.println("Lo siento, ese producto no lo tenemos");
		// }
		}

		
	System.out.println("#####MENU PEDIDOS##### \n "
				+ "Opcion a) Realizar Pedido");
		
	char menupedido = sc.next().charAt(0);
		
	switch (menupedido) {
		
	case 'a':
		// Sysout de los datos del Cliente = Nombre y Telefono
		System.out.println(
				"\nDatos del Cliente 1: \nTelefono: " + cliente1.getTelefono() + "\nNombre: " + cliente1.getNombre());
		System.out.println(
				"\nDatos del Cliente 2: \nTelefono: " + cliente2.getTelefono() + "\nNombre: " + cliente2.getNombre());
		System.out.println(
				"\nDatos del Cliente 3: \nTelefono: " + cliente3.getTelefono() + "\nNombre: " + cliente3.getNombre());
		// Sysout de los 5 productos que ha creado el cliente
		System.out.println(
				"\nPrimer producto: " + producto_main1.getNombre() + "\nSegundo producto: " + producto_main2.getNombre()
						+ "\nTercer producto: " + producto_main3.getNombre() + "\nCuarto producto: "
						+ producto_main4.getNombre() + "\nQuinto producto: " + producto_main5.getNombre());
		break;
	

}


}
}