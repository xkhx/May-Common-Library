package cc.zoyn.core;

import cc.zoyn.core.serverping.ServerPing;
import cc.zoyn.core.serverping.ServerPingReply;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Zoyn
 * @since 2017-12-22
 */
public class ServerPingTest {

    @Test
    public void testServerPing() {
        ServerPing serverPing = new ServerPing("mc.hypixel.net");
        serverPing.pingServer();
        ServerPingReply reply = serverPing.getReply();
//        System.out.print(reply.getVersion().getName());
        Assert.assertTrue(reply.getVersion().getName().contains("1.12"));
//        Assert.assertEquals("Requires MC 1.8/1.9/1.10/1.11/1.12", reply.getVersion().getName());
    }

}