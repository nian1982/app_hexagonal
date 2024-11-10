package com.nian.categoria.port.out;

import java.util.List;
import com.nian.categoria.Categoria;

public interface CategoriaRepostiry {

    Categoria save(Categoria categoria);
    Categoria getById(Long id);
    List<Categoria> getAll();
}
