public class trabajo1 { 
    public static void main(String args[]) { 

	System.out.println("Hello World"); 


    int DIA, MES ,A�O;
	int suma, resta, multiplicacion, divicion, modulo;
	double multiplicacionn, divicionn;
	char letra1, letra2, letra3, letra4;
	

	DIA = 12;
	MES = 01;
	A�O = 2000;

	System.out.println(DIA + MES + A�O);
	
	suma= DIA + MES + A�O;
	resta= DIA - MES - A�O;
	multiplicacionn= (DIA * MES) * A�O;
	divicionn= (DIA / MES) / A�O;
	modulo= (DIA % MES) % A�O;
	palabra=letra1+letra2+letra3+letra4;
			
	System.out.println("nacio el dia" + DIA);
	System.out.println("nacio el mes" + MES);
	System.out.println("nacio el a�o" + A�O);
	System.out.println("El resultado de la suma es: " + suma);
	System.out.println("El resultado de la resta es: " + resta);
	System.out.println("El resultado de la multiplicacion es: " + multiplicacionn);
	System.out.println("El resultado de la divicion es: " + divicionn);
	System.out.println("El resultado de la modulo es: " + modulo);
}
}
