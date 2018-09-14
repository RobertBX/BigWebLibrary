package repository;

import javax.persistence.EntityManager;

public class BorrowRepository extends GenericDao {
    protected BorrowRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
