/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.gorgona.domain;

import java.util.Set;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 *
 * @author aranax
 */
@NodeEntity
public class Package {
    
    @GraphId private Long id;
    private String name;
    private String version;

    @RelatedTo(type="DEPENDS", direction=Direction.BOTH)
    private @Fetch Set<Package> dependencies;
    
    @RelatedTo(type="RECOMMENDS", direction=Direction.BOTH)
    private @Fetch Set<Package> recomendetations;
    
    @RelatedTo(type="SUGGESTS", direction=Direction.BOTH)
    private @Fetch Set<Package> sugestions;
    
    @RelatedTo(type="BREAKS", direction=Direction.BOTH)
    private @Fetch Set<Package> brokes;
    
    @RelatedTo(type="REPLACES", direction=Direction.BOTH)
    private @Fetch Set<Package> replaces;
    
    public Package() {}
    public Package(final String name, final String version) { 
        this.name = name;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion( String version ) {
        this.version = version;
    }

    public Set<Package> getDependencies() {
        return dependencies;
    }

    public void setDependencies( Set<Package> dependencies ) {
        this.dependencies = dependencies;
    }

    public Set<Package> getRecomendetations() {
        return recomendetations;
    }

    public void setRecomendetations( Set<Package> recomendetations ) {
        this.recomendetations = recomendetations;
    }

    public Set<Package> getSugestions() {
        return sugestions;
    }

    public void setSugestions( Set<Package> sugestions ) {
        this.sugestions = sugestions;
    }

    public Set<Package> getBrokes() {
        return brokes;
    }

    public void setBrokes( Set<Package> brokes ) {
        this.brokes = brokes;
    }

    public Set<Package> getReplaces() {
        return replaces;
    }

    public void setReplaces( Set<Package> replaces ) {
        this.replaces = replaces;
    }

    

}
