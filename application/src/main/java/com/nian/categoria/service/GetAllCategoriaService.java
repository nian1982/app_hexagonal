package com.nian.categoria.service;

import java.util.List;

import com.nian.categoria.Categoria;
import com.nian.categoria.port.in.GetAllCategoriasUseCase;
import com.nian.categoria.port.out.CategoriaRepostiry;

public class GetAllCategoriaService implements GetAllCategoriasUseCase {

    private final CategoriaRepostiry categoriaRepostiry;

    public GetAllCategoriaService(CategoriaRepostiry categoriaRepostiry){
        this.categoriaRepostiry = categoriaRepostiry;
    }

    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepostiry.getAll();
    }

}
