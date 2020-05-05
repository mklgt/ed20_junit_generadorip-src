package ed20_jUnit_GeneradorIp;

import java.util.Random;

public class GeneradorIp {

	public int generarNumero() {
		Random rnd=new Random();
		int aleatorio=rnd.nextInt(255);
		return aleatorio;
		
	}
	
	public String generarIp() {
		String ip="";
		for(int i=0;i<3;i++) {
			int resultado=generarNumero();
			
				ip+=resultado+".";
				
			
			if(resultado==0 &&(i==0|i==3)) {
				generarNumero();
			}
			if(i==2) {
				ip+=generarNumero();
			}
			
		}
		return ip;
	}
	
	
}
