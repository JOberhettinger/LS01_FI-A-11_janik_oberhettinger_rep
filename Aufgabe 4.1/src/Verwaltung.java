public class Verwaltung {
    public static void main(String[] args) {

        Raumschiff klingonen = new Raumschiff(1, 100, 100, 100, 100, "IKS Hegh`ta", 2);
        Raumschiff romulaner = new Raumschiff(2, 100, 100, 100, 100, "IRW Khazara", 2);
        Raumschiff vulkanier = new Raumschiff(1, 80, 80, 50, 100, "MiVar", 5);

        Ladung ladung_Ferengi_Schnekensaft = new Ladung("Ferengi Schnekensaft", 200);
        Ladung ladung_Batleth_Klingonen = new Ladung("Bat`leth Klingonen", 200);

        Ladung ladung_Borg_Schrott = new Ladung("Borg-Schrott", 5);
        Ladung ladung_Rote_Materie = new Ladung("Rote Materie", 2);
        Ladung ladung_Plasma_Waffe = new Ladung("Plasma-Waffe", 50);

        Ladung ladung_Forschungssonde = new Ladung("Forschungssonde", 35);
        Ladung ladung_Photonentorpedo = new Ladung("Photonentorpedo", 3);

        klingonen.addLadung(ladung_Ferengi_Schnekensaft);
        klingonen.addLadung(ladung_Batleth_Klingonen);

        romulaner.addLadung(ladung_Borg_Schrott);
        romulaner.addLadung(ladung_Rote_Materie);
        romulaner.addLadung(ladung_Plasma_Waffe);

        vulkanier.addLadung(ladung_Forschungssonde);
        vulkanier.addLadung(ladung_Photonentorpedo);

    }
}
