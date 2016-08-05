/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brandes.springbootsecurity;
/**
 * Rest-Endpoint
 * @author brandes
 */
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Sample service.
 *
 * @author P.J. Meisch (pj.meisch@sothawo.com).
 */
@RestController
@RequestMapping("/service")
public class UserService {
    @RequestMapping(value = "/echo/{in}", method = RequestMethod.GET)
    public String echo(@PathVariable(value = "in") final String in) {
        return "You said: " + in;
    }
}