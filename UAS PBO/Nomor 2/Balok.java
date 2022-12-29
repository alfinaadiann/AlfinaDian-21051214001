public class Balok extends BangunRuang {
    float panjang;
    float lebar;
    float tinggi;
    
    float hasilkeliling(){
        keliling = 4 * (panjang+lebar+tinggi);
        System.out.println("Keliling Balok adalah "+keliling);
        return 0;
    }

    float hasilvolume(){
        volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok adalah "+volume);
        return 0;
    }
}
