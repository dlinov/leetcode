package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1452PeopleWhoseListOfFavoriteCompaniesIsNotASubsetOfAnotherList {
    class Solution {
        public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
            List<Set<String>> fsets = new ArrayList<>(favoriteCompanies.size());
            for (List<String> companies : favoriteCompanies) {
                fsets.add(new HashSet<String>(companies));
            }
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < fsets.size(); ++i) {
                boolean isSubset = false;
                Set<String> s1 = fsets.get(i);
                for (int j = 0; j < fsets.size(); ++j) {
                    if (i != j) {
                        Set<String> s2 = fsets.get(j);
                        if (s2.containsAll(s1)) {
                            isSubset = true;
                            break;
                        }
                    }
                }
                if (!isSubset) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}