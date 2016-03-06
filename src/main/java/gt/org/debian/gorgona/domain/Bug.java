/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain;

import gt.org.debian.types.BugRelation;
import java.util.Date;
import java.util.Set;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

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

    @Relationship( type = BugRelation.AFFECTS, direction = Relationship.OUTGOING )
    private Set<SourcePackage> sourcePackagesAfected;
    @Relationship( type = BugRelation.AFFECTS, direction = Relationship.OUTGOING )
    private Set<BinaryPackage> binaryPackagesAfected;

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

    public Set<SourcePackage> getSourcePackagesAfected() {
        return sourcePackagesAfected;
    }

    public void setSourcePackagesAfected( Set<SourcePackage> sourcePackagesAfected ) {
        this.sourcePackagesAfected = sourcePackagesAfected;
    }

    public Set<BinaryPackage> getBinaryPackagesAfected() {
        return binaryPackagesAfected;
    }

    public void setBinaryPackagesAfected( Set<BinaryPackage> binaryPackagesAfected ) {
        this.binaryPackagesAfected = binaryPackagesAfected;
    }
}
