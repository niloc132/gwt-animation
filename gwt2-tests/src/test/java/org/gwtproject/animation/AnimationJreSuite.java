/*
 * Copyright © 2019 The GWT Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.animation;

import junit.framework.Test;
import junit.framework.TestSuite;

/** Tests of the animation package. */
public class AnimationJreSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("No browser tests for org.gwtproject.animation");

    suite.addTestSuite(AnimationSchedulerJreTest.class);

    return suite;
  }
}
