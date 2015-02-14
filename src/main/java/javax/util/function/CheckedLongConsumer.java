/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

import javaslang.CheckedFunction1;

import java.util.Objects;

/**
 * Checked version of java.util.function.LongConsumer.
 */
@FunctionalInterface
public interface CheckedLongConsumer extends CheckedFunction1<Long, Void> {

    static final long serialVersionUID = 1L;

    void accept(long value) throws Throwable;

    @Override
    default Void apply(Long value) throws Throwable {
        accept(value);
        return null;
    }
}