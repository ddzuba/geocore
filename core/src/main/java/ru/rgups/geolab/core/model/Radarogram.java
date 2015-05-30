package ru.rgups.geolab.core.model;

import java.util.Map;

/**
 * Created by Dmitry on 30.05.2015.
 */
public interface Radarogram {

    String getName();

    int getChannelsNumber();

    int getW();

    int getH();

    Channel getChannel(int channelNumber);

    Trace getTrace(int channelNumber, int traceN);

    Object getProperty(String name);

    Map<String, Object> getProperties(String path);

}
