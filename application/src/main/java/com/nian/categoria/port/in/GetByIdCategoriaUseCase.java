package com.nian.categoria.port.in;

import com.nian.categoria.Categoria;

public interface GetByIdCategoriaUseCase {
    Categoria categoria(Long id);
}
