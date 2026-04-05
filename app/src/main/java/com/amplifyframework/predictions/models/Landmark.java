package com.amplifyframework.predictions.models;

import android.graphics.PointF;
import com.amplifyframework.util.Immutable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Landmark {
    private final List<PointF> points;
    private final LandmarkType type;

    public Landmark(LandmarkType landmarkType, List<PointF> list) {
        landmarkType.getClass();
        this.type = landmarkType;
        list.getClass();
        this.points = list;
    }

    public List<PointF> getPoints() {
        return Immutable.of(this.points);
    }

    public LandmarkType getType() {
        return this.type;
    }
}
