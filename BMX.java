public class BMX extends Sepeda{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas BMX");
	}
	
	public void Sepeda(){
		super.tampilkan();
		System.out.println("===========================");
		super.belokKanan();
		super.belokKiri();
		super.berjalan();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		BMX pgl = new BMX();
		pgl.Sepeda();
		
		
		Sepeda sepeda1 = new Sepeda();
        sepeda1.setGigi(1);
        sepeda1.setMerk("BMX");        
        System.out.println("Gigi Sepeda  = "+sepeda1.getGigi());
        System.out.println("Merk Sepeda  = "+sepeda1.getMerk());
	}
}