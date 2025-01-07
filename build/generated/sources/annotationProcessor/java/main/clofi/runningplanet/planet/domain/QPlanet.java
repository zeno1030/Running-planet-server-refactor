package clofi.runningplanet.planet.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlanet is a Querydsl query type for Planet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlanet extends EntityPathBase<Planet> {

    private static final long serialVersionUID = 286697832L;

    public static final QPlanet planet = new QPlanet("planet");

    public final clofi.runningplanet.common.domain.QBaseEntity _super = new clofi.runningplanet.common.domain.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath fifthPlanet = createString("fifthPlanet");

    public final StringPath firstPlanet = createString("firstPlanet");

    public final StringPath fourthPlanet = createString("fourthPlanet");

    public final StringPath planetDefaultName = createString("planetDefaultName");

    public final NumberPath<Long> planetImageId = createNumber("planetImageId", Long.class);

    public final StringPath secondPlanet = createString("secondPlanet");

    public final StringPath thirdPlanet = createString("thirdPlanet");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPlanet(String variable) {
        super(Planet.class, forVariable(variable));
    }

    public QPlanet(Path<? extends Planet> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlanet(PathMetadata metadata) {
        super(Planet.class, metadata);
    }

}

