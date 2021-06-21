package br.app.mvictor;

public class Binary {
	public Binary(){
		super();
	}
	
	public String DecimalToBinary(int n){
		StringBuilder binary = new StringBuilder(64);
		while(n > 0){
			binary.append(n % 2);
			n >>= 1;
		}
		return binary.reverse().toString();
	}
}
