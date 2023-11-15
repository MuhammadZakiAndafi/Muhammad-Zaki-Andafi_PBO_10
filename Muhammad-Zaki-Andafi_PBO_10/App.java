package id.ac.unand.fti.si.pbo;

public class App {

    public static void main(String[] args) {

        Member mmbrReguler  = new MemberReguler();
        Member mmbrSilver = new MemberSilver();
        Member mmbrGold =  new MemberGold();
        Member mmbrPlatinum = new MemberPlatinum();

        Integer hitungmemberreguler = mmbrReguler.hitungTotalBayar(1000000);
        Integer hitungmembersilver = mmbrSilver.hitungTotalBayar(1000000);
        Integer hitungmembergold = mmbrGold.hitungTotalBayar(1000000);
        Integer hitungmemberplatinum = mmbrPlatinum.hitungTotalBayar(1000000);

        Integer jmlhpoinreguler = mmbrReguler.getBonusPoin(hitungmemberreguler);
        Integer jmlhpoinsilver = mmbrSilver.getBonusPoin(hitungmembersilver);
        Integer jmlhpoingold = mmbrGold.getBonusPoin(hitungmembergold);
        Integer jmlhpoinplatinum = mmbrPlatinum.getBonusPoin(hitungmemberplatinum);


        System.out.println("               STRUK PEMBAYARAN  ");
        System.out.println("Total bayar member reguler = " + hitungmemberreguler + " poin yang didapat = " + jmlhpoinreguler);
        System.out.println("");
        System.out.println("Total bayar member silver = " + hitungmembersilver + " poin yang didapat = " + jmlhpoinsilver);
        System.out.println("");
        System.out.println("Total bayar member gold = " + hitungmembergold + " poin yang didapat = " + jmlhpoingold);
        System.out.println("");
        System.out.println("Total bayar member platinum = " + hitungmemberplatinum + " poin yang didapat = " +jmlhpoinplatinum);   
    }
}