package a.t.k;

import a.t.k.b;
import a.t.l.g;
import a.w.a.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a extends a.b.k.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f3207d = (int) TimeUnit.SECONDS.toMillis(30);
    public e A;
    public MediaDescriptionCompat B;
    public d C;
    public Bitmap D;
    public Uri E;
    public boolean F;
    public Bitmap G;
    public int H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a.t.l.g f3208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f3209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.t.l.f f3210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g.C0076g f3211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<g.C0076g> f3212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f3213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f3217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f3218o;
    public g p;
    public h q;
    public int r;
    public ImageButton s;
    public Button t;
    public RelativeLayout u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public String y;
    public MediaControllerCompat z;

    /* JADX INFO: renamed from: a.t.k.a$a, reason: collision with other inner class name */
    public class HandlerC0068a extends Handler {
        public HandlerC0068a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            a.this.t((List) message.obj);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f3211h.w()) {
                a.this.f3208e.n(2);
            }
            a.this.dismiss();
        }
    }

    public class d extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f3222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f3223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3224c;

        public d() {
            MediaDescriptionCompat mediaDescriptionCompat = a.this.B;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (a.g(iconBitmap)) {
                Log.w("MediaRouteCastDialog", "Can't fetch the given art bitmap because it's already recycled.");
                iconBitmap = null;
            }
            this.f3222a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = a.this.B;
            this.f3223b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStreamE;
            Bitmap bitmap = this.f3222a;
            ?? r4 = 0;
            if (bitmap == null) {
                Uri uri = this.f3223b;
                try {
                    if (uri != null) {
                        try {
                            inputStreamE = e(uri);
                        } catch (IOException e2) {
                            e = e2;
                            inputStreamE = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r4 != 0) {
                                try {
                                    r4.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                        try {
                            if (inputStreamE == null) {
                                Log.w("MediaRouteCastDialog", "Unable to open: " + this.f3223b);
                                if (inputStreamE != null) {
                                    try {
                                        inputStreamE.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                return null;
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(inputStreamE, null, options);
                            if (options.outWidth == 0 || options.outHeight == 0) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException unused3) {
                                }
                                return null;
                            }
                            try {
                                inputStreamE.reset();
                            } catch (IOException unused4) {
                                inputStreamE.close();
                                inputStreamE = e(this.f3223b);
                                if (inputStreamE == null) {
                                    Log.w("MediaRouteCastDialog", "Unable to open: " + this.f3223b);
                                    if (inputStreamE != null) {
                                        try {
                                            inputStreamE.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    return null;
                                }
                            }
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / a.this.f(options.outWidth, options.outHeight)));
                            if (isCancelled()) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException unused6) {
                                }
                                return null;
                            }
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE, null, options);
                            try {
                                inputStreamE.close();
                            } catch (IOException unused7) {
                            }
                            bitmap = bitmapDecodeStream;
                        } catch (IOException e3) {
                            e = e3;
                            Log.w("MediaRouteCastDialog", "Unable to open: " + this.f3223b, e);
                            if (inputStreamE != null) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException unused8) {
                                }
                            }
                            bitmap = null;
                        }
                    } else {
                        bitmap = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r4 = uri;
                }
            }
            if (a.g(bitmap)) {
                Log.w("MediaRouteCastDialog", "Can't use recycled bitmap: " + bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                a.w.a.b bVarA = new b.C0087b(bitmap).c(1).a();
                this.f3224c = bVarA.f().isEmpty() ? 0 : bVarA.f().get(0).e();
            }
            return bitmap;
        }

        public Bitmap b() {
            return this.f3222a;
        }

        public Uri c() {
            return this.f3223b;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            a aVar = a.this;
            aVar.C = null;
            if (a.i.q.d.a(aVar.D, this.f3222a) && a.i.q.d.a(a.this.E, this.f3223b)) {
                return;
            }
            a aVar2 = a.this;
            aVar2.D = this.f3222a;
            aVar2.G = bitmap;
            aVar2.E = this.f3223b;
            aVar2.H = this.f3224c;
            aVar2.F = true;
            aVar2.p();
        }

        public final InputStream e(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                inputStreamOpenInputStream = a.this.f3213j.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                int i2 = a.f3207d;
                uRLConnectionOpenConnection.setConnectTimeout(i2);
                uRLConnectionOpenConnection.setReadTimeout(i2);
                inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            a.this.e();
        }
    }

    public final class e extends MediaControllerCompat.Callback {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            a.this.B = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            a.this.q();
            a.this.p();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            a aVar = a.this;
            MediaControllerCompat mediaControllerCompat = aVar.z;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(aVar.A);
                a.this.z = null;
            }
        }
    }

    public final class f extends g.a {
        public f() {
        }

        @Override // a.t.l.g.a
        public void d(a.t.l.g gVar, g.C0076g c0076g) {
            a.this.l();
        }

        @Override // a.t.l.g.a
        public void e(a.t.l.g gVar, g.C0076g c0076g) {
            a.this.l();
            a.this.p();
        }

        @Override // a.t.l.g.a
        public void g(a.t.l.g gVar, g.C0076g c0076g) {
            a.this.l();
        }

        @Override // a.t.l.g.a
        public void h(a.t.l.g gVar, g.C0076g c0076g) {
            a.this.p();
        }

        @Override // a.t.l.g.a
        public void i(a.t.l.g gVar, g.C0076g c0076g) {
            a.this.p();
        }
    }

    public final class g extends RecyclerView.h<RecyclerView.e0> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<d> f3228e = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<g.C0076g> f3229f = new ArrayList<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList<g.C0076g> f3230g = new ArrayList<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LayoutInflater f3231h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Drawable f3232i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Drawable f3233j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Drawable f3234k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Drawable f3235l;

        /* JADX INFO: renamed from: a.t.k.a$g$a, reason: collision with other inner class name */
        public class C0069a extends RecyclerView.e0 {
            public ImageView u;
            public TextView v;

            public C0069a(View view) {
                super(view);
                this.u = (ImageView) view.findViewById(a.t.d.f3144d);
                this.v = (TextView) view.findViewById(a.t.d.f3145e);
            }

            public void R(d dVar) {
                g.C0076g c0076g = (g.C0076g) dVar.a();
                this.u.setImageDrawable(g.this.Z(c0076g));
                this.v.setText(c0076g.i());
            }
        }

        public class b extends RecyclerView.e0 {
            public TextView u;
            public MediaRouteVolumeSlider v;

            public b(View view) {
                super(view);
                this.u = (TextView) view.findViewById(a.t.d.F);
                this.v = (MediaRouteVolumeSlider) view.findViewById(a.t.d.G);
            }

            public void R(d dVar) {
                g.C0076g c0076g = (g.C0076g) dVar.a();
                this.u.setText(c0076g.i().toUpperCase());
                this.v.a(a.this.r);
                this.v.setTag(c0076g);
                this.v.setProgress(a.this.f3211h.o());
                this.v.setOnSeekBarChangeListener(a.this.q);
            }
        }

        public class c extends RecyclerView.e0 {
            public TextView u;

            public c(View view) {
                super(view);
                this.u = (TextView) view.findViewById(a.t.d.C);
            }

            public void R(d dVar) {
                this.u.setText(dVar.a().toString().toUpperCase());
            }
        }

        public class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f3237a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f3238b;

            public d(Object obj, int i2) {
                this.f3237a = obj;
                this.f3238b = i2;
            }

            public Object a() {
                return this.f3237a;
            }

            public int b() {
                return this.f3238b;
            }
        }

        public class e extends RecyclerView.e0 {
            public ImageView u;
            public TextView v;
            public CheckBox w;
            public MediaRouteVolumeSlider x;

            public e(View view) {
                super(view);
                this.u = (ImageView) view.findViewById(a.t.d.f3151k);
                this.v = (TextView) view.findViewById(a.t.d.f3152l);
                this.w = (CheckBox) view.findViewById(a.t.d.f3142b);
                this.x = (MediaRouteVolumeSlider) view.findViewById(a.t.d.f3154n);
            }

            public void R(d dVar) {
                g.C0076g c0076g = (g.C0076g) dVar.a();
                this.u.setImageDrawable(g.this.Z(c0076g));
                this.v.setText(c0076g.i());
                this.w.setChecked(g.this.e0(c0076g));
                this.x.a(a.this.r);
                this.x.setTag(c0076g);
                this.x.setProgress(c0076g.o());
                this.x.setOnSeekBarChangeListener(a.this.q);
            }
        }

        public g() {
            this.f3231h = LayoutInflater.from(a.this.f3213j);
            this.f3232i = i.f(a.this.f3213j);
            this.f3233j = i.n(a.this.f3213j);
            this.f3234k = i.j(a.this.f3213j);
            this.f3235l = i.k(a.this.f3213j);
            g0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void F(RecyclerView.e0 e0Var, int i2) {
            int iR = r(i2);
            d dVarC0 = c0(i2);
            if (iR == 1) {
                ((b) e0Var).R(dVarC0);
                return;
            }
            if (iR == 2) {
                ((c) e0Var).R(dVarC0);
                return;
            }
            if (iR == 3) {
                ((e) e0Var).R(dVarC0);
            } else if (iR != 4) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((C0069a) e0Var).R(dVarC0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new b(this.f3231h.inflate(a.t.g.f3164c, viewGroup, false));
            }
            if (i2 == 2) {
                return new c(this.f3231h.inflate(a.t.g.f3170i, viewGroup, false));
            }
            if (i2 == 3) {
                return new e(this.f3231h.inflate(a.t.g.f3165d, viewGroup, false));
            }
            if (i2 == 4) {
                return new C0069a(this.f3231h.inflate(a.t.g.f3163b, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        public final Drawable W(g.C0076g c0076g) {
            int iE = c0076g.e();
            return iE != 1 ? iE != 2 ? c0076g instanceof g.f ? this.f3235l : this.f3232i : this.f3234k : this.f3233j;
        }

        public Drawable Z(g.C0076g c0076g) {
            Uri uriG = c0076g.g();
            if (uriG != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(a.this.f3213j.getContentResolver().openInputStream(uriG), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e2) {
                    Log.w("RecyclerAdapter", "Failed to load " + uriG, e2);
                }
            }
            return W(c0076g);
        }

        public d c0(int i2) {
            return this.f3228e.get(i2);
        }

        public boolean e0(g.C0076g c0076g) {
            if (c0076g.w()) {
                return true;
            }
            g.C0076g c0076g2 = a.this.f3211h;
            if (!(c0076g2 instanceof g.f)) {
                return false;
            }
            Iterator<g.C0076g> it = ((g.f) c0076g2).F().iterator();
            while (it.hasNext()) {
                if (it.next().h().equals(c0076g.h())) {
                    return true;
                }
            }
            return false;
        }

        public void g0() {
            this.f3228e.clear();
            g.C0076g c0076g = a.this.f3211h;
            if (c0076g instanceof g.f) {
                this.f3228e.add(new d(c0076g, 1));
                Iterator<g.C0076g> it = ((g.f) a.this.f3211h).F().iterator();
                while (it.hasNext()) {
                    this.f3228e.add(new d(it.next(), 3));
                }
            } else {
                this.f3228e.add(new d(c0076g, 3));
            }
            this.f3229f.clear();
            this.f3230g.clear();
            for (g.C0076g c0076g2 : a.this.f3212i) {
                if (!e0(c0076g2)) {
                    (c0076g2 instanceof g.f ? this.f3230g : this.f3229f).add(c0076g2);
                }
            }
            if (this.f3229f.size() > 0) {
                this.f3228e.add(new d(a.this.f3213j.getString(a.t.h.p), 2));
                Iterator<g.C0076g> it2 = this.f3229f.iterator();
                while (it2.hasNext()) {
                    this.f3228e.add(new d(it2.next(), 3));
                }
            }
            if (this.f3230g.size() > 0) {
                this.f3228e.add(new d(a.this.f3213j.getString(a.t.h.q), 2));
                Iterator<g.C0076g> it3 = this.f3230g.iterator();
                while (it3.hasNext()) {
                    this.f3228e.add(new d(it3.next(), 4));
                }
            }
            w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int o() {
            return this.f3228e.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int r(int i2) {
            return this.f3228e.get(i2).b();
        }
    }

    public class h implements SeekBar.OnSeekBarChangeListener {
        public h() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public a(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, int i2) {
        Context contextB = i.b(context, i2, false);
        super(contextB, i.c(contextB));
        this.f3210g = a.t.l.f.f3357a;
        this.f3212i = new ArrayList();
        this.f3217n = new HandlerC0068a();
        Context context2 = getContext();
        this.f3213j = context2;
        a.t.l.g gVarF = a.t.l.g.f(context2);
        this.f3208e = gVarF;
        this.f3209f = new f();
        this.f3211h = gVarF.i();
        this.A = new e();
        m(gVarF.g());
    }

    public static boolean g(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public void e() {
        this.F = false;
        this.G = null;
        this.H = 0;
    }

    public int f(int i2, int i3) {
        return this.v.getHeight();
    }

    public final boolean h() {
        MediaDescriptionCompat mediaDescriptionCompat = this.B;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.B;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        d dVar = this.C;
        Bitmap bitmapB = dVar == null ? this.D : dVar.b();
        d dVar2 = this.C;
        Uri uriC = dVar2 == null ? this.E : dVar2.c();
        if (bitmapB != iconBitmap) {
            return true;
        }
        return bitmapB == null && a.i.q.d.a(uriC, iconUri);
    }

    public boolean i(g.C0076g c0076g) {
        return !c0076g.t() && c0076g.u() && c0076g.y(this.f3210g);
    }

    public void k(List<g.C0076g> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!i(list.get(size))) {
                list.remove(size);
            }
        }
    }

    public void l() {
        if (this.f3215l) {
            ArrayList arrayList = new ArrayList(this.f3208e.h());
            k(arrayList);
            Collections.sort(arrayList, b.d.f3259b);
            if (SystemClock.uptimeMillis() - this.f3216m >= 300) {
                t(arrayList);
                return;
            }
            this.f3217n.removeMessages(1);
            Handler handler = this.f3217n;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f3216m + 300);
        }
    }

    public final void m(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.z;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.A);
            this.z = null;
        }
        if (token != null && this.f3215l) {
            try {
                this.z = new MediaControllerCompat(this.f3213j, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCastDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.z;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.registerCallback(this.A);
            }
            MediaControllerCompat mediaControllerCompat3 = this.z;
            MediaMetadataCompat metadata = mediaControllerCompat3 == null ? null : mediaControllerCompat3.getMetadata();
            this.B = metadata != null ? metadata.getDescription() : null;
            q();
            p();
        }
    }

    public void n(a.t.l.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f3210g.equals(fVar)) {
            return;
        }
        this.f3210g = fVar;
        if (this.f3215l) {
            this.f3208e.k(this.f3209f);
            this.f3208e.b(fVar, this.f3209f, 1);
        }
        l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3215l = true;
        this.f3208e.b(this.f3210g, this.f3209f, 1);
        l();
        m(this.f3208e.g());
    }

    @Override // a.b.k.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a.t.g.f3162a);
        ImageButton imageButton = (ImageButton) findViewById(a.t.d.f3143c);
        this.s = imageButton;
        imageButton.setOnClickListener(new b());
        Button button = (Button) findViewById(a.t.d.f3153m);
        this.t = button;
        button.setOnClickListener(new c());
        this.p = new g();
        RecyclerView recyclerView = (RecyclerView) findViewById(a.t.d.f3146f);
        this.f3218o = recyclerView;
        recyclerView.setAdapter(this.p);
        this.f3218o.setLayoutManager(new LinearLayoutManager(this.f3213j));
        this.q = new h();
        this.r = i.e(this.f3213j, 0);
        this.u = (RelativeLayout) findViewById(a.t.d.f3147g);
        this.v = (ImageView) findViewById(a.t.d.f3148h);
        this.w = (TextView) findViewById(a.t.d.f3150j);
        this.x = (TextView) findViewById(a.t.d.f3149i);
        this.y = this.f3213j.getResources().getString(a.t.h.f3177e);
        this.f3214k = true;
        r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3215l = false;
        this.f3208e.k(this.f3209f);
        this.f3217n.removeMessages(1);
        m(null);
    }

    public void p() {
        if (!this.f3211h.w() || this.f3211h.t()) {
            dismiss();
            return;
        }
        if (this.f3214k) {
            if (this.F) {
                if (g(this.G)) {
                    this.v.setVisibility(8);
                    Log.w("MediaRouteCastDialog", "Can't set artwork image with recycled bitmap: " + this.G);
                } else {
                    this.v.setVisibility(0);
                    this.v.setImageBitmap(this.G);
                    this.v.setBackgroundColor(this.H);
                    this.u.setBackgroundDrawable(new BitmapDrawable(this.G));
                }
                e();
            } else {
                this.v.setVisibility(8);
            }
            s();
        }
    }

    public void q() {
        if (h()) {
            d dVar = this.C;
            if (dVar != null) {
                dVar.cancel(true);
            }
            d dVar2 = new d();
            this.C = dVar2;
            dVar2.execute(new Void[0]);
        }
    }

    public void r() {
        getWindow().setLayout(-1, -1);
        this.D = null;
        this.E = null;
        q();
        p();
    }

    public final void s() {
        int i2;
        MediaDescriptionCompat mediaDescriptionCompat = this.B;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.B;
        CharSequence subtitle = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getSubtitle() : null;
        boolean z2 = !TextUtils.isEmpty(subtitle);
        if (z) {
            this.w.setText(title);
        } else {
            this.w.setText(this.y);
        }
        TextView textView = this.x;
        if (z2) {
            textView.setText(subtitle);
            textView = this.x;
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public void t(List<g.C0076g> list) {
        this.f3216m = SystemClock.uptimeMillis();
        this.f3212i.clear();
        this.f3212i.addAll(list);
        this.p.g0();
    }
}
