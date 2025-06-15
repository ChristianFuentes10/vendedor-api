package com.vendedor_api.repositories;

import com.vendedor_api.models.VendedorModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepositories extends JpaRepository<VendedorModels, Integer> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
