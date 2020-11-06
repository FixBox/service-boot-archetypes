package ${package}.services.impl;

import ${package}.services.interfaces.ServiceAppl;
import org.springframework.stereotype.Service;

@Service
public class ServiceApplImpl implements ServiceAppl {
    @Override
    public String getHello() {
        return "hello!";
    }
}