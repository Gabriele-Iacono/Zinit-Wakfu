package com.iacono.app.Zinit.models;


//Una volta fatto tutto ciò puoi passare ai prossimi punti ossia iniziare a fare le api degli item
//  (li voglio paginati) con la possibilità di specificare quanti oggetti per pagina,
// (i dati paginati sono fondamentali per un frontend) e oltre a questo voglio anche la possibilità
// di filtrare per parametri che ti invio ossia se io ti invio per esempio solo_elmo: True, mi aspetto di ricevere solo gli elmi
//(Ti do un consiglio in questo caso al 100% ti servirà un Dto perché solo_elmo non lo hai in
// nessun model e non è un informazione che ci serve salvare)
//Probabilmente per questo ultimo punto dovrai crearti una nella repository con JPA

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO<T> {
    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;

    }
