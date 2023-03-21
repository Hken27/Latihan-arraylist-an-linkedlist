package S_D_Modul2;

import java.util.*;

public class Latihan2 {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.print("Nama Hewan Yang DiTambahakan : ");
        System.out.println(hewan);

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        ArrayList<String> deletedData = new ArrayList<>();

        for (String warna : deleteHewan) {
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna);
        }

        System.out.print("\nHewan yang dihapus : ");
        System.out.println(deletedData);
        System.out.print("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(hewan);
        System.out.println("---------------------------------------------------------------------\n");
    }
}