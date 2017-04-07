public class Polygon extends Sepeda{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Polygon");
	}
	
	public void Sepeda(){
		tampilkan();
		super.tampilkan();
		System.out.println("===========================");
		super.belokKanan();
		super.belokKiri();
		super.berjalan();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Polygon pgl = new Polygon();
		pgl.Sepeda();
		
		Sepeda sepeda1 = new Sepeda();
        sepeda1.setGigi(6);
        sepeda1.setMerk("Polygon");        
        System.out.println("Gigi Sepeda  = "+sepeda1.getGigi());
        System.out.println("Merk Sepeda  = "+sepeda1.getMerk());
	}
}