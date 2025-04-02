package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListView01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC1", "Apple");
        Smartphone smartphone2 = new Smartphone("22222", "Pixel");
        Smartphone smartphone3 = new Smartphone("3333", "Samsumg");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone smartphone4 = new Smartphone("22222", "Pixel");
        System.out.println(smartphones.contains(smartphone4));
        int indexSmartphone4 = smartphones.indexOf(smartphone4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
