package com.example;

import org.junit.Test;
import org.mutabilitydetector.unittesting.AllowedReason;

import java.util.Optional;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

public class ImmutableClassTest {
    @Test
    public void this_works_now() throws Exception {
        //This works if I note that Optional is immutable.
        //It seems odd that the detector still checks the generic types of the
        //optional classes (which is nice!). Uncommenting line 16 in the production class causes this to fail
        assertInstancesOf(ImmutableClass.class, areImmutable(), AllowedReason.provided(Optional.class, ImmutableClass.Bar.class).areAlsoImmutable());
    }

    @Test
    public void how_I_think_it_should_work() throws Exception {
        //How I think it should work: I shouldn't need to mention Optional in the test.
        //Ideally the detector would treat Optional classes by analyzing their generic types without a special mention.
        assertInstancesOf(ImmutableClass.class, areImmutable(), AllowedReason.provided(ImmutableClass.Bar.class).areAlsoImmutable());
    }
}
