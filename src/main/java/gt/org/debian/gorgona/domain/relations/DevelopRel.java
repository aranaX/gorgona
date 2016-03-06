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
@RelationshipEntity( type = DeveloperRelation.DEVELOP )
public class DevelopRel {

    @GraphId
    private Long id;    
    @StartNode
    private Developer developer;    
    @EndNode
    private SourcePackage sourcePackage;
    private String tipo; //grupo individual

    public DevelopRel() {
    }

    public DevelopRel( final Long id, final Developer developer, final SourcePackage sourcePackage, final String tipo ) {
        this.id = id;
        this.developer = developer;
        this.sourcePackage = sourcePackage;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo( String tipo ) {
        this.tipo = tipo;
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
