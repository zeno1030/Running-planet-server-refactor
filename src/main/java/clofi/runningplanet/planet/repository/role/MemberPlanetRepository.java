package clofi.runningplanet.planet.repository.role;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clofi.runningplanet.member.domain.Member;
import clofi.runningplanet.planet.domain.MemberPlanet;

public interface MemberPlanetRepository {
	List<MemberPlanet> findByMemberId(Member member);
}
