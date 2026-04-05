package c.h.a.j;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.LoginCallback;
import java.io.IOException;
import java.util.ArrayList;
import o.l;
import o.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.h.a.k.f.f f17304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f17306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f17307d;

    public class a implements o.d<LoginCallback> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17309b;

        public a(String str, String str2) {
            this.f17308a = str;
            this.f17309b = str2;
        }

        @Override // o.d
        public void a(o.b<LoginCallback> bVar, Throwable th) {
            c.this.f17304a.X(c.this.f17305b.getResources().getString(R.string.network_error_connection));
        }

        @Override // o.d
        public void b(o.b<LoginCallback> bVar, l<LoginCallback> lVar) {
            String string;
            c.h.a.k.f.f fVar;
            if (lVar.d()) {
                c.this.f17304a.p(lVar.a(), "validateLogin");
                return;
            }
            if (lVar.b() == 404) {
                fVar = c.this.f17304a;
                string = c.this.f17305b.getResources().getString(R.string.invalid_server_url);
            } else if (lVar.b() == 301 || lVar.b() == 302) {
                String strN = lVar.e().n(HttpHeader.LOCATION);
                string = "ERROR Code 301 || 302: Network error occured! Please try again";
                if (strN != null) {
                    String[] strArrSplit = strN.split("/player_api.php");
                    c cVar = c.this;
                    cVar.f17307d = cVar.f17305b.getSharedPreferences("loginPrefsserverurl", 0);
                    c cVar2 = c.this;
                    cVar2.f17306c = cVar2.f17307d.edit();
                    c.this.f17306c.putString(c.h.a.h.n.a.t, strArrSplit[0]);
                    c.this.f17306c.apply();
                    try {
                        c.this.g(this.f17308a, this.f17309b);
                        return;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                fVar = c.this.f17304a;
            } else {
                if (lVar.a() != null) {
                    return;
                }
                fVar = c.this.f17304a;
                string = "No Response from server";
            }
            fVar.X(string);
        }
    }

    public class b implements o.d<LoginCallback> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f17311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17313c;

        public b(ArrayList arrayList, String str, String str2) {
            this.f17311a = arrayList;
            this.f17312b = str;
            this.f17313c = str2;
        }

        @Override // o.d
        public void a(@NotNull o.b<LoginCallback> bVar, @NotNull Throwable th) {
            c.this.f17304a.O(this.f17311a, c.this.f17305b.getResources().getString(R.string.network_error_connection));
        }

        @Override // o.d
        public void b(@NotNull o.b<LoginCallback> bVar, @NotNull l<LoginCallback> lVar) {
            c.h.a.k.f.f fVar;
            ArrayList<String> arrayList;
            String string;
            if (lVar.d()) {
                c.this.f17304a.D(lVar.a(), "validateLogin", this.f17311a);
                return;
            }
            if (lVar.b() == 404) {
                fVar = c.this.f17304a;
                arrayList = this.f17311a;
                string = c.this.f17305b.getResources().getString(R.string.invalid_server_url);
            } else {
                if (lVar.b() == 301 || lVar.b() == 302) {
                    String strN = lVar.e().n(HttpHeader.LOCATION);
                    if (strN != null) {
                        String[] strArrSplit = strN.split("/player_api.php");
                        c cVar = c.this;
                        cVar.f17307d = cVar.f17305b.getSharedPreferences("loginPrefsserverurl", 0);
                        c cVar2 = c.this;
                        cVar2.f17306c = cVar2.f17307d.edit();
                        c.this.f17306c.putString(c.h.a.h.n.a.t, strArrSplit[0]);
                        c.this.f17306c.apply();
                        try {
                            c.this.h(this.f17312b, this.f17313c, this.f17311a);
                            return;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    c.this.f17304a.O(this.f17311a, "ERROR Code 301 || 302: Network error occured! Please try again");
                    return;
                }
                if (lVar.a() != null) {
                    return;
                }
                fVar = c.this.f17304a;
                arrayList = this.f17311a;
                string = "No Response from server";
            }
            fVar.O(arrayList, string);
        }
    }

    public c(c.h.a.k.f.f fVar, Context context) {
        this.f17304a = fVar;
        this.f17305b = context;
    }

    public void g(String str, String str2) {
        Context context;
        m mVarZ = c.h.a.h.n.e.Z(this.f17305b);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).n(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2).x(new a(str, str2));
        } else {
            if (mVarZ != null || (context = this.f17305b) == null) {
                return;
            }
            this.f17304a.I(context.getResources().getString(R.string.url_not_working));
        }
    }

    public void h(String str, String str2, ArrayList<String> arrayList) {
        Context context;
        m mVarZ = c.h.a.h.n.e.Z(this.f17305b);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).n(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2).x(new b(arrayList, str, str2));
        } else {
            if (mVarZ != null || (context = this.f17305b) == null) {
                return;
            }
            this.f17304a.t(arrayList, context.getResources().getString(R.string.url_not_working));
        }
    }
}
