/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author achmad.ha
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")
public class RequestNotFoundException extends RuntimeException{
    
    
    
}
