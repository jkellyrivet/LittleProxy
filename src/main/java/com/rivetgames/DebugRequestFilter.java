package com.rivetgames;

import org.jboss.netty.handler.codec.http.HttpRequest;
import org.littleshoot.proxy.HttpRequestFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: jkelly
 * Date: 8/9/11
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class DebugRequestFilter implements HttpRequestFilter {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public void filter(HttpRequest httpRequest) {
        log.debug(httpRequest.getMethod().getName() + " " + httpRequest.getUri());
       
        if (httpRequest.containsHeader("Cookie")) {
            log.debug("Cookie:" + httpRequest.getHeader("Cookie"));
        }

    }
}
