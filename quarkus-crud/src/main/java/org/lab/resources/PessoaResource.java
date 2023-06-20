package org.lab.resources;

import org.lab.entity.Pessoa;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;

public interface PessoaResource extends PanacheEntityResource<Pessoa, Long> {
    
    @MethodProperties(exposed = false)
    @Override
    default Pessoa update(Long id, Pessoa entity) {
        // TODO Implementar.
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }


}
