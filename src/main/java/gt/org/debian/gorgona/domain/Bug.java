/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain;

import java.util.Date;
import java.util.Set;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 *
 * @author aranax
 */
@NodeEntity
public class Bug {

    @GraphId
    private Long id;
    private Long number;
    private Date date;
    private String severity;
    private String tags[];

    @RelatedTo(type="AFFECTS", direction=Direction.OUTGOING)
    private Set<SourcePackage> packagesAfected;

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

    public String[] getTags() {
        return tags;
    }

    public void setTags( String[] tags ) {
        this.tags = tags;
    }
    public Set<SourcePackage> getPackagesAfected() {
        return packagesAfected;
    }

    public void setPackagesAfected( Set<SourcePackage> packagesAfected ) {
        this.packagesAfected = packagesAfected;
    }  
}
