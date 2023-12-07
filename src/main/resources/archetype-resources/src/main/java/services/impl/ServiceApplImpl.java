package ${package}.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.jpa.crud.TestTableRepository;
import ${package}.jpa.model.TestTableEntity;
import ${package}.dto.TestTableDto;
import ${package}.services.interfaces.ServiceAppl;
import org.springframework.stereotype.Service;

@Service
public class ServiceApplImpl implements ServiceAppl {
    private ModelMapper mapper = new ModelMapper();

    @Autowired
    private TestTableRepository testTableRepository;

    @Override
    public String getHello() {
        return "hello!";
    }

    @Override
    public TestTableEntity addTestTableDto(TestTableDto testTableDto) {
        return testTableRepository.save(mapper.map(testTableDto, TestTableEntity.class));
    }
}