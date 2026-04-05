package a.i.r;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    @Deprecated
    public static int a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    public static boolean b(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }
}
