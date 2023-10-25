package Bai3;

public class HocSinh {
	
	private int maSV;
	private String hoten;
	private float diemLT, diemTH;
	
	public HocSinh() {}
	
	public HocSinh(int maSV, String hoten, float diemLT, float diemTH) {
		this.maSV = maSV;
		this.hoten = hoten;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	
	private float tinhDiemTrungBinh() {
		return (this.diemLT + this.diemTH) / 2;
	}
	
	public void toString1() {
		System.out.println("Mã sinh viên là: " + this.maSV);
		System.out.println("Họ tên: " + this.hoten);
		System.out.println("Điểm lý thuyết: " + this.diemLT);
		System.out.println("Điểm thực hành: " + this.diemTH);
		System.out.println("Điểm trung bình: " + this.tinhDiemTrungBinh());
	}
}
