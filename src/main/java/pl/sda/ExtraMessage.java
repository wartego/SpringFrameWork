package pl.sda;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExtraMessage {
    private String text;

    private void init() {
        System.out.println("Inicjalizacja obiektu w springu");
    }

    private void destroy() {
        System.out.println("destroy");
    }
}
