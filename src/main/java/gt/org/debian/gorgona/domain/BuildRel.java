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
@RelationshipEntity( type = "BUILD" )
public class BuildRel {
    @GraphId
    private Long id;
    @Fetch
    @StartNode
    private SourcePackage source;
    @Fetch
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
