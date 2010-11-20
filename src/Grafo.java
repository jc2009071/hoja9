import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grafo<E>{
	private static int nnodos = 22;

	private static int nodos[][][];

	private static String nombres[];
	public Grafo() 
	{
		nodos = new int[nnodos][nnodos][2];
		nombres = new String[nnodos];
	}

	public static  void nuevoArco(int n1, int n2, int peso) 
	{
		nodos[n1][n2][0] = peso;
		nodos[n2][n1][0] = peso;
		nodos[n1][n2][1] = n1;
		nodos[n2][n1][1] = n2;
	}

	public static void nuevoNodo(int nodo, String letra) 
	{
		nombres[nodo] = letra;
	}

	public void calcular() 
	{
		int i, j, k;
		for (i = 0; i < nnodos; i++) 
		{
			for (j = 0; j < nnodos; j++) 
			{
				for (k = 0; k < nnodos; k++) 
				{
					if (nodos[i][k][0] + nodos[k][j][0] < nodos[i][j][0]) 
					{
						nodos[i][j][0] = nodos[i][k][0]+nodos[k][j][0];
						nodos[i][j][1] = k;
					}
				}
			}
		}
	}

	public int pesominimo(int org, int des) 
	{
		return nodos[org][des][0];
	}

	public String caminocorto(int org, int des) 
	{
		String cam;
		if (org == des) 
		{
			cam = "->" + nombres[org];
		} 
		else 
		{
			cam = caminocorto(org, nodos[org][des][1]) + "->" + nombres[des];
		}
		return cam;
	}

	public String getNombre(int nodo) 
	{
		return nombres[nodo];
		
	}

	public static void cargarCabeceras()
    {
    	    FileReader fr = null;
	        String algo = null;
	        Boolean problem = false;
	        try 
	        {
	            fr = new FileReader("data/datos.txt");
	        } 
	        catch (FileNotFoundException ex) 
	        {
	        	System.out.println(ex.getMessage());
	            problem = true;
	        }
	        if (!problem)
	        {
	        	BufferedReader br = new BufferedReader(fr);
	        	for(int i = 0; i<22; i++)
	        	{
	        		try 
	        		{
	        			algo = br.readLine();
	        		}
	        		catch (IOException ex) 
	        		{
	        			System.out.println(ex.getMessage());    
	        			//algo = null;
	        		}	
	        		if (algo != null)
	        		{
	        			System.out.println(algo);
	        			nuevoNodo(i, algo);
	        		}
	        		else
	                	System.out.println("Existe un nodo nulo");
	        	} 
	    }
	  }
    
	
	public static void cargarArcos()
    {
    	    FileReader fr = null;
	        String algo;
	        String texto[] = new String[3] ;
	        Boolean problem = false;
	        try 
	        {
	            fr = new FileReader("data/distancias.txt");
	        } 
	        catch (FileNotFoundException ex) 
	        {
	        	System.out.println(ex.getMessage());
	            problem = true;
	        }
	        if (!problem)
	        {
	            BufferedReader br = new BufferedReader(fr);
	            for (int i = 0; i < 22; i++) 
	            {
	    			for (int j = 0; j < 22; j++) 
	    			{
	    				if (i < j) 
	    				{
	    					try 
	    					{
	    	                    algo = br.readLine();
	    	                    texto = algo.split(" ");
	    	                } 
	    					catch (IOException ex)
	    					{
	    						System.out.println(ex.getMessage());
	    	                    algo = null;
	    	                }
	    					if (texto[2] != null) 
	    					{
	    						//System.out.println(texto[2]);
	    						int peso = 0;
	    						peso = Integer.parseInt(texto[2]);
	    						nuevoArco(i, j, peso);
	    					} 
	    					else 
	    					{
	    						nuevoArco(i, j, 10000);
	    					}
	    				}
	    			}
	    		}
        }
    }
	
	public void interrupcionTrafico(String cab1, String cab2)
	{
		for (int i = 0; i < 22; i++) 
		{
			for (int j = 0; j < 22; j++) 
			{
				if (i != j) {
					if(cab1.equalsIgnoreCase(getNombre(i))&& cab2.equalsIgnoreCase(getNombre(j)))
				{
						nuevoArco(i, j, 10000);
						System.out.println("Se interrumpio la carretera entre " + cab1 + "-"+cab2);
				}
			}
		}
		}
	}
	
	public void modificarArco(String cab1, String cab2, int dist)
	{
		for (int i = 0; i < 22; i++) 
		{
			for (int j = 0; j < 22; j++) 
			{
				if (i != j) {
					if(cab1.equalsIgnoreCase(getNombre(i))&& cab2.equalsIgnoreCase(getNombre(j)))
				{
						nuevoArco(i, j, dist);
						System.out.println("Se modifico la distancia entre " + cab1 + "-"+cab2);
				}
			}
		}
		}
	}
}

