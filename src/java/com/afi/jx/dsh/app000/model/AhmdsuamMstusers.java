/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afi.jx.dsh.app000.model;


import com.afi.jx.lib.common.model.BaseAuditVersioning;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

/**
 *
 * @author AFI
 */
@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.AUDITED)
@Table(name = "AHMDSUAM_MSTUSERS")
public class AhmdsuamMstusers extends BaseAuditVersioning implements Serializable {

    @Column(name = "VUSERNAME", length = 30, nullable = false, unique = true)
    private String vusername;

    @Column(name = "VPASSWORD")
    private String vpassword;    
    
    @Column(name="VID_AHMDSBSC_MSTDLRCODE")    
    private String vidAhmdsbscMstdlrcode;
    
    
    @Column(name = "VSTAT",length=1)
    private String vstat;

    public String getVusername() {
        return vusername;
    }

    public void setVusername(String vusername) {
        this.vusername = vusername;
    }

    public String getVpassword() {
        return vpassword;
    }

    public void setVpassword(String vpassword) {
        this.vpassword = vpassword;
    }
    
    

    public String getVidAhmdsbscMstdlrcode() {
        return vidAhmdsbscMstdlrcode;
    }

    public void setVidAhmdsbscMstdlrcode(String vidAhmdsbscMstdlrcode) {
        this.vidAhmdsbscMstdlrcode = vidAhmdsbscMstdlrcode;
    }
    
    public String getVstat() {
        return vstat;
    }

    public void setVstat(String vstat) {
        this.vstat = vstat;
    }
}
