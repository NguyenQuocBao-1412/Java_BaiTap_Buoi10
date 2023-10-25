package Bai4;

public class Main {

	public static void main(String[] args) {
		TaiKhoan tk1 = new TaiKhoan(1000001, "Nguyen Quoc Bao", 100000.500);
		TaiKhoan tk2 = new TaiKhoan(2000002, "Nguyen Quoc Anh", 500000);
		
		tk1.xuatThongTin();
		System.out.println("-----");
		tk2.xuatThongTin();
		
		System.out.println("-----");
		System.out.println("==Nạp tiền==");
		tk1.napTien(-100000);
		tk1.napTien(100000);
		System.out.println("-----");
		tk1.xuatThongTin();
		
		System.out.println("-----");
		System.out.println("==Rút Tiền==");
		tk1.rutTien(-100000);
		tk1.rutTien(5000000);
		tk1.rutTien(100000.5);
		System.out.println("-----");
		tk1.xuatThongTin();
		
		System.out.println("-----");
		System.out.println("==Đáo hạn==");
		tk2.daoHan();
		System.out.println("-----");
		tk2.xuatThongTin();
		
		System.out.println("-----");
		System.out.println("==Chuyển tiền==");
		tk1.chuyenTien(1000000, tk1, tk2);
		System.out.println("-----");
		tk1.chuyenTien(1000, tk1, tk2);
	}

}
