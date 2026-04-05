package c.f.a.d.y;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f15349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15352e;

    public a(Dialog dialog, Rect rect) {
        this.f15349b = dialog;
        this.f15350c = rect.left;
        this.f15351d = rect.top;
        this.f15352e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f15350c + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f15351d + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.f15352e;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f15349b.onTouchEvent(motionEventObtain);
    }
}
