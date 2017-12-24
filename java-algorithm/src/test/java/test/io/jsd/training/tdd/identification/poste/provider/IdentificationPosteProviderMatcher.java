package test.io.jsd.training.tdd.identification.poste.provider;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import io.jsd.training.tdd.identification.poste.provider.IdentificationPosteProvider;

public class IdentificationPosteProviderMatcher extends TypeSafeDiagnosingMatcher<String> {
	public static Matcher<? super String> splitsAs(String machine, String domaine) {
		return new IdentificationPosteProviderMatcher(true, machine, domaine);
	}

	public static Matcher<? super String> isNotIdentifiable() {
		return new IdentificationPosteProviderMatcher(false, null, null);
	}

	private final boolean identifiable;
	private final String machine;
	private final String domaine;

	public IdentificationPosteProviderMatcher(boolean identifiable, String machine, String domaine) {
		this.identifiable = identifiable;
		this.machine = machine;
		this.domaine = domaine;
	}

	@Override
	public void describeTo(Description description) {
		if (identifiable) {
			description.appendText("machine should be ").appendValue(machine);
			description.appendText(" ; domain should be ").appendValue(domaine);
		} else {
			description.appendText("not identifiable");
		}
	}

	@Override
	protected boolean matchesSafely(String codePoste, Description mismatchDescription) {
		IdentificationPosteProvider provider = new IdentificationPosteProvider(codePoste);
		if (!identifiable) {
			assertThat(provider.isIdentifiable(), equalTo(Boolean.FALSE));
			return true;
		}
		if (!machine.equals(provider.getComputerName())) {
			mismatchDescription.appendText("machine was ").appendValue(provider.getComputerName());
			return false;
		}
		if (!domaine.equals(provider.getUserDomain())) {
			mismatchDescription.appendText("domaine was ").appendValue(provider.getUserDomain());
			return false;
		}
		return true;
	}
}