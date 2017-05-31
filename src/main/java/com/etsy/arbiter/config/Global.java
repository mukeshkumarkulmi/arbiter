package com.etsy.arbiter.config;

import java.util.List;
import java.util.Map;

public class Global {

    private Map<String, List<String>> globalArgs;
    private Map<String, String> properties;
    private int configurationPosition;

    public Map<String, List<String>> getGlobalArgs() {
        return globalArgs;
    }

    public void setGlobalArgs(Map<String, List<String>> globalArgs) {
        this.globalArgs = globalArgs;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public int getConfigurationPosition() {
        return configurationPosition;
    }

    public void setConfigurationPosition(int configurationPosition) {
        this.configurationPosition = configurationPosition;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + configurationPosition;
        result = prime * result + ((globalArgs == null) ? 0 : globalArgs.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Global other = (Global) obj;
        if (configurationPosition != other.configurationPosition) {
            return false;
        }
        if (globalArgs == null) {
            if (other.globalArgs != null) {
                return false;
            }
        } else if (!globalArgs.equals(other.globalArgs)) {
            return false;
        }
        if (properties == null) {
            if (other.properties != null) {
                return false;
            }
        } else if (!properties.equals(other.properties)) {
            return false;
        }
        return true;
    }

}
