package principal;

public class AulaArray05 {
	
	public static void main(String[] args) {
	
		
						//	  0   1    2 
	double[] forma1 = { 10, 9.5, 8.0};
	
	System.out.println("Primeiro Array");
	for(int pos = 0; pos < forma1.length; pos++) {
		System.out.println("O valor da posição é " + forma1[pos]);
	}
	
	
	
	String[] forma2 = new String[3];
	forma2[0] = "Abacaxi";
	forma2[1] = "123";
	forma2[2] = "17.5";
	
	System.out.println(" \nSegundo Array");
	for(int pos = 0; pos < forma2.length; pos++) {
		System.out.println("O valor da posição é " + forma2[pos]);
	}
	
	
	
String [] forma3 = {"@@@55", "Laranja", "55531"};

System.out.println(" \nTerceiro Array");
for(int pos = 0; pos < forma1.length; pos++) {
	System.out.println("O valor da posição é " + forma3[pos]);
}
		
		
		
		
	}

}
