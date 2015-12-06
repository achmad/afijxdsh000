/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author achmad.ha
 */
public class Data {
    
    private String token;
    private String username;
    private String name;
    
    private String kodeDealer;
    private String namaDealer;
    private String alamatDealer;
    private String kota;
    private String noTelpon;

    public Data() {
    }
    
    public Data(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }    

    public String getKodeDealer() {
        return kodeDealer;
    }

    public void setKodeDealer(String kodeDealer) {
        this.kodeDealer = kodeDealer;
    }

    public String getNamaDealer() {
        return namaDealer;
    }

    public void setNamaDealer(String namaDealer) {
        this.namaDealer = namaDealer;
    }

    public String getAlamatDealer() {
        return alamatDealer;
    }

    public void setAlamatDealer(String alamatDealer) {
        this.alamatDealer = alamatDealer;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }
}
