package clofi.runningplanet.planet.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberPlanet is a Querydsl query type for MemberPlanet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberPlanet extends EntityPathBase<MemberPlanet> {

    private static final long serialVersionUID = 1593387170L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPlanet memberPlanet = new QMemberPlanet("memberPlanet");

    public final clofi.runningplanet.common.domain.QBaseEntity _super = new clofi.runningplanet.common.domain.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final clofi.runningplanet.member.domain.QMember memberId;

    public final NumberPath<Long> memberPlanetId = createNumber("memberPlanetId", Long.class);

    public final StringPath memberPlanetName = createString("memberPlanetName");

    public final QPlanet planetId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberPlanet(String variable) {
        this(MemberPlanet.class, forVariable(variable), INITS);
    }

    public QMemberPlanet(Path<? extends MemberPlanet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberPlanet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberPlanet(PathMetadata metadata, PathInits inits) {
        this(MemberPlanet.class, metadata, inits);
    }

    public QMemberPlanet(Class<? extends MemberPlanet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberId = inits.isInitialized("memberId") ? new clofi.runningplanet.member.domain.QMember(forProperty("memberId")) : null;
        this.planetId = inits.isInitialized("planetId") ? new QPlanet(forProperty("planetId")) : null;
    }

}

