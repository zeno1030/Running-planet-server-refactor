package clofi.runningplanet.planet.repository.jpa;

import clofi.runningplanet.planet.domain.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetJpaRepository extends JpaRepository<Planet, Long> {
}
