package pomponiosimone.unita_5_giorno_1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pomponiosimone.unita_5_giorno_1.enums.StatoTavolo;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Tavolo {

    private int numeroTavolo;
    private int numeroCoperti;
   private StatoTavolo statoTavolo;

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroCoperti=" + numeroCoperti +
                ", numeroTavolo=" + numeroTavolo +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}

