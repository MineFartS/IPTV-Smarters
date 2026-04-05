package c.f.a.b.k3.f0;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import c.f.a.b.k3.f0.g;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f9461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f9463f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f9459b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f9460c = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile float f9464g = 3.1415927f;

    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f2) {
        this.f9461d = aVar;
        this.f9462e = f2;
        this.f9463f = new GestureDetector(context, this);
    }

    @Override // c.f.a.b.k3.f0.g.a
    public void a(float[] fArr, float f2) {
        this.f9464g = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f9459b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = (motionEvent2.getX() - this.f9459b.x) / this.f9462e;
        float y = motionEvent2.getY();
        PointF pointF = this.f9459b;
        float f4 = (y - pointF.y) / this.f9462e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d2 = this.f9464g;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        PointF pointF2 = this.f9460c;
        pointF2.x -= (fCos * x) - (fSin * f4);
        float f5 = pointF2.y + (fSin * x) + (fCos * f4);
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        this.f9461d.b(this.f9460c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f9461d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9463f.onTouchEvent(motionEvent);
    }
}
