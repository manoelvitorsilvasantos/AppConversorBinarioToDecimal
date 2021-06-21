package br.app.mvictor;

public final class Verificador {
	
	private static Verificador instancia;

	
	private Verificador(){}
	
	public static Verificador getInstancia(){
		if(instancia == null){
			instancia = new Verificador();
		}
		return instancia;
	}
	
	public static boolean isEmpty(String campo){
		return campo.isEmpty();
	}
	
	public static boolean isNull(String campo)
	{
		return campo == null;
	}
}
