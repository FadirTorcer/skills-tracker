package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String welcome() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>What tools will we use to save the world today?</h2>" +
                "<ol>" +
                "<li>JavaScript" +
                "<li>Java" +
                "<li>Python" +
                "<li>PHP" +
                "</ol>" +
                "<br>" +
                "<a href='localhost:8080/form'>Let's go to the form</a>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<label>" +
                "<select>" +
                "<option>JavaScript" +
                "<option>Java" +
                "<option>Python" +
                "<option>PHP" +
                "</select>" +
                "</label>" +
                "<input type='submit' value='Let's learn these!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
