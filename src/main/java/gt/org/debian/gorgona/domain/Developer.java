package gt.org.debian.gorgona.domain;

import gt.org.debian.types.DeveloperRelation;
import java.util.Set;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 *
 * @author aranax
 */
@NodeEntity
public class Developer {
    @GraphId
    private Long id;
    private String nickname;
    private String email;
    private String tipo; //individual, team
    private String member; //internal, external

    @Relationship( type = DeveloperRelation.MAINTAIN, direction = Relationship.OUTGOING )
    private  Set<SourcePackage> packagesMantained;
    @Relationship( type = DeveloperRelation.REPORT, direction = Relationship.OUTGOING )
    private 
    Set<Bug> bugsReported;
    @Relationship( type = DeveloperRelation.UPLOAD, direction = Relationship.OUTGOING )
    private  Set<SourcePackage> packagesUploaded;
    @Relationship( type = DeveloperRelation.DEVELOP, direction = Relationship.OUTGOING )
    private 
    Set<SourcePackage> packagesDeveloped;
    @Relationship( type = DeveloperRelation.REPAIR, direction = Relationship.OUTGOING )
    private 
    Set<SourcePackage> packagesRepaired;

    public Developer() {
    }

    public Developer( final Long id, final String nickname, final String email,
            final String tipo, final String member ) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.tipo = tipo;
        this.member = member;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getMember() {
        return member;
    }

    public void setMember( String member ) {
        this.member = member;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname( String nickname ) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo( String tipo ) {
        this.tipo = tipo;
    }

    public Set<SourcePackage> getPackagesMantained() {
        return packagesMantained;
    }

    public void setPackagesMantained( Set<SourcePackage> packagesMantained ) {
        this.packagesMantained = packagesMantained;
    }

    public Set<Bug> getBugsReported() {
        return bugsReported;
    }

    public void setBugsReported( Set<Bug> bugsReported ) {
        this.bugsReported = bugsReported;
    }

    public Set<SourcePackage> getPackagesUploaded() {
        return packagesUploaded;
    }

    public void setPackagesUploaded( Set<SourcePackage> packagesUploaded ) {
        this.packagesUploaded = packagesUploaded;
    }

    public Set<SourcePackage> getPackagesDeveloped() {
        return packagesDeveloped;
    }

    public void setPackagesDeveloped( Set<SourcePackage> packagesDeveloped ) {
        this.packagesDeveloped = packagesDeveloped;
    }

    public Set<SourcePackage> getPackagesRepaired() {
        return packagesRepaired;
    }

    public void setPackagesRepaired( Set<SourcePackage> packagesRepaired ) {
        this.packagesRepaired = packagesRepaired;
    }
}
