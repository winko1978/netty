/*
 * Copyright 2011 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.testsuite.transport.sctp;

import io.netty.channel.ChannelFactory;
import io.netty.channel.sctp.SctpClientSocketChannelFactory;
import io.netty.channel.sctp.SctpServerSocketChannelFactory;
import io.netty.testsuite.transport.AbstractSocketStringEchoTest;

import java.util.concurrent.Executor;

public class SctpStringEchoTest extends AbstractSocketStringEchoTest {
    @Override
    protected ChannelFactory newServerSocketChannelFactory(Executor executor) {
        return new SctpServerSocketChannelFactory(executor, executor);
    }

    @Override
    protected ChannelFactory newClientSocketChannelFactory(Executor executor) {
        return new SctpClientSocketChannelFactory(executor, executor);
    }
}
