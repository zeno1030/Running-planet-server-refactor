package clofi.runningplanet.crew.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrewImage is a Querydsl query type for CrewImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrewImage extends EntityPathBase<CrewImage> {

    private static final long serialVersionUID = -2133141759L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrewImage crewImage = new QCrewImage("crewImage");

    public final clofi.runningplanet.common.domain.QBaseSoftDeleteEntity _super = new clofi.runningplanet.common.domain.QBaseSoftDeleteEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QCrew crew;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final StringPath filepath = createString("filepath");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath originalFilename = createString("originalFilename");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCrewImage(String variable) {
        this(CrewImage.class, forVariable(variable), INITS);
    }

    public QCrewImage(Path<? extends CrewImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrewImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrewImage(PathMetadata metadata, PathInits inits) {
        this(CrewImage.class, metadata, inits);
    }

    public QCrewImage(Class<? extends CrewImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.crew = inits.isInitialized("crew") ? new QCrew(forProperty("crew")) : null;
    }

}

