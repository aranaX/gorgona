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
@RelationshipEntity( type = PackageRelation.DEPEND_ON_BUILD )
public class BuildDependRel {

    @GraphId
    private Long id;    
    @StartNode
    private SourcePackage source;
    @EndNode
    private BinaryPackage binary;

    public BuildDependRel() {
    }

    public BuildDependRel( final Long id, final SourcePackage source, final BinaryPackage binary ) {
        this.id = id;
        this.source = source;
        this.binary = binary;
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
}