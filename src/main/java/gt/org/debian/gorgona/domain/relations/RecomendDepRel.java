/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain.relations;

import gt.org.debian.gorgona.domain.BinaryPackage;
import gt.org.debian.types.PackageRelation;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author aranax
 */
@RelationshipEntity( type = PackageRelation.RECOMMEND )
public class RecomendDepRel {
    @GraphId
    private Long id;    
    @StartNode
    private BinaryPackage binaryOrigin;    
    @EndNode
    private BinaryPackage binaryDestin;

    public RecomendDepRel() {
    }

    public RecomendDepRel( final Long id, final BinaryPackage binaryOrigin, final BinaryPackage binaryDestin ) {
        this.id = id;
        this.binaryOrigin = binaryOrigin;
        this.binaryDestin = binaryDestin;
    }

    public BinaryPackage getBinaryDestin() {
        return binaryDestin;
    }

    public void setBinaryDestin( BinaryPackage binaryDestin ) {
        this.binaryDestin = binaryDestin;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public BinaryPackage getBinaryOrigin() {
        return binaryOrigin;
    }

    public void setBinaryOrigin( BinaryPackage binaryOrigin ) {
        this.binaryOrigin = binaryOrigin;
    }
}
