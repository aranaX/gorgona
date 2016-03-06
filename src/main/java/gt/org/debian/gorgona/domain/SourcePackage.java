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
public class SourcePackage {    
    @GraphId private Long id;
    private String name;
    private String version;

    @RelatedTo(type="DEPEND_ON_BUILD", direction=Direction.Ingoing)
    private @Fetch Set<BinaryPackages> buildDependencies;
    
    @RelatedTo(type="BUILD", direction=Direction.Outgoingx)
    private @Fetch Set<BinaryPackage> binaryBuilded;
    
    public SourcePackage() {}
    public SourcePackage(final String name, final String version) { 
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

    public Set<SourcePackage> getDependencies() {
        return dependencies;
    }

    public void setDependencies( Set<SourcePackage> dependencies ) {
        this.dependencies = dependencies;
    }

    public Set<SourcePackage> getRecomendetations() {
        return recomendetations;
    }

    public void setRecomendetations( Set<SourcePackage> recomendetations ) {
        this.recomendetations = recomendetations;
    }

    public Set<SourcePackage> getSugestions() {
        return sugestions;
    }

    public void setSugestions( Set<SourcePackage> sugestions ) {
        this.sugestions = sugestions;
    }

    public Set<SourcePackage> getBrokes() {
        return brokes;
    }

    public void setBrokes( Set<SourcePackage> brokes ) {
        this.brokes = brokes;
    }

    public Set<SourcePackage> getReplaces() {
        return replaces;
    }

    public void setReplaces( Set<SourcePackage> replaces ) {
        this.replaces = replaces;
    }

    

}
