
public class Ödev3 {

	public static void main(String[] args) {
	
		Reader rd = new Reader();
		rd.Kelime_Oku("C:\\Users\\gkale\\Desktop\\deneme.txt");
		System.err.println(rd.KelimeGetir());
		System.out.println(rd.SatıraGöre(1, "C:\\Users\\gkale\\Desktop\\deneme.txt"));
		
	}

}
