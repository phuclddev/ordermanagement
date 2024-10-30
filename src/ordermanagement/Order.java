package ordermanagement;

public class Order {
    private String maHD;
    private Customer khachHang;
    private Item matHang;
    private int soLuong;
    public Order(String maHD, Customer khachHang, Item matHang, int soLuong) {
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    public String toString() {
        return this.maHD + " " + this.khachHang.getTenKH() + " " + this.khachHang.getDiaChi() + " " + this.matHang.getTenMH() + " " + this.matHang.getDonVi() + " " + this.matHang.getGiaMua() + " " + this.matHang.getGiaBan() + " " + this.soLuong + " " + this.matHang.getGiaBan() * this.soLuong;
    }
}
