/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processor.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class InvalidIPAddressExceptionTest {
    private String message;
    @BeforeEach
    void setUp() {
        message = UUID.randomUUID().toString();
    }

    private InvalidIPAddressException createObjectUnderTest() {
        return new InvalidIPAddressException(message);
    }

    @Test
    void getMessage_returns_message() {
        assertThat(createObjectUnderTest().getMessage(), equalTo(message));
    }

}