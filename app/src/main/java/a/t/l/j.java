package a.t.l;

import a.t.l.i;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DisplayManager f3424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f3425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f3426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3427e;

        public a(Context context, Handler handler) {
            if (Build.VERSION.SDK_INT != 17) {
                throw new UnsupportedOperationException();
            }
            this.f3424b = (DisplayManager) context.getSystemService("display");
            this.f3425c = handler;
            try {
                this.f3426d = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }

        public void a(int i2) {
            if ((i2 & 2) == 0) {
                if (this.f3427e) {
                    this.f3427e = false;
                    this.f3425c.removeCallbacks(this);
                    return;
                }
                return;
            }
            if (this.f3427e) {
                return;
            }
            if (this.f3426d == null) {
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            } else {
                this.f3427e = true;
                this.f3425c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3427e) {
                try {
                    this.f3426d.invoke(this.f3424b, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e2);
                }
                this.f3425c.postDelayed(this, 15000L);
            }
        }
    }

    public interface b extends i.a {
        void f(Object obj);
    }

    public static class c<T extends b> extends i.b<T> {
        public c(T t) {
            super(t);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((b) this.f3420a).f(routeInfo);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f3428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3429b;

        public d() {
            if (Build.VERSION.SDK_INT != 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.f3429b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
                this.f3428a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
            }
        }

        public boolean a(Object obj) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            Method method = this.f3428a;
            if (method == null) {
                return false;
            }
            try {
                return ((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.f3429b;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    public static final class e {
        public static Display a(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e2) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e2);
                return null;
            }
        }

        public static boolean b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }
    }

    public static Object a(b bVar) {
        return new c(bVar);
    }
}
