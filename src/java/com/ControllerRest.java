/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 *
 * @author achmad.ha
 */
@Controller
@RequestMapping("/kfc/brands")
public class ControllerRest {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public @ResponseBody DtoRespond apaAja(@CookieValue(value = "hitCounter", defaultValue = "0") Long hitCounter,
        @CookieValue(value = "stringCookie", defaultValue = "") String stringCookie,
        HttpServletRequest servletRequest,HttpServletResponse response) {
        
//        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        Cookie cookie = new Cookie("name", "value");
        cookie.setPath(";HttpOnly;");
//        cookie.setSecure(true);
        
        Cookie cookie1 = new Cookie("name1", "value1");
        // increment hit counter
        hitCounter++; 
        // create cookie and set it in response
        Cookie cookie2 = new Cookie("hitCounter", hitCounter.toString());
        if(stringCookie.equalsIgnoreCase("")){
            response.addCookie(new Cookie("stringCookie", "gak ada"));
        }else{
            response.addCookie(new Cookie("stringCookie", "sudah ada"));
        }
        
        response.addCookie(cookie);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        DtoRespond respond = new DtoRespond();
        respond.setMsg("SUKSES");
        respond.setStat("1");
        return respond;
    
    }
    
    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public @ResponseBody DtoRespond methodPost() {
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        DtoRespond respond = new DtoRespond();
        respond.setMsg("SUKSES POST");
        respond.setStat("100");
        Data data = new Data("DATA1");        
        return respond;
    }
    
    @RequestMapping("/greeting")
    public @ResponseBody Greeting greeting(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	System.out.println("==== in greeting ====");
        return new Greeting(1,name);
    }
}