/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain.relations;

import gt.org.debian.gorgona.domain.Developer;
import gt.org.debian.gorgona.domain.SourcePackage;
import gt.org.debian.types.DeveloperRelation;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author aranax
 */
@RelationshipEntity( type = DeveloperRelation.MAINTAIN )
public class MantainRel {
    @GraphId
    private Long id;    
    @StartNode
    private Developer developer;    
    @EndNode
    private SourcePackage sourcePackage;
    private String type;

    public MantainRel() {
    }

    public MantainRel( final Long id, final Developer developer, final SourcePackage sourcePackage, final String type ) {
        this.id = id;
        this.developer = developer;
        this.sourcePackage = sourcePackage;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
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
