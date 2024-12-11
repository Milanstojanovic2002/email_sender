package com.app.EmailSsender.controller;

import com.app.EmailSsender.model.MailStructure;
import com.app.EmailSsender.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    MailService mailService;

    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure m){
        mailService.sendMail(mail,m);
        return "Mail successfully sent";
    }
}
