package com.achiever.candidate_registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/qr")
public class QRController {

    @PostMapping("/show")
    public String showQR(@RequestParam String refId, Model model) {

        model.addAttribute("showQr", true);
        model.addAttribute("refId", refId);

        return "success";   // return correct success file
    }
}
