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
public class BinaryPackage {

    @GraphId
    private Long id;
    private String name;
    private String version;
    private String arch;

    @Relationship( type = PackageRelation.DEPEND_ON_EXEC, direction = Relationship.OUTGOING )
    private Set<BinaryPackage> dependedPackages;
    @Relationship( type = PackageRelation.RECOMMEND, direction = Relationship.OUTGOING )
    private  Set<BinaryPackage> recomendedPackages;
    @Relationship( type = PackageRelation.SUGGEST, direction = Relationship.OUTGOING )
    private  Set<BinaryPackage> sugestedPackages;    
    @Relationship( type = PackageRelation.BREAK, direction = Relationship.OUTGOING )
    private  Set<BinaryPackage> brokePackages;    
    @Relationship( type = PackageRelation.REPLACE, direction = Relationship.OUTGOING )
    private  Set<BinaryPackage> replacedPackages;

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
