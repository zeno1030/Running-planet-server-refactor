package clofi.runningplanet.running.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCheer is a Querydsl query type for Cheer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCheer extends EntityPathBase<Cheer> {

    private static final long serialVersionUID = 419189870L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCheer cheer = new QCheer("cheer");

    public final clofi.runningplanet.common.domain.QBaseSoftDeleteEntity _super = new clofi.runningplanet.common.domain.QBaseSoftDeleteEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final clofi.runningplanet.member.domain.QMember fromMember;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final clofi.runningplanet.member.domain.QMember toMember;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCheer(String variable) {
        this(Cheer.class, forVariable(variable), INITS);
    }

    public QCheer(Path<? extends Cheer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCheer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCheer(PathMetadata metadata, PathInits inits) {
        this(Cheer.class, metadata, inits);
    }

    public QCheer(Class<? extends Cheer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fromMember = inits.isInitialized("fromMember") ? new clofi.runningplanet.member.domain.QMember(forProperty("fromMember")) : null;
        this.toMember = inits.isInitialized("toMember") ? new clofi.runningplanet.member.domain.QMember(forProperty("toMember")) : null;
    }

}

