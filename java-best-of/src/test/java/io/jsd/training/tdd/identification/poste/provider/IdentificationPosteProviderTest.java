package io.jsd.training.tdd.identification.poste.provider;

import static io.jsd.training.tdd.identification.poste.provider.IdentificationPosteProviderMatcher.isNotIdentifiable;
import static io.jsd.training.tdd.identification.poste.provider.IdentificationPosteProviderMatcher.splitsAs;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/** Tests pour {@link IdentificationPosteProvider} */
public class IdentificationPosteProviderTest {
	@Test
	public void verifieUnPointSepareBienMachineEtDomaine() {
		assertThat("COMPUTER_NAME.USER_DOMAIN", splitsAs("COMPUTER_NAME", "USER_DOMAIN"));
	}

	@Test
	public void siDeuxPointsAlorsLeDomaineContientLePoint() {
		assertThat("COMPUTER_NAME.USER_DOMAIN.FR", splitsAs("COMPUTER_NAME", "USER_DOMAIN.FR"));
	}

	@Test
	public void siPlusDeDeuxPointsAlorsLeDomaineContientLesPointsAdditionnels() {
		assertThat("COMPUTER_NAME.USER.DOMAIN.FR", splitsAs("COMPUTER_NAME", "USER.DOMAIN.FR"));
	}

	@Test
	public void siSansPointAlorsPosteNonIdentifiable() {
		assertThat("COMPUTER_NAME_USERDOMAIN", isNotIdentifiable());
	}

	@Test
	public void siUnPointUniquementAlorsPosteNonIdentifiable() {
		assertThat(".", IdentificationPosteProviderMatcher.isNotIdentifiable());
	}
}
