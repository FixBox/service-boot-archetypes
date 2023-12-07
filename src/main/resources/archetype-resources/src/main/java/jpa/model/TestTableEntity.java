package ${package}.jpa.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="TEST_TABLE")
@Data
public class TestTableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "uuid-char")
    @Column(name = "ID")
    private UUID id;

    @Column(name = "DESCRIPTION")
    private String description;
}
