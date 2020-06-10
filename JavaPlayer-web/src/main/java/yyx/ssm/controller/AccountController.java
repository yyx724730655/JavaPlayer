package yyx.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yyx.ssm.domain.Account;
import yyx.ssm.service.AccountService;


import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("account/findAll")
    public String findAll(Model model) {
        List<Account> list=accountService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "/account/findAll";
    }

    @RequestMapping("account/saveAccount")
    public String saveAccount(Model model) {
        return "";
    }
}
