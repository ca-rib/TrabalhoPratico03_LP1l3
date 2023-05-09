/*TRABALHO PRÁTICO 03: Construir a classe Hora, conforme especificação
abaixo, este exercício comporá a avaliação final, portanto será obrigatória sua
elaboração para a prova final.*/

//Caroline Ribeiro dos Santos CB3021271
//Gabriel Silva Resende Chaves CB302024X

import java.util.Scanner; 

class Hora {	
	Scanner ler = new Scanner(System.in);

	private int h;
	private int m;
	private int s;

	Hora(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	Hora() { 
		System.out.print("Digite o valor das horas: ");
		h = ler.nextInt();
		System.out.print("Digite o valor dos Minutos: ");
		m = ler.nextInt();
		System.out.print("Digite o valor dos Segundos: ");	
		s = ler.nextInt();
	}

	public void setHor (int h) {
	    this.h = h; 
	}
	public void setMin (int m) {
	    this.m = m;
	}
	public void setSeg (int s) { 
	    this.s = s;
	}
	public void setHor () { 
		System.out.print("Digite o valor das horas: ");
		h = ler.nextInt();
	}
	public void setMin ()
	{ 
		System.out.print("Digite o valor dos Minutos: ");
		m = ler.nextInt();
	}
	public void setSeg ()
	{ 
		System.out.print("Digite o valor dos Segundos: ");
		s = ler.nextInt();
	}
	public int getHor()
	{return h;}
	public int getMin()
	{return m;}
	public int getSeg()
	{return s;}

	public String getHora1()
	{
		if(s >= 60 || m >= 60 || h >= 24) {
			return "Dados inválidos";
		}
		String hora, min, sec;
		if(h < 10) {
			hora = "0" + Integer.toString(h);
		}
		else{
			hora = Integer.toString(h);
		}
		if(m < 10) {
			min = "0" + Integer.toString(m);
		}
		else{
			min = Integer.toString(m);
		}
		if(s < 10) {
			sec = "0" + Integer.toString(s);
		}
		else{
			sec = Integer.toString(s);
		}

		return hora + ":" + min + ":" + sec;		
	}

	public String getHora2()
	{
		if(s >= 60 || m >= 60 || h >= 24) {
			return "Dados inválidos";
		}
		String hora;
		String min;
		String sec;
		int horaConv;
		if(h < 12){
			if(h < 10) {
				if(h == 0){
					hora = "12";
				}
				else{
					hora = "0" + Integer.toString(h);
				}
			}
			else{
				hora = Integer.toString(h);
			}
			if(m < 10) {
				min = "0" + Integer.toString(m);
			}
			else{
				min = Integer.toString(m);
			} if(s < 10) {
				sec = "0" + Integer.toString(s);
			}
			else{
				sec = Integer.toString(s);
			}

			return hora + ":" + min + ":" + sec + " AM";
		}
		
		horaConv = h - 12;

		if(horaConv < 10) {
			if(horaConv == 0){
				hora = "12";
			}
			else{
				hora = "0" + Integer.toString(horaConv);
			}
		}
		else {
			hora = Integer.toString(horaConv);
		}
		if (m < 10) {
			min = "0" + Integer.toString(m);
		}
		else {
			min = Integer.toString(m);
		}
		if (s < 10) {
			sec = "0" + Integer.toString(s);
		}
		else {
			sec = Integer.toString(s);
		}
		return hora + ":" + min + ":" + sec + " PM";		
	}

	public int getSegundos(){
		return s + (60 * m) + (60 * 60 * h);
	}

}

public class Main
{
    public static void showValues(Hora hora) {
        System.out.println("Horas no padrao brasileiro: " + hora.getHora1());
    	System.out.println("Horas no padrao americano: " + hora.getHora2());
    	System.out.println("Total de segundos: " + hora.getSegundos());
    	System.out.println("Hora: " + hora.getHor());
    	System.out.println("Minuto: " + hora.getMin());
    	System.out.println("Segundo: " + hora.getSeg());
    	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    
	public static void main(String[] args)
	{
		System.out.println("Objeto com parametros");
		Hora h1 = new Hora(12, 21, 3);
		showValues(h1);

		System.out.println("Objeto sem parametros");
		Hora h2 = new Hora();
		showValues(h2);

		System.out.println("Testando setter vazio");
		h2.setHor();
		h2.setMin();
		h2.setSeg();
        showValues(h2);
	}
}