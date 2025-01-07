package clofi.runningplanet.running.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoordinate is a Querydsl query type for Coordinate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoordinate extends EntityPathBase<Coordinate> {

    private static final long serialVersionUID = -239054089L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoordinate coordinate = new QCoordinate("coordinate");

    public final clofi.runningplanet.common.domain.QBaseSoftDeleteEntity _super = new clofi.runningplanet.common.domain.QBaseSoftDeleteEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final QRecord record;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoordinate(String variable) {
        this(Coordinate.class, forVariable(variable), INITS);
    }

    public QCoordinate(Path<? extends Coordinate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoordinate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoordinate(PathMetadata metadata, PathInits inits) {
        this(Coordinate.class, metadata, inits);
    }

    public QCoordinate(Class<? extends Coordinate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.record = inits.isInitialized("record") ? new QRecord(forProperty("record"), inits.get("record")) : null;
    }

}

