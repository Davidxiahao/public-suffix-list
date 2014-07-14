package de.malkusch.whoisServerList.publicSuffixList.index;

import java.util.List;

import net.jcip.annotations.ThreadSafe;
import de.malkusch.whoisServerList.publicSuffixList.rule.Rule;

/**
 * The index factory.
 *
 * @author markus@malkusch.de
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 * @since 2.0.0
 */
@ThreadSafe
public interface IndexFactory {

    /**
     * Builds an index from a rule list.
     *
     * @param rules  the rule list, not null
     * @return the index, not null
     */
    Index build(List<Rule> rules);

}
