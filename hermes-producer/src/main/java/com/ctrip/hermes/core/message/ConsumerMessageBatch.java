package com.ctrip.hermes.core.message;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.List;

import com.ctrip.hermes.core.transport.TransferCallback;

/**
 * @author Leo Liang(jhliang@ctrip.com)
 *
 */
public class ConsumerMessageBatch {
	private String m_topic;

	private List<Long> m_msgSeqs = new ArrayList<>();

	private TransferCallback m_transferCallback;

	private ByteBuf data;

	public ConsumerMessageBatch() {
	}

	public ByteBuf getData() {
		return data;
	}

	public void setData(ByteBuf data) {
		this.data = data;
	}

	public String getTopic() {
		return m_topic;
	}

	public void setTopic(String topic) {
		m_topic = topic;
	}

	public List<Long> getMsgSeqs() {
		return m_msgSeqs;
	}

	public void addMsgSeq(long msgSeq) {
		m_msgSeqs.add(msgSeq);
	}

	public void addMsgSeqs(List<Long> msgSeqs) {
		m_msgSeqs.addAll(msgSeqs);
	}

	public TransferCallback getTransferCallback() {
		return m_transferCallback;
	}

	public void setTransferCallback(TransferCallback transferCallback) {
		m_transferCallback = transferCallback;
	}

}
