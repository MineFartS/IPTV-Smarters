package com.amazonaws.mobile.auth.core.signin.ui;

import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public class DisplayUtils {
    private static int dpMultiplier;
    private static final DisplayMetrics metrics;

    static {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        metrics = displayMetrics;
        dpMultiplier = displayMetrics.densityDpi / 160;
    }

    public static int dp(int i2) {
        return i2 * dpMultiplier;
    }

    public static ShapeDrawable getRoundedRectangleBackground(int i2, int i3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getRoundedRectangleShape(i2));
        shapeDrawable.getPaint().setColor(i3);
        return shapeDrawable;
    }

    public static Shape getRoundedRectangleShape(int i2) {
        float f2 = i2;
        return new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null);
    }
}
