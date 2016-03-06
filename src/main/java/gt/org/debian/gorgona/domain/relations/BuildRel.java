/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain.relations;

import gt.org.debian.gorgona.domain.BinaryPackage;
import gt.org.debian.gorgona.domain.SourcePackage;
import gt.org.debian.types.PackageRelation;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author aranax
 */
@RelationshipEntity( type = PackageRelation.BUILD )
public class BuildRel {
    @GraphId
    private Long id;    
    @StartNode
    private SourcePackage source;    
    @EndNode
    private BinaryPackage binary;
    private long buildTime;

    public BuildRel() {
    }

    public BuildRel( final Long id, final SourcePackage source, final BinaryPackage binary, final long buildTime ) {
        this.id = id;
        this.source = source;
        this.binary = binary;
        this.buildTime = buildTime;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public SourcePackage getSource() {
        return source;
    }

    public void setSource( SourcePackage source ) {
        this.source = source;
    }

    public BinaryPackage getBinary() {
        return binary;
    }

    public void setBinary( BinaryPackage binary ) {
        this.binary = binary;
    }

    public long getBuildTime() {
        return buildTime;
    }

    public void setBuildTime( long buildTime ) {
        this.buildTime = buildTime;
    }


}
