package repository;


import javax.persistence.EntityManager;

public class AuthorRepository extends GenericDao {


    protected AuthorRepository(EntityManager entityManager) {
        super(entityManager);
    }

}
