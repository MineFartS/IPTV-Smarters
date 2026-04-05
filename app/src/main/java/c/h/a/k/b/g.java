package c.h.a.k.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f17462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f17463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f17464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f17465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.a f17466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f17467h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f17468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f17469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f17470c;
    }

    public g(Context context, List<String> list, String str) {
        this.f17463d = null;
        this.f17463d = list;
        this.f17462c = list;
        this.f17465f = context;
        this.f17464e = LayoutInflater.from(context);
        this.f17466g = new c.h.a.i.q.a(context);
        this.f17461b = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f17463d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return this.f17463d.get(i2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:9:0x0055, B:11:0x0073, B:12:0x0077, B:35:0x00f6, B:37:0x00fc, B:39:0x0106, B:40:0x010c, B:41:0x0110, B:42:0x0119, B:13:0x007c, B:15:0x0082, B:17:0x0092, B:19:0x00a2, B:22:0x00b3, B:23:0x00b8, B:24:0x00bc, B:25:0x00c0, B:27:0x00d0, B:30:0x00e1, B:31:0x00e6, B:32:0x00eb, B:34:0x00f1), top: B:47:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: Exception -> 0x0129, TRY_LEAVE, TryCatch #0 {Exception -> 0x0129, blocks: (B:9:0x0055, B:11:0x0073, B:12:0x0077, B:35:0x00f6, B:37:0x00fc, B:39:0x0106, B:40:0x010c, B:41:0x0110, B:42:0x0119, B:13:0x007c, B:15:0x0082, B:17:0x0092, B:19:0x00a2, B:22:0x00b3, B:23:0x00b8, B:24:0x00bc, B:25:0x00c0, B:27:0x00d0, B:30:0x00e1, B:31:0x00e6, B:32:0x00eb, B:34:0x00f1), top: B:47:0x0055 }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
