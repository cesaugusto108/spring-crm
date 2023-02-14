package ces.augusto108.springcrm.controller;

import ces.augusto108.springcrm.entities.Customer;
import ces.augusto108.springcrm.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/list/all")
    public ModelAndView listCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list-customers");

        return modelAndView;
    }

    @GetMapping("/adding-form")
    public ModelAndView loadAddingForm(Model model) {
        model.addAttribute("customer", new Customer());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adding-form");

        return modelAndView;
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        if (customer != null) customerService.saveCustomer(customer);

        return "redirect:/customer/list/all";
    }
}
