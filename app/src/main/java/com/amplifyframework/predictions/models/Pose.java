package com.amplifyframework.predictions.models;

/* JADX INFO: loaded from: classes.dex */
public final class Pose {
    private final double pitch;
    private final double roll;
    private final double yaw;

    public Pose(double d2, double d3, double d4) {
        this.pitch = d2;
        this.roll = d3;
        this.yaw = d4;
    }

    public double getPitch() {
        return this.pitch;
    }

    public double getRoll() {
        return this.roll;
    }

    public double getYaw() {
        return this.yaw;
    }
}
