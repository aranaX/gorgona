/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain;

import java.util.Date;
import java.util.Set;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 *
 * @author aranax
 */
public class Bug {
    private Long id;
    private Long number;
    private Date date;
    private String severity;
    @RelatedTo(type="AFFECTS", direction=Direction.OUTGOING)
    private Set<Package> packagesAfected;

    public Bug(){}
    public Bug(final Long number, final Date date, final String severity){
        this.number = number;
        this.date = date;
        this.severity = severity;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber( Long number ) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity( String severity ) {
        this.severity = severity;
    }
    
    public Set<Package> getPackagesAfected() {
        return packagesAfected;
    }

    public void setPackagesAfected( Set<Package> packagesAfected ) {
        this.packagesAfected = packagesAfected;
    }  
}
