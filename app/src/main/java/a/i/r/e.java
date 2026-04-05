package a.i.r;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1992a;

    public interface a {
        boolean onTouchEvent(MotionEvent motionEvent);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f1993a = ViewConfiguration.getLongPressTimeout();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f1994b = ViewConfiguration.getTapTimeout();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f1995c = ViewConfiguration.getDoubleTapTimeout();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Handler f2000h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final GestureDetector.OnGestureListener f2001i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public GestureDetector.OnDoubleTapListener f2002j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2003k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2004l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f2005m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f2006n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f2007o;
        public MotionEvent p;
        public MotionEvent q;
        public boolean r;
        public float s;
        public float t;
        public float u;
        public float v;
        public boolean w;
        public VelocityTracker x;

        public class a extends Handler {
            public a() {
            }

            public a(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    b bVar = b.this;
                    bVar.f2001i.onShowPress(bVar.p);
                    return;
                }
                if (i2 == 2) {
                    b.this.c();
                    return;
                }
                if (i2 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                b bVar2 = b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f2002j;
                if (onDoubleTapListener != null) {
                    if (bVar2.f2003k) {
                        bVar2.f2004l = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.p);
                    }
                }
            }
        }

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f2000h = new a(handler);
            } else {
                this.f2000h = new a();
            }
            this.f2001i = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                f((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            d(context);
        }

        public final void a() {
            this.f2000h.removeMessages(1);
            this.f2000h.removeMessages(2);
            this.f2000h.removeMessages(3);
            this.x.recycle();
            this.x = null;
            this.r = false;
            this.f2003k = false;
            this.f2006n = false;
            this.f2007o = false;
            this.f2004l = false;
            if (this.f2005m) {
                this.f2005m = false;
            }
        }

        public final void b() {
            this.f2000h.removeMessages(1);
            this.f2000h.removeMessages(2);
            this.f2000h.removeMessages(3);
            this.r = false;
            this.f2006n = false;
            this.f2007o = false;
            this.f2004l = false;
            if (this.f2005m) {
                this.f2005m = false;
            }
        }

        public void c() {
            this.f2000h.removeMessages(3);
            this.f2004l = false;
            this.f2005m = true;
            this.f2001i.onLongPress(this.p);
        }

        public final void d(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f2001i == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.w = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f1998f = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1999g = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1996d = scaledTouchSlop * scaledTouchSlop;
            this.f1997e = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        public final boolean e(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f2007o || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f1995c) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f1997e;
        }

        public void f(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2002j = onDoubleTapListener;
        }

        @Override // a.i.r.e.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.x == null) {
                this.x = VelocityTracker.obtain();
            }
            this.x.addMovement(motionEvent);
            int i2 = action & 255;
            boolean z = i2 == 6;
            int actionIndex = z ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float x = 0.0f;
            float y = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x += motionEvent.getX(i3);
                    y += motionEvent.getY(i3);
                }
            }
            float f2 = z ? pointerCount - 1 : pointerCount;
            float f3 = x / f2;
            float f4 = y / f2;
            if (i2 == 0) {
                if (this.f2002j == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f2000h.hasMessages(3);
                    if (zHasMessages) {
                        this.f2000h.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.p;
                    if (motionEvent3 == null || (motionEvent2 = this.q) == null || !zHasMessages || !e(motionEvent3, motionEvent2, motionEvent)) {
                        this.f2000h.sendEmptyMessageDelayed(3, f1995c);
                        zOnDoubleTap = false;
                    } else {
                        this.r = true;
                        zOnDoubleTap = this.f2002j.onDoubleTap(this.p) | false | this.f2002j.onDoubleTapEvent(motionEvent);
                    }
                }
                this.s = f3;
                this.u = f3;
                this.t = f4;
                this.v = f4;
                MotionEvent motionEvent4 = this.p;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.p = MotionEvent.obtain(motionEvent);
                this.f2006n = true;
                this.f2007o = true;
                this.f2003k = true;
                this.f2005m = false;
                this.f2004l = false;
                if (this.w) {
                    this.f2000h.removeMessages(2);
                    this.f2000h.sendEmptyMessageAtTime(2, this.p.getDownTime() + ((long) f1994b) + ((long) f1993a));
                }
                this.f2000h.sendEmptyMessageAtTime(1, this.p.getDownTime() + ((long) f1994b));
                return zOnDoubleTap | this.f2001i.onDown(motionEvent);
            }
            if (i2 == 1) {
                this.f2003k = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.r) {
                    zOnFling = this.f2002j.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.f2005m) {
                        this.f2000h.removeMessages(3);
                        this.f2005m = false;
                    } else if (this.f2006n) {
                        boolean zOnSingleTapUp = this.f2001i.onSingleTapUp(motionEvent);
                        if (this.f2004l && (onDoubleTapListener = this.f2002j) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.x;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f1999g);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f1998f || Math.abs(xVelocity) > this.f1998f) {
                            zOnFling = this.f2001i.onFling(this.p, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.q;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.q = motionEventObtain;
                VelocityTracker velocityTracker2 = this.x;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.x = null;
                }
                this.r = false;
                this.f2004l = false;
                this.f2000h.removeMessages(1);
                this.f2000h.removeMessages(2);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        a();
                        return false;
                    }
                    if (i2 == 5) {
                        this.s = f3;
                        this.u = f3;
                        this.t = f4;
                        this.v = f4;
                        b();
                        return false;
                    }
                    if (i2 != 6) {
                        return false;
                    }
                    this.s = f3;
                    this.u = f3;
                    this.t = f4;
                    this.v = f4;
                    this.x.computeCurrentVelocity(1000, this.f1999g);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.x.getXVelocity(pointerId2);
                    float yVelocity2 = this.x.getYVelocity(pointerId2);
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        if (i4 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i4);
                            if ((this.x.getXVelocity(pointerId3) * xVelocity2) + (this.x.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.x.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                if (this.f2005m) {
                    return false;
                }
                float f5 = this.s - f3;
                float f6 = this.t - f4;
                if (this.r) {
                    return false | this.f2002j.onDoubleTapEvent(motionEvent);
                }
                if (!this.f2006n) {
                    if (Math.abs(f5) < 1.0f && Math.abs(f6) < 1.0f) {
                        return false;
                    }
                    boolean zOnScroll = this.f2001i.onScroll(this.p, motionEvent, f5, f6);
                    this.s = f3;
                    this.t = f4;
                    return zOnScroll;
                }
                int i5 = (int) (f3 - this.u);
                int i6 = (int) (f4 - this.v);
                int i7 = (i5 * i5) + (i6 * i6);
                if (i7 > this.f1996d) {
                    zOnFling = this.f2001i.onScroll(this.p, motionEvent, f5, f6);
                    this.s = f3;
                    this.t = f4;
                    this.f2006n = false;
                    this.f2000h.removeMessages(3);
                    this.f2000h.removeMessages(1);
                    this.f2000h.removeMessages(2);
                } else {
                    zOnFling = false;
                }
                if (i7 > this.f1996d) {
                    this.f2007o = false;
                }
            }
            return zOnFling;
        }
    }

    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureDetector f2009a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f2009a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // a.i.r.e.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.f2009a.onTouchEvent(motionEvent);
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f1992a = Build.VERSION.SDK_INT > 17 ? new c(context, onGestureListener, handler) : new b(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f1992a.onTouchEvent(motionEvent);
    }
}
