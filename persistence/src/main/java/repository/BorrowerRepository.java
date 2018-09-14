package repository;

import javax.persistence.EntityManager;

public class BorrowerRepository extends GenericDao {
    protected BorrowerRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
