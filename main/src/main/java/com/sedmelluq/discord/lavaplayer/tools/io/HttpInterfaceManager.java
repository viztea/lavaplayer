package com.sedmelluq.discord.lavaplayer.tools.io;

import com.sedmelluq.discord.lavaplayer.tools.http.HttpContextFilter;
import java.io.Closeable;

/**
 * A thread-safe manager for HTTP interfaces.
 */
public interface HttpInterfaceManager extends HttpConfigurable, Closeable {
  /**
   * @return An HTTP interface for use by the current thread.
   */
  HttpInterface getInterface();

  void setHttpContextFilter(HttpContextFilter modifier);
}
