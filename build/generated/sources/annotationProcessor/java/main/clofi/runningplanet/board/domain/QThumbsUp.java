package clofi.runningplanet.board.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QThumbsUp is a Querydsl query type for ThumbsUp
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QThumbsUp extends EntityPathBase<ThumbsUp> {

    private static final long serialVersionUID = 1743951422L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QThumbsUp thumbsUp = new QThumbsUp("thumbsUp");

    public final clofi.runningplanet.common.domain.QBaseEntity _super = new clofi.runningplanet.common.domain.QBaseEntity(this);

    public final QBoard board;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final clofi.runningplanet.member.domain.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QThumbsUp(String variable) {
        this(ThumbsUp.class, forVariable(variable), INITS);
    }

    public QThumbsUp(Path<? extends ThumbsUp> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QThumbsUp(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QThumbsUp(PathMetadata metadata, PathInits inits) {
        this(ThumbsUp.class, metadata, inits);
    }

    public QThumbsUp(Class<? extends ThumbsUp> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
        this.member = inits.isInitialized("member") ? new clofi.runningplanet.member.domain.QMember(forProperty("member")) : null;
    }

}

