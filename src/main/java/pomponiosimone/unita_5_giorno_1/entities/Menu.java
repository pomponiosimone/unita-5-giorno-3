package pomponiosimone.unita_5_giorno_1.entities;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Menu {


    protected String name;
    protected int calories;
    protected double price;
}

