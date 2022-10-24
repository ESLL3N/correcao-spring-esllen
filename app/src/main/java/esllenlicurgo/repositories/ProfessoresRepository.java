package esllenlicurgo.repositories;

import org.springframework.data.repository.CrudRepository;
import esllenlicurgo.models.Professor;

public interface ProfessoresRepository extends CrudRepository<Professor, Integer> {
    
}
