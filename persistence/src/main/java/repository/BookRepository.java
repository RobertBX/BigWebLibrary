package repository;

import javax.persistence.*;
import java.io.Serializable;


public class BookRepository extends GenericDao implements Serializable {
    protected BookRepository(EntityManager entityManager) {
        super(entityManager);
    }

}
