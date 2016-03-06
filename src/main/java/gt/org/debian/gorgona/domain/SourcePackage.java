package gt.org.debian.gorgona.domain;

import gt.org.debian.types.PackageRelation;
import java.util.Set;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 *
 * @author aranax
 */
@NodeEntity
public class SourcePackage {    
    @GraphId private Long id;
    private String name;
    private String version;

    @Relationship( type = PackageRelation.DEPEND_ON_BUILD, direction = Relationship.INCOMING )
    private  Set<BinaryPackage> buildDependencies;
    
    @Relationship( type = PackageRelation.BUILD, direction = Relationship.OUTGOING )
    private  Set<BinaryPackage> binaryBuilded;
    
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

    public Set<BinaryPackage> getBuildDependencies() {
        return buildDependencies;
    }

    public void setBuildDependencies( Set<BinaryPackage> buildDependencies ) {
        this.buildDependencies = buildDependencies;
    }

    public Set<BinaryPackage> getBinaryBuilded() {
        return binaryBuilded;
    }

    public void setBinaryBuilded( Set<BinaryPackage> binaryBuilded ) {
        this.binaryBuilded = binaryBuilded;
    }
}
