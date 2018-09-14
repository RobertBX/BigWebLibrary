package repository;

import javax.persistence.EntityManager;

public class BookRepository extends GenericDao {
    protected BookRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
