package com.nian.categoria.service;

import com.nian.categoria.Categoria;
import com.nian.categoria.port.in.CreateCategoriaUseCase;
import com.nian.categoria.port.out.CategoriaRepostiry;

public class CreateCategoriaService implements CreateCategoriaUseCase {

    private final CategoriaRepostiry categoriaRepostiry;

    public CreateCategoriaService(CategoriaRepostiry categoriaRepostiry){
        this.categoriaRepostiry = categoriaRepostiry;
    }

    @Override
    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepostiry.save(categoria);
    }

}
