package io.vertx.test.lang.js;

import org.junit.Test;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class DeployTest extends JSTestBase {
  @Override
  protected String getTestFile() {
    return "js_verticle_test.js";
  }

  @Test
  public void testStopCalled() throws Exception {
    runTest();
  }

  @Test
  public void testFailureInStop() throws Exception {
    runTest();
  }

  @Test
  public void testStoppedOKIfNoVertxStop() throws Exception {
    runTest();
  }

}
