package org.lab.resources;

import org.lab.entity.Pessoa;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface PessoaResource extends PanacheEntityResource<Pessoa, Long> {
    
}
