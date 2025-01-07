package clofi.runningplanet.common.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseSoftDeleteEntity is a Querydsl query type for BaseSoftDeleteEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseSoftDeleteEntity extends EntityPathBase<BaseSoftDeleteEntity> {

    private static final long serialVersionUID = 999826764L;

    public static final QBaseSoftDeleteEntity baseSoftDeleteEntity = new QBaseSoftDeleteEntity("baseSoftDeleteEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBaseSoftDeleteEntity(String variable) {
        super(BaseSoftDeleteEntity.class, forVariable(variable));
    }

    public QBaseSoftDeleteEntity(Path<? extends BaseSoftDeleteEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseSoftDeleteEntity(PathMetadata metadata) {
        super(BaseSoftDeleteEntity.class, metadata);
    }

}

