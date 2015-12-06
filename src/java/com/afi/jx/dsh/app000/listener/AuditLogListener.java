/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afi.jx.dsh.app000.listener;

import com.afi.jx.dsh.app000.model.AuditLog;
import org.hibernate.envers.RevisionListener;

/**
 *
 * @author achmad
 */
public class AuditLogListener implements RevisionListener {

    @Override
    public void newRevision(Object o) {
        AuditLog obj = (AuditLog) o;
        // sementara hardcoded dulu, nantinya ambil dari user yang sedang login
        obj.setUsername("System");        
    }

}
