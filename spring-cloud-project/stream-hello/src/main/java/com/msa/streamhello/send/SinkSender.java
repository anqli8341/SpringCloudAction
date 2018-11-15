package com.msa.streamhello.send;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

/**
 * @author anquan li
 */
public interface SinkSender {

  @Output(Sink.INPUT)
  MessageChannel output();
}