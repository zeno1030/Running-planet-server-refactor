package clofi.runningplanet.crew.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCrew is a Querydsl query type for Crew
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrew extends EntityPathBase<Crew> {

    private static final long serialVersionUID = -1356407174L;

    public static final QCrew crew = new QCrew("crew");

    public final clofi.runningplanet.common.domain.QBaseSoftDeleteEntity _super = new clofi.runningplanet.common.domain.QBaseSoftDeleteEntity(this);

    public final EnumPath<ApprovalType> approvalType = createEnum("approvalType", ApprovalType.class);

    public final EnumPath<Category> category = createEnum("category", Category.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> crewExp = createNumber("crewExp", Integer.class);

    public final NumberPath<Integer> crewLevel = createNumber("crewLevel", Integer.class);

    public final StringPath crewName = createString("crewName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath introduction = createString("introduction");

    public final NumberPath<Long> leaderId = createNumber("leaderId", Long.class);

    public final NumberPath<Integer> limitMemberCnt = createNumber("limitMemberCnt", Integer.class);

    public final NumberPath<Integer> ruleDistance = createNumber("ruleDistance", Integer.class);

    public final NumberPath<Integer> ruleRunCnt = createNumber("ruleRunCnt", Integer.class);

    public final NumberPath<Integer> totalDistance = createNumber("totalDistance", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final NumberPath<Integer> weeklyDistance = createNumber("weeklyDistance", Integer.class);

    public QCrew(String variable) {
        super(Crew.class, forVariable(variable));
    }

    public QCrew(Path<? extends Crew> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCrew(PathMetadata metadata) {
        super(Crew.class, metadata);
    }

}

