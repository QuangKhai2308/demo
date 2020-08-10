/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;

/**
 *
 * @author Khai2
 */
public class TTNhanVien {
    protected String HoTen;
    protected Date NgaySinh;
    protected String DaiChi;
    protected String GioiTinh;
    protected String ChucVu;
    protected String User;
    protected String Password;
    protected String ComfimPassword;
    protected String Email;
    protected String SDT;

    public TTNhanVien() {
    }

    public TTNhanVien(String HoTen, Date NgaySinh, String DaiChi, String GioiTinh, String ChucVu, String User, String Password, String ComfimPassword, String Email, String SDT) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DaiChi = DaiChi;
        this.GioiTinh = GioiTinh;
        this.ChucVu = ChucVu;
        this.User = User;
        this.Password = Password;
        this.ComfimPassword = ComfimPassword;
        this.Email = Email;
        this.SDT = SDT;
    }
    
    
    
}
