package ru.rgups.geolab.core.model;

/**
 * Created by Dmitry on 30.05.2015.
 */
public interface Channel {

    float[][] getData();

    Trace getTrace(int traceNum);
}
