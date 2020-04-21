package br.edu.univas.br;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[]args) { 
		
        double x = 0;
	    double y = 0;
	    double z = 0;
		
	    while (true) { 
	    	
	    Scanner leitura = new Scanner(System.in);
		
	    System.out.println("Menu de Opções");
	    System.out.println();
	    System.out.println("Operadores");
   	    System.out.println();
	    System.out.println();
	    System.out.println("1. Somar");
	    System.out.println("2. Subtrair"); 
	    System.out.println("3. Multiplicar");
	    System.out.println("4. Dividir");
	    System.out.println("9. Para Sair"); 
	    System.out.println();
		    
	    System.out.println("Por favor, digite a operação desejada:");
	    z = leitura.nextDouble();
	    System.out.println();
	    
	         if (z == 5) {
	        	 System.out.println("Operação invalida!Por favor, digite uma opção correta");
	        	 System.out.println();
	        	 System.out.println();
	        	 
	         } if (z == 6) {
	        	 System.out.println("Operação invalida!Por favor, digite uma opção correta");
	        	 System.out.println();
	        	 System.out.println();
	        	 
	         } if (z == 7) {
	        	 System.out.println("Operação invalida!Por favor, digite uma opção correta");
	        	 System.out.println();
	        	 System.out.println();
	        	 
	         } if (z == 8) {
	        	 System.out.println("Operação invalida!Por favor, digite uma opção correta");
	        	 System.out.println();
	        	 System.out.println();
	        	 
	         } if (z == 0) {
	        	 System.out.println("Operação invalida!Por favor, digite uma opção correta");
	        	 System.out.println();
	        	 System.out.println();
	        	 
	         } if (z > 9) {
	        	 System.out.println("Operação invalida!Por favor, digite uma opção correta");
	        	 System.out.println();
	        	 System.out.println();
	        	 
	         } if (z == 1) {
		    	
		         System.out.println("Digite o 1° número:");
	             x = leitura.nextDouble();
			
		         System.out.println("Digite o 2° número:");
	             y = leitura.nextDouble();
		
	   	         System.out.println(x + " + " + y + " = " +(x + y));
	   	         System.out.println();
    	         
		     } if (z == 2) {
	    		
	    		 System.out.println("Digite o 1° número:");
	             x = leitura.nextDouble();
	 	
	 	         System.out.println("Digite o 2° número:");
	             y = leitura.nextDouble();
	             
	    		 System.out.println(x + " - " + y + " = " +(x - y));
	    	     System.out.println();
	    	     
		     } if (z == 3) {
	    		
	    		 System.out.println("Digite o 1° número:");
	             x = leitura.nextDouble();
	 	
	 	         System.out.println("Digite o 2° número:");
	             y = leitura.nextDouble();
	             
			     System.out.println(x + " * " + y + " = " +(x * y));
	    	     System.out.println();
	    	     
	    	 } if (z == 4) {
		    	
		    	 System.out.println("Digite o 1° número:");
		         x = leitura.nextDouble();
			
			     System.out.println("Digite o 2° número:");
		         y = leitura.nextDouble();	
		    
			     System.out.println(x + " / " + y + " = " +(x / y));
		         System.out.println();
		         
	    	 } if (z == 9) {
	    		 
	    		 System.out.println("Fim");
	    		 System.out.println();
	    		 break;
	    		 
		     }
		}
		
	}

}


	

