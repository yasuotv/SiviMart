package nghienht.sivimartonline.api;


import nghienht.sivimartonline.model.CustomerEntity;
import nghienht.sivimartonline.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerApi {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity<List<CustomerEntity>> getAll(){
        return ResponseEntity.ok(customerService.findAll());
    }




}
