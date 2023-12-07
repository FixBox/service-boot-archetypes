package ${package}.jpa.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ${package}.jpa.model.TestTableEntity;

import java.util.UUID;

@Repository
public interface TestTableRepository  extends CrudRepository<TestTableEntity , UUID> {
}