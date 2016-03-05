/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain;

import java.util.Date;
import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

/**
 *
 * @author aranax
 */
@RelationshipEntity( type = "UPLOAD" )
public class UploadRel {
    @GraphId
    private Long id;
    @Fetch
    @StartNode
    private Developer developer;
    @Fetch
    @EndNode
    private SourcePackage sourcePackage;
    private Date date;

    public UploadRel() {
    }

    public UploadRel( final Long id, final Developer developer, final SourcePackage sourcePackage, final Date date ) {
        this.id = id;
        this.developer = developer;
        this.sourcePackage = sourcePackage;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper( Developer developer ) {
        this.developer = developer;
    }

    public SourcePackage getSourcePackage() {
        return sourcePackage;
    }

    public void setSourcePackage( SourcePackage sourcePackage ) {
        this.sourcePackage = sourcePackage;
    }
}
