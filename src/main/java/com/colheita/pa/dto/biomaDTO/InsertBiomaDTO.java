package com.colheita.pa.dto.biomaDTO;


import java.util.List;

import com.colheita.pa.entities.Muda;

public class InsertBiomaDTO {

    private long id;
    private String nomeBioma;
    private List<Muda> mudas;

    public InsertBiomaDTO() {
    }

    public InsertBiomaDTO(long id, String nomeBioma, List<Muda> mudas) {
        this.id = id;
        this.nomeBioma = nomeBioma;
        this.mudas = mudas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeBioma() {
        return nomeBioma;
    }

    public void setNomeBioma(String nomeBioma) {
        this.nomeBioma = nomeBioma;
    }

    public List<Muda> getMudas() {
        return mudas;
    }

    public void setMudas(List<Muda> mudas) {
        this.mudas = mudas;
    }

}
