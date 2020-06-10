package edu.miu.cs.swe.myjunittestdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayFlattenerTest.class, ArrayReversorTest.class, Question1.class, Question2.class })
public class AllLabTests {

}
