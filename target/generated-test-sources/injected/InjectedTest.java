import java.util.*;
/**
 * Entry point to auto-generated tests (generated by maven-hpi-plugin).
 * If this fails to compile, you are probably using Hudson &lt; 1.327. If so, disable
 * this code generation by configuring maven-hpi-plugin to &lt;disabledTestInjection&gt;true&lt;/disabledTestInjection&gt;.
 */
public class InjectedTest extends junit.framework.TestCase {
  public static junit.framework.Test suite() throws Exception {
    System.out.println("Running tests for "+"io.jenkins.plugins:wechat-webhook-plugin:1.0-SNAPSHOT");
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("basedir","D:\\workspace\\wechat-webhook-plugin");
    parameters.put("artifactId","wechat-webhook-plugin");
    parameters.put("packaging","hpi");
    parameters.put("outputDirectory","D:\\workspace\\wechat-webhook-plugin\\target\\classes");
    parameters.put("testOutputDirectory","D:\\workspace\\wechat-webhook-plugin\\target\\test-classes");
    parameters.put("requirePI","true");
    return org.jvnet.hudson.test.PluginAutomaticTestBuilder.build(parameters);
  }
}
