/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.Objects;
import java.util.List;
public class MovieSchedule {
    private String Phim;
    private String Ghe;
    private String Xuat;
    
    public MovieSchedule(String Phim, String Ghe, String Xuat) {
        this.Phim = Phim;
        this.Ghe = Ghe;
        this.Xuat = Xuat;
    }
    
    
    public boolean isDuplicate(List<MovieSchedule> existingSchedules) {
        for (MovieSchedule schedule : existingSchedules) {
            if (schedule.Phim.equals(this.Phim) &&
                schedule.Ghe.equals(this.Ghe) &&
                schedule.Xuat.equals(this.Xuat)) {
                return true; // Lịch chiếu trùng lặp
            }
        }
        return false; // Lịch chiếu không trùng lặp
    }

    public String getPhim() {
        return Phim;
    }

    public void setPhim(String Phim) {
        this.Phim = Phim;
    }

    public String getGhe() {
        return Ghe;
    }

    public void setGhe(String Ghe) {
        this.Ghe = Ghe;
    }

    public String getXuat() {
        return Xuat;
    }

    public void setXuat(String Xuat) {
        this.Xuat = Xuat;
    }
    
}   
 