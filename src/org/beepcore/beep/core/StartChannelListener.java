/*
 * StartChannelListener.java  $Revision: 1.1 $ $Date: 2001/04/02 08:56:06 $
 *
 * Copyright (c) 2001 Invisible Worlds, Inc.  All rights reserved.
 *
 * The contents of this file are subject to the Blocks Public License (the
 * "License"); You may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.invisible.net/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.  See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 */
package org.beepcore.beep.core;


/**
 * Interface StartChannelListener
 *
 * StartChannelListener is an interface specifying the methods that must
 * be implemented by any class that implements logic managing the start and
 * close events on a channel, as well as any other events that may eventually
 * be associated with Channels.
 *
 * @version $Revision: 1.1 $, $Date: 2001/04/02 08:56:06 $
 * @author Eric Dixon
 * @author Huston Franklin
 * @author Jay Kint
 * @author Scott Pead
 */
public interface StartChannelListener {

    /**
     * Called when the underlying BEEP framework receives
     * a "start" element.
     *
     * @param channel A <code>Channel</code> object which represents a channel
     * in this <code>Session</code>.
     * @param data The content of the "profile" element selected for this
     * channel (may be <code>null</code>).
     * @param encoding specifies whether the content of the "profile" element
     * selected for this channel is represented as a base64-encoded string.
     * The <code>encoding</code> is only valid if <code>data</code> is not
     * <code>null</code>.
     *
     * @throws StartChannelException Throwing this exception will cause an
     * error to be returned to the BEEP peer requesting to start a channel.
     * The channel is then discarded.
     */
    public void startChannel(Channel channel, String encoding, String data)
        throws StartChannelException;

    /**
     * Called when the underlying BEEP framework receives
     * a "close" element.
     *
     *
     * @param channel <code>Channel</code> which received the close request.
     *
     * @throws CloseChannelException Throwing this exception will return an
     * error to the BEEP peer requesting the close.  The channel will remain
     * open.
     */
    public void closeChannel(Channel channel) throws CloseChannelException;
}