package ru.connect2me.util.hh.load.config;

import java.util.Properties;

/**
 * Инициализация 
 *
 * @author Зайнуллин Радик
 * @version 1.0
 * @since 2012.11.18
 */
public abstract class Module {
  protected static ClassLoader classLoader;
  protected static Properties props;// свойства из config.xml, props короче чем getProperties()
  public Module(Configuration config) {
    classLoader = Thread.currentThread().getContextClassLoader();
    props = config.getProperties();
  }
  public Properties getProperties() { return props; }
}