package numeros;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		Scanner entrada= new Scanner(System.in);
     System.out.println("Selecciona la opcion:\n ");
     System.out.println("+: Suma"
    		 + "\n-: Resta"
    		 + "\n*: Multiplicacion"
    		 + "\n/: Division");
     sel=entrada.next();
     switch(sel){  //creo suma con el Scanner, luego copio esto mismo para la resta,mult y div
    	 case "+":
    		 System.out.println("Ha seleccionado suma\n Ingrese los valores");
    		 System.out.println("Ingrese el primer numero:");
    		 a=entrada.nextInt();
    		 System.out.println("Ingrese el segundo numero: ");
    		 b=entrada.nextInt();
    		 res=a+b;
    		 System.out.println(a+"+"+b+"="+res);
    		 		 break;
    	 case "-":
    		 System.out.println("Ha seleccionado resta\n Ingrese los valores");
    		 System.out.println("Ingrese el primer numero:");
    		 a=entrada.nextInt();
    		 System.out.println("Ingrese el segundo numero: ");
    		 b=entrada.nextInt();
    		 res=a-b;
    		 System.out.println(a+"-"+b+"="+res);
    		 		 break;
    	 case "*":
    		 System.out.println("Ha seleccionado multiplicacion\n Ingrese los valores");
    		 System.out.println("Ingrese el primer numero:");
    		 a=entrada.nextInt();
    		 System.out.println("Ingrese el segundo numero: ");
    		 b=entrada.nextInt();
    		 res=a*b;
    		 System.out.println(a+"*"+b+"="+res);
    		 		 break;
    	 case "/":
    		 System.out.println("Ha seleccionado division\n Ingrese los valores");
    		 System.out.println("Ingrese el primer numero:");
    		 a=entrada.nextInt();
    		 System.out.println("Ingrese el segundo numero: ");
    		 b=entrada.nextInt();
    		 res=a/b;
    		 System.out.println(a+"/"+b+"="+res);
    		 		 break;
    		 		 default:
    		 			 System.out.println("Esa opcion no existe");
     }
     
	}

}
