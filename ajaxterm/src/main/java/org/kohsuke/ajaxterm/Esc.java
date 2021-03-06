package org.kohsuke.ajaxterm;

import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 * Indicates an escape sequence handling method.
 *
 * @author Kohsuke Kawaguchi
 */
@Retention(RUNTIME)
@Target(METHOD)
@interface Esc {
    String[] value();
}
