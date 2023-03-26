package drugs;

import drugs.impl.CatDrug;
import drugs.impl.components.Azitron;
import drugs.impl.components.Penicillin;
import drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1),
                new Azitron("Азитрон", "2", 4));
        List<Component> componentCat2 = List.of(new Azitron("Азитрон","4",4),
                new Penicillin("Пинецилин", "18", 6));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 100));
        List<Component> componentCat5 = List.of(new Azitron("Азитрон","4",4),
                new Penicillin("Пинецилин", "20", 6));

        // Создаем лекарства на основе других компонентов

        CatDrug neocat = new CatDrug(componentCat, "neocat");
        CatDrug penitron = new CatDrug(componentCat2, "penitron");
        CatDrug azipen = new CatDrug(componentCat2, "azipen");
        CatDrug aziwater = new CatDrug(componentCat3, "aziwater");
        CatDrug watertron = new CatDrug(componentCat4, "watertron");
        CatDrug hellokit = new CatDrug(componentCat5, "hellokit ");

        // Создаем список лекарств
        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(neocat);
        drugs.add(penitron);
        drugs.add(aziwater);
        drugs.add(watertron);
        drugs.add(hellokit);
        drugs.add(azipen);


        Collections.sort(drugs);
        System.out.println("Drug list");
        for (CatDrug item: drugs) {
            System.out.println(item);
        }

        System.out.println("Component componentCat: ");
        System.out.println(componentCat);


        Set<Component> result = new HashSet<>(componentCat);
        System.out.println("Result unique list of componentCat: ");
        System.out.println(result);

    }
}