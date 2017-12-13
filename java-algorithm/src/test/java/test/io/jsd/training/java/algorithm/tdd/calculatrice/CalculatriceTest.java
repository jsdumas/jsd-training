package test.io.jsd.training.java.algorithm.tdd.calculatrice;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;
import org.junit.Test;

import io.jsd.training.java.algorithm.tdd.calculatrice.Calculatrice;

/** Test de {@link Calculatrice} */
public class CalculatriceTest {
	private static class TotalMatcher extends TypeSafeDiagnosingMatcher<Calculatrice> {
		private final int expected;

		public TotalMatcher(int expected) {
			this.expected = expected;
		}

		@Override
		public void describeTo(Description description) {
			description.appendText("un total de ").appendValue(expected);
		}

		@Override
		protected boolean matchesSafely(Calculatrice item, Description mismatchDescription) {
			if (item.getTotal() == expected) {
				return true;
			}
			mismatchDescription.appendText("le total �tait ").appendValue(item.getTotal());
			return false;
		}
	}

	private static TotalMatcher total(int expected) {
		return new TotalMatcher(expected);
	}

	// Toujours partir de l'appelant (du besoin) pour ensuite impl�menter le fonctionnel.
	// Ctrl+1 : outil pour choisir l'impl�mentation.
	@Test
	public void unPlusDeuxEqualsTrois() {
		assertThat(Calculatrice.initCalcul(1).add(2), total(3));
	}

	@Test
	public void unPlusDouzeEqualsTreize() {
		assertThat(Calculatrice.initCalcul(1).add(12), total(13));
	}

}
