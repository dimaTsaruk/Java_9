package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AskarLecture {
    public static void main(String[] args) {
        // This method adds new SSN .
        // If ssn already exist, print warning message

        Set<String> ssn = new HashSet<>(Arrays.asList("111-222-000", "333-555-888"));
        //  addSSN(ssn, "111-222-000");
        addSSN(ssn, "111-222-001");

    }

    public static void addSSN(Set<String> ssnSet, String ssn) {
        if (!ssnSet.contains(ssn)) {
            ssnSet.add(ssn);
            System.out.println("new record added");
        } else System.out.println("SSN already exist!");
    }
}
