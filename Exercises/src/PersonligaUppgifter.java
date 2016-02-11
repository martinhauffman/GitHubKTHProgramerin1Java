import java.io.FileNotFoundException;

// PersonligaUppgifter.java

// ett program som hanterar personliga uppgifter

/**********************************************************************

Anv�ndaren matar in sina personliga uppgifter. Dessa uppgifter sparas
sedan i en fil.

**********************************************************************/


class PersonligaUppgifter
{
    public static void main (String[] args) 
    		//throws FileNotFoundException
    
    // The throw method handles that there is no file initiated                       
    // throws Exception    // (1)
    throws FileNotFoundException
	{
		System.out.println ("PERSONLIGA UPPGIFTER");
		System.out.println ();

		// inmatningsverktyg
		java.util.Scanner    in = new java.util.Scanner (System.in);

		// mata in personliga uppgifter
		System.out.print ("Fodelsear: ");
		int    ar = in.nextInt ();
//		in.nextLine ();    // (2)
 		System.out.print ("Ditt fornamn och efternamn: ");
		String    namn = in.nextLine ();
		System.out.println ();

		// spara uppgifter i en fil
			java.io.PrintWriter    fout =
		          new java.io.PrintWriter ("persUpp.txt");
		fout.println (namn + ": " + ar);
		fout.flush ();
		
		// ett meddelande
		System.out.println ("Oppna filen persUpp.txt!");
	}
}
