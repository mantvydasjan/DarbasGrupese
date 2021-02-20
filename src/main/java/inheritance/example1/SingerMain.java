package inheritance.example1;

public class SingerMain {
    public static void main(String[] args) {
        Singer singer = new Singer();
        System.out.println(singer.yearsOfexperience);
        singer.singCommonSong();
        System.out.println("______________________");
        Cicinas cicinas = new Cicinas();
        cicinas.singCommonSong();
        System.out.println(singer.yearsOfexperience);
        System.out.println(cicinas.isSmiling());
        System.out.println(singer);

        Radzi radzi = new Radzi();
        radzi.singLikeRadzi();
        radzi.singCommonSong();
        System.out.println(radzi.yearsOfexperience);

    }
}
