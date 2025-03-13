package Jubs.Project.maratonajava.JavaCore.Isobreescrita.domain;
//biblioteca do java é insana
//                           V
public class Anime extends Object {
    private String name;

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
