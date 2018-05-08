package clasaInterna;

public class Main {

	public static void main(String[] args) {
		
		// instantiere clasa inner ver. 1 
		ExtraTerestru ext = new ExtraTerestru();
		ExtraTerestru.IntraTerestru ext1 = ext.new IntraTerestru();
		
		// instantiere clasa inner dintr o clasa care extinde clasa mama
		ExtraTerestru2 ext2 = new ExtraTerestru2();
		ExtraTerestru2.IntraTerestru ext3 = ext2.new IntraTerestru();
		
		// instantiere clasa inner ver. 2
		ExtraTerestru.IntraTerestru ext4 = new ExtraTerestru().new IntraTerestru();
	}

}
