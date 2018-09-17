package repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Table;
import java.io.Serializable;


public class BorrowRepository  extends GenericDao  {
    protected BorrowRepository(EntityManager entityManager) {
        super(entityManager);
    }

}
