package Jubs.Project.maratonajava.JavaCore.Minterfaces.test;

import Jubs.Project.maratonajava.JavaCore.Minterfaces.domain.DatabaseLoader;
import Jubs.Project.maratonajava.JavaCore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {


    DatabaseLoader loader = new DatabaseLoader();
    FileLoader fileLoader = new FileLoader();

    loader.load();
    fileLoader.load();

    loader.remove();
    fileLoader.remove();

    }
}
