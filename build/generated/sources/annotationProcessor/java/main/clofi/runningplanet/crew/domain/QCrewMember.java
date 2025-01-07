package clofi.runningplanet.crew.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrewMember is a Querydsl query type for CrewMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrewMember extends EntityPathBase<CrewMember> {

    private static final long serialVersionUID = -1595403852L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrewMember crewMember = new QCrewMember("crewMember");

    public final clofi.runningplanet.common.domain.QBaseSoftDeleteEntity _super = new clofi.runningplanet.common.domain.QBaseSoftDeleteEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QCrew crew;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final clofi.runningplanet.member.domain.QMember member;

    public final EnumPath<Role> role = createEnum("role", Role.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCrewMember(String variable) {
        this(CrewMember.class, forVariable(variable), INITS);
    }

    public QCrewMember(Path<? extends CrewMember> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrewMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrewMember(PathMetadata metadata, PathInits inits) {
        this(CrewMember.class, metadata, inits);
    }

    public QCrewMember(Class<? extends CrewMember> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.crew = inits.isInitialized("crew") ? new QCrew(forProperty("crew")) : null;
        this.member = inits.isInitialized("member") ? new clofi.runningplanet.member.domain.QMember(forProperty("member")) : null;
    }

}

