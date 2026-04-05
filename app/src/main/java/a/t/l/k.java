package a.t.l;

import android.media.MediaRouter;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    public static final class a {
        public static CharSequence a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        public static boolean b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    public static final class b {
        public static void a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    public static void a(Object obj, int i2, Object obj2, int i3) {
        ((MediaRouter) obj).addCallback(i2, (MediaRouter.Callback) obj2, i3);
    }

    public static Object b(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}
