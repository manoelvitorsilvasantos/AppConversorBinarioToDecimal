package br.app.mvictor;

public class Utils {
	
	public Utils(){
		super();
	}
	
	public String toResultadoBinary(int tamanho, String texto){
		String resultado = null;
		for(int i = 1; i < 8; i++){
			if(tamanho == 0){
				resultado = "0000000"+texto;
			}
			else if(tamanho == 1){
				resultado = "0000000"+texto;
			}
			else if(tamanho == 2){
				resultado = "000000"+texto;
			}
			else if(tamanho == 3){
				resultado = "00000"+texto;
			}
			else if(tamanho == 4){
				resultado = "0000"+texto;
			}
			else if(tamanho == 5){
				resultado = "000"+texto;
			}
			else if(tamanho == 6){
				resultado = "00"+texto;
			}
			else if(tamanho == 7){
				resultado = "0"+texto;
			}
			else{
				resultado = texto;
			}
			
		}
		return resultado;
	}
	
	
}
