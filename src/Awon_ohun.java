import java.io.*;
import javax.sound.sampled.*;

@SuppressWarnings("serial")
public class Awon_ohun extends Ise {
	
	//static public String[] konsonati = {"B","D","F","G","GB","H","J","K","L","M","N","P","R","S","Ṣ","T","W","Y"};
	//public static String[] konsonati = {"B","D","F","G","H","J","K","L","M","N","P","R","S","Ṣ","T","W","Y","b","d","f","g","h","j","k","l","m","n","p","r","s","ṣ","t","w","y"};
// =================== OKUNRIN =======================================================================================================
		
	public void Ohun_Okunrin(String ohunGan){
		
		
		String ipinOhun [] = ohunGan.split("");
		
		String ohun="";
		
		//ohun = ipinOhun[0];
		
		for(int i=0;i<ipinOhun.length;i++) {
			
			ohun += ipinOhun[i];
			
			System.out.println(ohun+" 8888888888 "+i);
			
			if (i==ipinOhun.length-1) {
				
				System.out.println(i +" 000 "+(ipinOhun.length-1));
				
				Ohun_OkunrinGan(ohun);
				
			}
			else {
			
				if(ipinOhun[i+1].equals("B")||ipinOhun[i+1].equals("D")||ipinOhun[i+1].equals("F")||ipinOhun[i+1].equals("G")||ipinOhun[i+1].equals("H")||ipinOhun[i+1].equals("J")||ipinOhun[i+1].equals("K")||ipinOhun[i+1].equals("L")||ipinOhun[i+1].equals("M")||ipinOhun[i+1].equals("N")||ipinOhun[i+1].equals("P")||ipinOhun[i+1].equals("R")||ipinOhun[i+1].equals("S")||ipinOhun[i+1].equals("Ṣ")||ipinOhun[i+1].equals("T")||ipinOhun[i+1].equals("W")||ipinOhun[i+1].equals("Y")||ipinOhun[i+1].equals("b")||ipinOhun[i+1].equals("d")||ipinOhun[i+1].equals("f")||ipinOhun[i+1].equals("g")||ipinOhun[i+1].equals("h")||ipinOhun[i+1].equals("j")||ipinOhun[i+1].equals("k")||ipinOhun[i+1].equals("l")||ipinOhun[i+1].equals("m")||ipinOhun[i+1].equals("n")||ipinOhun[i+1].equals("p")||ipinOhun[i+1].equals("r")||ipinOhun[i+1].equals("s")||ipinOhun[i+1].equals("ṣ")||ipinOhun[i+1].equals("t")||ipinOhun[i+1].equals("w")||ipinOhun[i+1].equals("y")) {
					
					if((ohun.equals("G") && ipinOhun[i+1].equals("B"))||(ohun.equals("G") && ipinOhun[i+1].equals("b"))||(ohun.equals("g") && ipinOhun[i+1].equals("b"))) {
						
						System.out.println("if  1 ");
						
						continue;
						
						//ohun += ipinOhun[i+1];
						
					}
					
					else if ((ipinOhun[i+1].equals("N")||ipinOhun[i+1].equals("n")) && ((ipinOhun[i+2].equals("B")||ipinOhun[i+2].equals("D")||ipinOhun[i+2].equals("F")||ipinOhun[i+2].equals("G")||ipinOhun[i+2].equals("H")||ipinOhun[i+2].equals("J")||ipinOhun[i+2].equals("K")||ipinOhun[i+2].equals("L")||ipinOhun[i+2].equals("M")||ipinOhun[i+2].equals("N")||ipinOhun[i+2].equals("P")||ipinOhun[i+2].equals("R")||ipinOhun[i+2].equals("S")||ipinOhun[i+2].equals("Ṣ")||ipinOhun[i+2].equals("T")||ipinOhun[i+2].equals("W")||ipinOhun[i+2].equals("Y")||ipinOhun[i+2].equals("b")||ipinOhun[i+2].equals("d")||ipinOhun[i+2].equals("f")||ipinOhun[i+2].equals("g")||ipinOhun[i+2].equals("h")||ipinOhun[i+2].equals("j")||ipinOhun[i+2].equals("k")||ipinOhun[i+2].equals("l")||ipinOhun[i+2].equals("m")||ipinOhun[i+2].equals("n")||ipinOhun[i+2].equals("p")||ipinOhun[i+2].equals("r")||ipinOhun[i+2].equals("s")||ipinOhun[i+2].equals("ṣ")||ipinOhun[i+2].equals("t")||ipinOhun[i+2].equals("w")||ipinOhun[i+2].equals("y")) || (ipinOhun[i+2].equals("N")))){
						
						System.out.println("if   2");
						
						ohun += ipinOhun[i+1];
						
						Ohun_OkunrinGan(ohun);
						
						ohun = "";
						i++;
					}
					
					else {
						
						System.out.println("if  3");
						
						Ohun_OkunrinGan(ohun);
						
						ohun = "";
						
					}
				}
				
			}
		}
		
		
		
		
		
		
		/*
		
		String atonaOhun = "okunrin/"+ohun+".wav";
		
		//System.out.println(ohun+" 888888888888888888888");
		
		File iwe = new File(atonaOhun);
		AudioInputStream omiOhun = null;
		
		
		try {
			omiOhun = AudioSystem.getAudioInputStream(iwe);
		} catch (UnsupportedAudioFileException | IOException e) {
			System.out.println("Mi o ri "+ohun);
		}
		
		
		try {
			akopo = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			System.out.println(" 2 Mi o ri "+ohun);
		}
		
		try {
			akopo.open(omiOhun);
		} catch (LineUnavailableException | IOException e) {
			System.out.println(" 3 Mi o ri "+ohun);
		}
		
		akopo.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		*/
		
	}
	
//=777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777=
	
	public void Ohun_OkunrinGan(String ohun) {
		
		
		String atonaOhun = "okunrin/"+ohun+".wav";
		
		System.out.println(ohun);
		
		File iwe = new File(atonaOhun);
		AudioInputStream omiOhun = null;
		
		
		try {
			omiOhun = AudioSystem.getAudioInputStream(iwe);
		} catch (UnsupportedAudioFileException | IOException e) {
			System.out.println("Mi o ri "+ohun);
		}
		
		
		try {
			akopo = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			System.out.println(" 2 Mi o ri "+ohun);
		}
		
		try {
			akopo.open(omiOhun);
		} catch (LineUnavailableException | IOException e) {
			System.out.println(" 3 Mi o ri "+ohun);
		}
		
		akopo.start();
		
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// =================== OBIRIN ======================================================================================================
	
	public void Ohun_Obirin(String ohun) {
		
		String atonaOhun = "obirin/"+ohun+".wav";
		
		System.out.println(atonaOhun);
		
		File iwe = new File(atonaOhun);
		AudioInputStream omiOhun = null;
		
		
		try {
			omiOhun = AudioSystem.getAudioInputStream(iwe);
		} catch (UnsupportedAudioFileException | IOException e) {
			System.out.println("Mi o ri "+ohun);
		}
		
		Clip akopo = null;
		try {
			akopo = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			System.out.println(" 2 Mi o ri "+ohun);
		}
		
		try {
			akopo.open(omiOhun);
		} catch (LineUnavailableException | IOException e) {
			System.out.println(" 3 Mi o ri "+ohun);
		}
		
		akopo.start();
	}

}
