package clofi.runningplanet.mission.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrewMission is a Querydsl query type for CrewMission
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrewMission extends EntityPathBase<CrewMission> {

    private static final long serialVersionUID = 620917343L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrewMission crewMission = new QCrewMission("crewMission");

    public final clofi.runningplanet.common.domain.QBaseEntity _super = new clofi.runningplanet.common.domain.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final clofi.runningplanet.crew.domain.QCrew crew;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isCompleted = createBoolean("isCompleted");

    public final clofi.runningplanet.member.domain.QMember member;

    public final EnumPath<MissionType> type = createEnum("type", MissionType.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCrewMission(String variable) {
        this(CrewMission.class, forVariable(variable), INITS);
    }

    public QCrewMission(Path<? extends CrewMission> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrewMission(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrewMission(PathMetadata metadata, PathInits inits) {
        this(CrewMission.class, metadata, inits);
    }

    public QCrewMission(Class<? extends CrewMission> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.crew = inits.isInitialized("crew") ? new clofi.runningplanet.crew.domain.QCrew(forProperty("crew")) : null;
        this.member = inits.isInitialized("member") ? new clofi.runningplanet.member.domain.QMember(forProperty("member")) : null;
    }

}

