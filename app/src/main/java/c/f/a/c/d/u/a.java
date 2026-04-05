package c.f.a.c.d.u;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11777a = new c.f.a.c.d.v.b("CastButtonFactory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<WeakReference<MenuItem>> f11778b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<WeakReference<MediaRouteButton>> f11779c = new ArrayList();

    public static MenuItem a(Context context, Menu menu, int i2) {
        return c(context, menu, i2, null);
    }

    public static void b(Context context, MediaRouteButton mediaRouteButton) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (mediaRouteButton != null) {
            e(context, mediaRouteButton, null);
            f11779c.add(new WeakReference<>(mediaRouteButton));
        }
    }

    public static MenuItem c(Context context, Menu menu, int i2, a.t.k.g gVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.f.q.o.i(menu);
        MenuItem menuItemFindItem = menu.findItem(i2);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i2)));
        }
        try {
            d(context, menuItemFindItem, null);
            f11778b.add(new WeakReference<>(menuItemFindItem));
            return menuItemFindItem;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i2)));
        }
    }

    public static void d(Context context, MenuItem menuItem, a.t.k.g gVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) a.i.r.j.a(menuItem);
        if (mediaRouteActionProvider == null) {
            throw new IllegalArgumentException();
        }
        b bVarH = b.h(context);
        if (bVarH != null) {
            mediaRouteActionProvider.o(bVarH.b());
        }
    }

    public static void e(Context context, MediaRouteButton mediaRouteButton, a.t.k.g gVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        b bVarH = b.h(context);
        if (bVarH != null) {
            mediaRouteButton.setRouteSelector(bVarH.b());
        }
    }
}
