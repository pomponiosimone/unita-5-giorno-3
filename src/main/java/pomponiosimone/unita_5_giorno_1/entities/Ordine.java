package pomponiosimone.unita_5_giorno_1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pomponiosimone.unita_5_giorno_1.enums.StatoTavolo;

import java.time.Clock;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Ordine {

    private int numeroOrdine;
    private int numeroCoperti;
    private Clock orario;
    private double importoTotale;
    private StatoTavolo statoTavolo;
    private List<Menu> listaElementiMenu;
    private int numeroElementi;

    public Ordine(@Value("${numero.ordine:1}") int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public void setListaElementiMenu(List<Menu> listaElementiMenu) {
        this.listaElementiMenu = listaElementiMenu;
        this.numeroElementi = listaElementiMenu != null ? listaElementiMenu.size() : 0;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", numeroCoperti=" + numeroCoperti +
                ", orario=" + orario +
                ", importoTotale=" + importoTotale +
                ", statoTavolo=" + statoTavolo +
                ", numeroElementi=" + numeroElementi +
                '}';
    }
}