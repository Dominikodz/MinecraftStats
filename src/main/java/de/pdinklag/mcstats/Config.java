package de.pdinklag.mcstats;

import java.nio.file.Path;
import java.util.ArrayList;

/**
 * The MinecraftStats configuration.
 */
public class Config {
    private final ArrayList<DataSource> dataSources = new ArrayList<>();
    private Path databasePath;

    private int inactiveDays = 7;
    private int minPlaytime = 60;
    private int profileUpdateInterval = 3;

    private boolean excludeBanned = true;
    private boolean excludeOps = false;
    private final ArrayList<String> excludeUUIDs = new ArrayList<>();

    public Config() {
    }

    public ArrayList<DataSource> getDataSources() {
        return dataSources;
    }

    public Path getDatabasePath() {
        return databasePath;
    }

    public void setDatabasePath(Path databasePath) {
        this.databasePath = databasePath;
    }

    public int getInactiveDays() {
        return inactiveDays;
    }

    public void setInactiveDays(int inactiveDays) {
        this.inactiveDays = inactiveDays;
    }

    public int getMinPlaytime() {
        return minPlaytime;
    }

    public void setMinPlaytime(int minPlaytime) {
        this.minPlaytime = minPlaytime;
    }

    public boolean isExcludeBanned() {
        return excludeBanned;
    }

    public void setExcludeBanned(boolean excludeBanned) {
        this.excludeBanned = excludeBanned;
    }

    public boolean isExcludeOps() {
        return excludeOps;
    }

    public void setExcludeOps(boolean excludeOps) {
        this.excludeOps = excludeOps;
    }

    public ArrayList<String> getExcludeUUIDs() {
        return excludeUUIDs;
    }

    public int getProfileUpdateInterval() {
        return profileUpdateInterval;
    }

    public void setProfileUpdateInterval(int profileUpdateInterval) {
        this.profileUpdateInterval = profileUpdateInterval;
    }
}
