package clofi.runningplanet.planet.repository.jpa;

import clofi.runningplanet.member.domain.Member;
import clofi.runningplanet.planet.domain.MemberPlanet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberPlanetJpaRepository extends JpaRepository<MemberPlanet, Long> {
	List<MemberPlanet> findByMemberId(Member member);
}
