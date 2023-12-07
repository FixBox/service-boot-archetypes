package ${package}.services.interfaces;

import ${package}.dto.TestTableDto;
import ${package}.jpa.model.TestTableEntity;
public interface ServiceAppl {
    String getHello();

    TestTableEntity addTestTableDto(TestTableDto testTableDto);
}