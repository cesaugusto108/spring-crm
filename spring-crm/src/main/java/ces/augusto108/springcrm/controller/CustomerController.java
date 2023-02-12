package ces.augusto108.springcrm.controller;

import ces.augusto108.springcrm.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/list/all")
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());

        return "list-customers";
    }
}
