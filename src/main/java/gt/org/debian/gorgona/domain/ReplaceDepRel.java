/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

/**
 *
 * @author aranax
 */
@RelationshipEntity( type = "REPLACE" )
public class ReplaceDepRel {

    @GraphId
    private Long id;
    @Fetch
    @StartNode
    private BinaryPackage binaryOrigin;
    @Fetch
    @EndNode
    private BinaryPackage binaryDestiny;

    public ReplaceDepRel() {
    }

    public ReplaceDepRel( final Long id, final BinaryPackage binaryOrigin, final BinaryPackage binaryDestiny ) {
        this.id = id;
        this.binaryOrigin = binaryOrigin;
        this.binaryDestiny = binaryDestiny;
    }

    public BinaryPackage getBinaryDestiny() {
        return binaryDestiny;
    }

    public void setBinaryDestiny( BinaryPackage binaryDestiny ) {
        this.binaryDestiny = binaryDestiny;
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
