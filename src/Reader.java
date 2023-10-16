import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	private ArrayList<String> kelimeler;

	public Reader() {
		
		kelimeler=new ArrayList<String>();
	}
	
	public ArrayList<String> KelimeGetir() {
	    return kelimeler;
	}
	
	public void Kelime_Oku(String filepath) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String satır;
			while((satır = reader.readLine()) != null)
			{
				Bosluk_Ayırma(satır);
			}
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}		
		
	}
	
	
	public void Bosluk_Ayırma(String satır)
	{	
		StringBuilder sBuilder =new StringBuilder();
		for (char c: satır.toCharArray()) {
			if(c==' ') {
				if (sBuilder.length() > 0) {
					kelimeler.add(sBuilder.toString());
					sBuilder.setLength(0);
			}
		}else {
			sBuilder.append(c);
		}
	 }

		if (sBuilder.length() > 0) {
	        kelimeler.add(sBuilder.toString());
		}
   }
	
	public String SatıraGöre(int satırSayısı,String filepath) {
		
		try {
			BufferedReader reader =new BufferedReader(new FileReader(filepath));
			
			String satır;
			int gecicisatır=0;
			while((satır=reader.readLine())!=null) {
				gecicisatır++;
				if(gecicisatır==satırSayısı) {
					return satır;
				}
				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
