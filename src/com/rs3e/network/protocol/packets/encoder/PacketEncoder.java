package com.rs3e.network.protocol.packets.encoder;

import com.rs3e.network.protocol.packets.PacketBuilder;
/**=
 * RS3Emulation
 * ActionSender.java
 * Mar 12, 2014
 * @author Belthazar
 */
public interface PacketEncoder<T extends Object> {

	/**
	 * Called when a packet is requested to be dispatched, before dispatching a
	 * blank packet the server must build the byte structure.
	 * 
	 * @param node
	 *            The node reference.
	 * @return The packet that was recently built.
	 */
	PacketBuilder buildPacket(T node);
}