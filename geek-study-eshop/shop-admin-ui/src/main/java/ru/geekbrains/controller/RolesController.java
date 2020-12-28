package ru.geekbrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.controller.data.RoleData;
import ru.geekbrains.error.NotFoundException;
import ru.geekbrains.service.RoleService;

import javax.validation.Valid;

@Controller
public class RolesController {

    private final RoleService roleService;

    @Autowired
    public RolesController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public String adminRolesPage(Model model) {
        model.addAttribute("activePage", "Roles");
        model.addAttribute("roles", roleService.findAll());
        return "roles";
    }

    @GetMapping("/role/{id}/demonstrate")
    public String adminEditUser(Model model, @PathVariable("id") Long id) {
        model.addAttribute("activePage", "Roles");
        model.addAttribute("roles", roleService.findById(id).orElseThrow(NotFoundException::new));
        return "role_demonstrate";
    }

    @GetMapping("/role/create")
    public String adminCreateRole(Model model) {
        model.addAttribute("create", true);
        model.addAttribute("activePage", "Roles");
        model.addAttribute("role", new RoleData());
        return "role_form";
    }

    @PostMapping("/role")
    public String adminUpsertRole(@Valid RoleData role, Model model, BindingResult bindingResult) {
        model.addAttribute("activePage", "Roles");
        if (bindingResult.hasErrors()) {
            return "role_form";
        }
        roleService.save(role);
        return "redirect:/roles";
    }

    @DeleteMapping("/role/{id}/delete")
    public String adminDeleteRole(Model model, @PathVariable("id") Long id) {
        roleService.delete(id);
        return "redirect:/roles";
    }
}
