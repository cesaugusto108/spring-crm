package ces.augusto108.springcrm.controller;

import ces.augusto108.springcrm.entities.Customer;
import ces.augusto108.springcrm.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, editor);
    }

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
    public String saveOrUpdate(
            @Valid @ModelAttribute("customer") Customer customer, BindingResult result
    ) {
        if (result.hasErrors()) return "adding-form";

        customerService.saveOrUpdate(customer);

        return "redirect:/customer/list/all";
    }

    @GetMapping("/update-form")
    public ModelAndView updateCustomer(@RequestParam int id, Model model) {
        model.addAttribute("customer", customerService.getCustomer(id));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update-form");

        return modelAndView;
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam int id) {
        Customer customer = customerService.getCustomer(id);

        customerService.deleteCustomer(customer);

        return "redirect:/customer/list/all";
    }
}
