import java.time.LocalDate;
import java.time.Period;

public class OOPClass {
    String Nama;
    LocalDate TTL;
    Long UKT;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public LocalDate getTTL() {
        return TTL;
    }

    public void setTTL(LocalDate TTL) {
        this.TTL = TTL;
    }

    public Long getUKT() {
        return UKT;
    }

    public void setUKT(Long UKT) {
        this.UKT = UKT;
    }

    public String Penghitungumur(){
        LocalDate dob = TTL;
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(dob, curDate);

        return period.getYears() + " Tahun, " + period.getMonths() + " Bulan, " + period.getDays() + " Hari";
    }

    public String PengkategorianUKT(){
        if(UKT<=500000){
            return "UKT 1";
        } else if (UKT>500000 && UKT <=1500000){
            return "UKT 2";
        } else if (UKT>1500000 && UKT <=3000000){
            return "UKT 3";
        } else if (UKT>3000000 && UKT <=4500000){
            return "UKT 4";
        } else if (UKT>4500000 && UKT <=5000000){
            return "UKT 5";
        } else if (UKT>5000000 && UKT <=6000000){
            return "UKT 6";
        } else if (UKT>6000000 && UKT <=7000000){
            return "UKT 7";
        } else {
            return "UKT Tidak Terkategori";
        }
    }
}
