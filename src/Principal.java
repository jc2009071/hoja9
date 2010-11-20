import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {

	
	

public static void main(String args[]) throws IOException 
{  
        Grafo g = new Grafo();
		g.cargarCabeceras();
		g.cargarArcos();
		g.calcular();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cabecera1;
		String cabecera2;
		int res;

		/**System.out.println("Ingrese el nombre del departamento de origen:\n");
		cabecera1 = br.readLine();
		System.out.println("Ingrese el nombre del departamento de destino:\n");
		cabecera2 = br.readLine();
		
		for (int i = 0; i < 22; i++) 
		{
			for (int j = 0; j < 22; j++) 
			{
				if (i != j) {
					if(cabecera1.equalsIgnoreCase(g.getNombre(i))&& cabecera2.equalsIgnoreCase(g.getNombre(j)))
					{
					System.out.println("El camino mas corto entre los departamentos:"
							+ g.getNombre(i) + "-" + g.getNombre(j) + " es: \n"
							+ g.caminocorto(i, j) + " y la distancia total es: "
							+ g.pesominimo(i, j)+ "km");
				}
			}
		}
		}**/
		
		g.interrupcionTrafico("huehuetenango", "guatemala");
		g.modificarArco("peten", "guatemala", 80);
}
}
		
	

