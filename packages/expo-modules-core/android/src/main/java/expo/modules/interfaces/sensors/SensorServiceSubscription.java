package expo.modules.interfaces.sensors;

public interface SensorServiceSubscription {
  void start();
  boolean isEnabled();
  Long getUpdateInterval();
  void setUpdateInterval(long updateInterval);
  void stop();
  void release();
}
