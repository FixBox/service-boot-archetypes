package ${package}.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import ${package}.services.interfaces.ServiceAppl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/")
@Api(value = "prov" , produces = "Json")
public class ControllerAppl {

    @Autowired
    ServiceAppl serviceAppl;

    @ApiOperation(value = "Test Demo", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping("/demo")
    public ResponseEntity<String> getAllShipping() {
        ResponseEntity<String> responseEntity =  new  ResponseEntity<String>(serviceAppl.getHello(), HttpStatus.OK );
        return responseEntity;
    }

}
