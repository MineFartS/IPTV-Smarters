package c.h.a.j;

import android.content.Context;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import minefarts.iptvsmarters.model.callback.LiveStreamsEpgCallback;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.h.a.k.f.e f17340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17341b;

    public class a implements o.d<LiveStreamsEpgCallback> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f17345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f17346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f17347f;

        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f17342a = str;
            this.f17343b = str2;
            this.f17344c = str3;
            this.f17345d = str4;
            this.f17346e = str5;
            this.f17347f = str6;
        }

        @Override // o.d
        public void a(o.b<LiveStreamsEpgCallback> bVar, Throwable th) {
            h.this.f17340a.b();
            h.this.f17340a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<LiveStreamsEpgCallback> bVar, l<LiveStreamsEpgCallback> lVar) {
            h.this.f17340a.b();
            if (lVar.d()) {
                h.this.f17340a.g(lVar.a(), this.f17342a, this.f17343b, this.f17344c, this.f17345d, this.f17346e, this.f17347f);
            } else if (lVar.a() == null) {
                h.this.f17340a.c("Invalid Request");
            }
        }
    }

    public h(c.h.a.k.f.e eVar, Context context) {
        this.f17340a = eVar;
        this.f17341b = context;
    }

    public void b(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f17340a.a();
        m mVarZ = c.h.a.h.n.e.Z(this.f17341b);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).d(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_simple_data_table", i2).x(new a(str3, str4, str5, str6, str7, str8));
        }
    }
}
