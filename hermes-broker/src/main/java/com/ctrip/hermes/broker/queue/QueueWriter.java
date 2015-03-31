package com.ctrip.hermes.broker.queue;

import com.ctrip.hermes.core.transport.command.SendMessageCommand.MessageRawDataBatch;
import com.ctrip.hermes.core.transport.command.SendMessageCommand.Tpp;

public interface QueueWriter {

	void write(Tpp tpp, MessageRawDataBatch data) throws StorageException;

}
