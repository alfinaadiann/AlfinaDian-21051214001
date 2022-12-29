public class Kubus extends BangunRuang{
    float sisi;
    
    float hasilkeliling(){
        keliling = 12*sisi;
        System.out.println("Keliling Kubus adalah "+keliling);
        return 0;
    }

    float hasilvolume(){
        volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus adalah "+volume);
        return 0;
    }
}
