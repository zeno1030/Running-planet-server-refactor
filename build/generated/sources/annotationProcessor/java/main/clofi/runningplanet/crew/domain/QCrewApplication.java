package clofi.runningplanet.crew.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrewApplication is a Querydsl query type for CrewApplication
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrewApplication extends EntityPathBase<CrewApplication> {

    private static final long serialVersionUID = -180822410L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrewApplication crewApplication = new QCrewApplication("crewApplication");

    public final clofi.runningplanet.common.domain.QBaseSoftDeleteEntity _super = new clofi.runningplanet.common.domain.QBaseSoftDeleteEntity(this);

    public final EnumPath<Approval> approval = createEnum("approval", Approval.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QCrew crew;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath introduction = createString("introduction");

    public final clofi.runningplanet.member.domain.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCrewApplication(String variable) {
        this(CrewApplication.class, forVariable(variable), INITS);
    }

    public QCrewApplication(Path<? extends CrewApplication> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrewApplication(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrewApplication(PathMetadata metadata, PathInits inits) {
        this(CrewApplication.class, metadata, inits);
    }

    public QCrewApplication(Class<? extends CrewApplication> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.crew = inits.isInitialized("crew") ? new QCrew(forProperty("crew")) : null;
        this.member = inits.isInitialized("member") ? new clofi.runningplanet.member.domain.QMember(forProperty("member")) : null;
    }

}

