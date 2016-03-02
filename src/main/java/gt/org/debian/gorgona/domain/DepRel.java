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
@RelationshipEntity( type = "DEPENDS" )
public class DepRel {

    @GraphId
    private Long id;
    private String type;
    private String version;
    @Fetch @StartNode
    private Package origin;
    @Fetch @EndNode
    private Package dependency;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion( String version ) {
        this.version = version;
    }

    public Package getOrigin() {
        return origin;
    }

    public void setOrigin( Package origin ) {
        this.origin = origin;
    }

    public Package getDependency() {
        return dependency;
    }

    public void setDependency( Package dependency ) {
        this.dependency = dependency;
    }

}