package Bai4;

import java.text.NumberFormat;
import java.util.Locale;

public class TaiKhoan {
	
	private long soTaiKhoan;
	private String tenTaiKhoan;
	private double soTien;
	private final double laiSuat = 0.035;
	
	public TaiKhoan() {}
	
	public TaiKhoan(long soTaiKhoan, String tenTaiKhoan, double soTien) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soTien = soTien;
	}
	
	public TaiKhoan(long soTaiKhoan, String tenTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soTien = 50;
	}

	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(long soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	
	public void xuatThongTin() {
		System.out.println("Số tài khoản là: " + this.soTaiKhoan);
		System.out.println("Tên tài khoản: " + this.tenTaiKhoan);
		System.out.println("Số dư: " + chuyenDoiTienTe(this.soTien) + " vnd");
	}
	
	private String chuyenDoiTienTe(double soTien) {
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getInstance(localeVN);
		
		return nf.format(soTien);
	}
	
	public void napTien(double soTienNap) {
		if(checkSo(soTienNap)) {
			this.soTien += soTienNap;
			System.out.println("Nạp tiền thành công! Số dư trong tài khoản là " + chuyenDoiTienTe(this.soTien));
		}
	}
	
	public void rutTien(double soTienRut) {
		double phiRutTien = 500;
		double soTienTru = soTienRut + phiRutTien;
		
		if(checkSo(soTienRut)) {
			if (checkSoDuTaiKhoan(soTienTru)) {
				this.soTien -= soTienTru;
				System.out.println("Rút tiền thành công! Số dư trong tài khoản là " + chuyenDoiTienTe(this.soTien));	
			}
		}
		
	}
	
	public void daoHan() {
		this.soTien = this.soTien + this.soTien * this.laiSuat;
	}
	
	public boolean checkSo(double soTien) {
		if(soTien <= 0) {
			System.out.println("Số tiền cần nạp phải lớn hơn 0");
			return false;
		}
					
		return true;
	}
	
	public boolean checkSoDuTaiKhoan(double soTien) {
		
		if(this.soTien - soTien < 0) {
			System.out.println("Số dư tài khoản không đủ, vui lòng kiểm tra lại.");
			return false;
		}
		
		return true;
	}
	
	public int checkSoTienRut(double soTien) {
		
		if(checkSo(soTien) == false)
			return -1;
		
		if(checkSoDuTaiKhoan(soTien) == false) {
			return -2;
		}
					
		return 0;
	}
	
	public void chuyenTien(double soTien, TaiKhoan tkChuyen, TaiKhoan tkNhan) {
		int check = checkSoTienRut(soTien);

		if(check == 0) {
			System.out.println("Chuyển tiền thành công!");
			tkChuyen.soTien -= soTien;
			tkNhan.soTien += soTien;
			tkChuyen.xuatThongTin();
			System.out.println("-----");
			tkNhan.xuatThongTin();
	}
	}
}
