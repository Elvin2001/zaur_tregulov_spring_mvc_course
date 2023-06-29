package com.zaurtregulov.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails() {
        return "ask-emp-datails-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);

        return "show-emp-details-view";
    }
}
