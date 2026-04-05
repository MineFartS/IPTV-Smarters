package a.t.l;

import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public interface a {
        void a(Object obj);

        void b(int i2, Object obj);

        void d(Object obj);

        void e(int i2, Object obj);

        void g(Object obj, Object obj2);

        void h(Object obj, Object obj2, int i2);

        void i(Object obj);

        void k(Object obj);
    }

    public static class b<T extends a> extends MediaRouter.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f3420a;

        public b(T t) {
            this.f3420a = t;
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f3420a.i(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f3420a.a(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i2) {
            this.f3420a.h(routeInfo, routeGroup, i2);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f3420a.d(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, int i2, MediaRouter.RouteInfo routeInfo) {
            this.f3420a.e(i2, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.f3420a.g(routeInfo, routeGroup);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, int i2, MediaRouter.RouteInfo routeInfo) {
            this.f3420a.b(i2, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f3420a.k(routeInfo);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f3421a;

        public c() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 16 || i2 > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.f3421a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }

        public Object a(Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            Method method = this.f3421a;
            if (method != null) {
                try {
                    return method.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    public static final class d {
        public static CharSequence a(Object obj, Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        public static int b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        public static int c(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        public static int d(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        public static Object e(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }

        public static int f(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        public static int g(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        public static int h(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        public static void i(Object obj, int i2) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i2);
        }

        public static void j(Object obj, int i2) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i2);
        }

        public static void k(Object obj, Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f3422a;

        public e() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 16 || i2 > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.f3422a = MediaRouter.class.getMethod("selectRouteInt", Integer.TYPE, MediaRouter.RouteInfo.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public void a(Object obj, int i2, Object obj2) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj2;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                Method method = this.f3422a;
                if (method != null) {
                    try {
                        method.invoke(mediaRouter, Integer.valueOf(i2), routeInfo);
                        return;
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", e2);
                    }
                } else {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            mediaRouter.selectRoute(i2, routeInfo);
        }
    }

    public static final class f {
        public static void a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        public static void b(Object obj, int i2) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i2);
        }

        public static void c(Object obj, int i2) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i2);
        }

        public static void d(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setRemoteControlClient((RemoteControlClient) obj2);
        }

        public static void e(Object obj, int i2) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i2);
        }

        public static void f(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }

        public static void g(Object obj, int i2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i2);
        }

        public static void h(Object obj, int i2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i2);
        }
    }

    public interface g {
        void c(Object obj, int i2);

        void j(Object obj, int i2);
    }

    public static class h<T extends g> extends MediaRouter.VolumeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f3423a;

        public h(T t) {
            this.f3423a = t;
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i2) {
            this.f3423a.j(routeInfo, i2);
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i2) {
            this.f3423a.c(routeInfo, i2);
        }
    }

    public static void a(Object obj, int i2, Object obj2) {
        ((MediaRouter) obj).addCallback(i2, (MediaRouter.Callback) obj2);
    }

    public static void b(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static Object c(a aVar) {
        return new b(aVar);
    }

    public static Object d(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    public static Object e(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    public static Object f(g gVar) {
        return new h(gVar);
    }

    public static Object g(Context context) {
        return context.getSystemService("media_router");
    }

    public static List h(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i2 = 0; i2 < routeCount; i2++) {
            arrayList.add(mediaRouter.getRouteAt(i2));
        }
        return arrayList;
    }

    public static Object i(Object obj, int i2) {
        return ((MediaRouter) obj).getSelectedRoute(i2);
    }

    public static void j(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    public static void k(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static void l(Object obj, int i2, Object obj2) {
        ((MediaRouter) obj).selectRoute(i2, (MediaRouter.RouteInfo) obj2);
    }
}
