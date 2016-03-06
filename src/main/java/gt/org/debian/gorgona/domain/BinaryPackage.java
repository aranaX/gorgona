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
public class BinaryPackage {

    @GraphId
    private Long id;
    private String name;
    private String version;
    private String arch;

    @RelatedTo( type = "DEPEND_ON_EXEC", direction = Direction.OUTGOING )
    private @Fetch
    Set<BinaryPackage> dependedPackages;
    @RelatedTo( type = "RECOMMEND", direction = Direction.OUTGOING )
    private @Fetch
    Set<BinaryPackage> recomendedPackages;
    @RelatedTo( type = "SUGGEST", direction = Direction.OUTGOING )
    private @Fetch Set<BinaryPackage> sugestedPackages;    
    @RelatedTo( type = "BREAK", direction = Direction.OUTGOING )
    private @Fetch Set<BinaryPackage> brokePackages;    
    @RelatedTo( type = "REPLACE", direction = Direction.OUTGOING )
    private @Fetch
    Set<BinaryPackage> replacedPackages;

    public BinaryPackage() {
    }

    public BinaryPackage( final Long id, final String name, final String version, final String arch ) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.arch = arch;
    }

    public String getArch() {
        return arch;
    }

    public void setArch( String arch ) {
        this.arch = arch;
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

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Set<BinaryPackage> getSugestedPackages() {
        return sugestedPackages;
    }

    public void setSugestedPackages( Set<BinaryPackage> sugestedPackages ) {
        this.sugestedPackages = sugestedPackages;
    }

    public Set<BinaryPackage> getBrokePackages() {
        return brokePackages;
    }

    public void setBrokePackages( Set<BinaryPackage> brokePackages ) {
        this.brokePackages = brokePackages;
    }

    public Set<BinaryPackage> getReplacedPackages() {
        return replacedPackages;
    }

    public void setReplacedPackages( Set<BinaryPackage> replacedPackages ) {
        this.replacedPackages = replacedPackages;
    }

    public Set<BinaryPackage> getDependedPackages() {
        return dependedPackages;
    }

    public void setDependedPackages( Set<BinaryPackage> dependedPackages ) {
        this.dependedPackages = dependedPackages;
    }

    public Set<BinaryPackage> getRecomendedPackages() {
        return recomendedPackages;
    }

    public void setRecomendedPackages( Set<BinaryPackage> recomendedPackages ) {
        this.recomendedPackages = recomendedPackages;
    }

}
