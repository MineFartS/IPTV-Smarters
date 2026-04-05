package minefarts.iptvsmarters.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.h.a.h.l;
import c.h.a.i.j;
import c.h.a.k.a.k;
import c.h.a.k.b.j;
import c.h.a.k.b.p;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import minefarts.iptvsmarters.R;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AudioPickActivity extends k {
    public String A;
    public String C;
    public int F;
    public Context I;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f25336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25337h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f25339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.k.b.b f25340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25342m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<c.h.a.g.c.c<c.h.a.g.c.a>> f25344o;
    public String p;
    public TextView q;
    public TextView r;
    public LinearLayout s;
    public RelativeLayout t;
    public RelativeLayout u;
    public RelativeLayout v;
    public ProgressBar w;
    public List<c.h.a.g.c.a> x;
    public long y;
    public String z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25338i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<c.h.a.g.c.a> f25343n = new ArrayList<>();
    public int B = 0;
    public ArrayList<j> D = new ArrayList<>();
    public AsyncTask E = null;
    public l G = new l();
    public Handler H = new Handler();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("ResultPickAudio", AudioPickActivity.this.f25343n);
            AudioPickActivity.this.setResult(-1, intent);
            AudioPickActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AudioPickActivity audioPickActivity = AudioPickActivity.this;
            audioPickActivity.f17367e.d(audioPickActivity.u);
        }
    }

    public class c implements j.b {
        public c() {
        }

        @Override // c.h.a.k.b.j.b
        public void a(c.h.a.g.c.c cVar) {
            ArrayList<c.h.a.i.j> arrayList = AudioPickActivity.this.D;
            if (arrayList != null && arrayList.size() > 0) {
                AudioPickActivity.this.D.clear();
                AudioPickActivity.this.f25340k.w();
            }
            AudioPickActivity.this.w.setVisibility(0);
            AudioPickActivity audioPickActivity = AudioPickActivity.this;
            audioPickActivity.f17367e.d(audioPickActivity.u);
            AudioPickActivity.this.r.setText(cVar.c());
            AudioPickActivity.this.x.clear();
            if (TextUtils.isEmpty(cVar.d())) {
                AudioPickActivity audioPickActivity2 = AudioPickActivity.this;
                audioPickActivity2.S0(audioPickActivity2.f25344o);
                AudioPickActivity.this.w.setVisibility(8);
                return;
            }
            for (c.h.a.g.c.c cVar2 : AudioPickActivity.this.f25344o) {
                if (cVar2.d().equals(cVar.d())) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(cVar2);
                    AudioPickActivity.this.S0(arrayList2);
                    return;
                }
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
            if (c.h.a.d.a(AudioPickActivity.this, intent)) {
                AudioPickActivity.this.startActivityForResult(intent, 769);
            } else {
                c.h.a.c.a(AudioPickActivity.this).c(AudioPickActivity.this.getString(R.string.vw_no_audio_app));
            }
        }
    }

    public class e implements c.h.a.g.b.b<c.h.a.g.c.a> {
        public e() {
        }

        @Override // c.h.a.g.b.b
        public void a(List<c.h.a.g.c.c<c.h.a.g.c.a>> list) {
            if (AudioPickActivity.this.f17368f) {
                ArrayList arrayList = new ArrayList();
                c.h.a.g.c.c cVar = new c.h.a.g.c.c();
                cVar.f(AudioPickActivity.this.getResources().getString(R.string.vw_all));
                arrayList.add(cVar);
                arrayList.addAll(list);
                AudioPickActivity.this.f17367e.a(arrayList);
            }
            AudioPickActivity.this.f25344o = list;
            AudioPickActivity audioPickActivity = AudioPickActivity.this;
            if (audioPickActivity.B == 0) {
                audioPickActivity.S0(list);
            }
        }
    }

    public class f implements p<c.h.a.g.c.a> {
        public f() {
        }

        @Override // c.h.a.k.b.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean z, c.h.a.g.c.a aVar) {
            if (z) {
                AudioPickActivity.this.f25343n.add(aVar);
                AudioPickActivity.L0(AudioPickActivity.this);
            } else {
                AudioPickActivity.this.f25343n.remove(aVar);
                AudioPickActivity.M0(AudioPickActivity.this);
            }
            AudioPickActivity.this.q.setText(AudioPickActivity.this.f25338i + "/" + AudioPickActivity.this.f25337h);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AudioPickActivity.this.E = AudioPickActivity.this.new h(0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class h extends AsyncTask<Void, Integer, Void> {
        public h(int i2) {
            AudioPickActivity.this.F = 1;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            StringBuilder sb;
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                AudioPickActivity.this.D.clear();
                for (int i2 = 0; i2 < AudioPickActivity.this.x.size() && (AudioPickActivity.this.E == null || !AudioPickActivity.this.E.isCancelled()); i2++) {
                    c.h.a.g.c.a aVar = AudioPickActivity.this.x.get(i2);
                    long length = new File(aVar.q()).length();
                    AudioPickActivity.this.y = length / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    float f2 = length / 1024;
                    if (f2 >= Constants.MB) {
                        String strValueOf = String.valueOf(Float.valueOf(decimalFormat.format(f2 / r6)).floatValue());
                        sb = new StringBuilder();
                        sb.append(strValueOf);
                        sb.append(" GB");
                    } else if (f2 >= 1024) {
                        String strValueOf2 = String.valueOf(Float.valueOf(decimalFormat.format(f2 / 1024.0f)).floatValue());
                        sb = new StringBuilder();
                        sb.append(strValueOf2);
                        sb.append(" MB");
                    } else {
                        String strValueOf3 = String.valueOf(f2);
                        sb = new StringBuilder();
                        sb.append(strValueOf3);
                        sb.append(" KB");
                    }
                    String string = sb.toString();
                    AudioPickActivity.this.z = aVar.q().substring(aVar.q().lastIndexOf("/") + 1);
                    AudioPickActivity.this.A = aVar.q().substring(aVar.q().lastIndexOf(InstructionFileId.DOT) + 1);
                    long jLastModified = new File(aVar.q()).lastModified();
                    AudioPickActivity.this.C = c.h.a.d.d(aVar.H());
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(aVar.q());
                        ByteArrayInputStream byteArrayInputStream = mediaMetadataRetriever.getEmbeddedPicture() != null ? new ByteArrayInputStream(mediaMetadataRetriever.getEmbeddedPicture()) : null;
                        mediaMetadataRetriever.release();
                        AudioPickActivity.this.f25336g = BitmapFactory.decodeStream(byteArrayInputStream);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    AudioPickActivity audioPickActivity = AudioPickActivity.this;
                    audioPickActivity.D.add(new c.h.a.i.j(audioPickActivity.z, jLastModified, string, audioPickActivity.C, audioPickActivity.f25336g));
                    if (i2 == 2 || (i2 != 0 && i2 % 50 == 0)) {
                        publishProgress(Integer.valueOf(i2));
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r2) {
            super.onPostExecute(r2);
            AudioPickActivity audioPickActivity = AudioPickActivity.this;
            audioPickActivity.F = 0;
            audioPickActivity.w.setVisibility(8);
            AudioPickActivity.this.f25340k.m0(AudioPickActivity.this.D);
            AudioPickActivity.this.f25340k.w();
            AudioPickActivity.this.f25340k.W(AudioPickActivity.this.x);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            AudioPickActivity.this.f25340k.m0(AudioPickActivity.this.D);
            AudioPickActivity.this.f25340k.w();
            AudioPickActivity.this.f25340k.W(AudioPickActivity.this.x);
            AudioPickActivity.this.w.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            AudioPickActivity.this.w.setVisibility(0);
            if (AudioPickActivity.this.E == null || !AudioPickActivity.this.E.getStatus().equals(AsyncTask.Status.RUNNING)) {
                return;
            }
            AudioPickActivity.this.E.cancel(true);
        }
    }

    public static /* synthetic */ int L0(AudioPickActivity audioPickActivity) {
        int i2 = audioPickActivity.f25338i;
        audioPickActivity.f25338i = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int M0(AudioPickActivity audioPickActivity) {
        int i2 = audioPickActivity.f25338i;
        audioPickActivity.f25338i = i2 - 1;
        return i2;
    }

    public final boolean P0(List<c.h.a.g.c.a> list) {
        for (c.h.a.g.c.a aVar : list) {
            if (aVar.q().equals(this.p)) {
                this.f25343n.add(aVar);
                int i2 = this.f25338i + 1;
                this.f25338i = i2;
                this.f25340k.p0(i2);
                this.q.setText(this.f25338i + "/" + this.f25337h);
                return true;
            }
        }
        return false;
    }

    public final void Q0() {
        TextView textView = (TextView) findViewById(R.id.tv_count);
        this.q = textView;
        textView.setText(this.f25338i + "/" + this.f25337h);
        this.f25339j = (RecyclerView) findViewById(R.id.rv_audio_pick);
        this.f25339j.setLayoutManager(new LinearLayoutManager(this));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_video_pick);
        this.w = progressBar;
        progressBar.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_done);
        this.t = relativeLayout;
        relativeLayout.setOnClickListener(new a());
        this.u = (RelativeLayout) findViewById(R.id.tb_pick);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_folder);
        this.s = linearLayout;
        if (this.f17368f) {
            linearLayout.setVisibility(0);
            this.s.setOnClickListener(new b());
            TextView textView2 = (TextView) findViewById(R.id.tv_folder);
            this.r = textView2;
            textView2.setText(getResources().getString(R.string.vw_all));
            this.f17367e.c(new c());
        }
        if (this.f25341l) {
            RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.rl_rec_aud);
            this.v = relativeLayout2;
            relativeLayout2.setVisibility(0);
            this.v.setOnClickListener(new d());
        }
    }

    public final void R0() {
        c.h.a.g.a.a(this, new e());
    }

    public final void S0(List<c.h.a.g.c.c<c.h.a.g.c.a>> list) {
        boolean z = false;
        this.w.setVisibility(0);
        this.x.clear();
        c.h.a.k.b.b bVar = new c.h.a.k.b.b(this, this.f25337h);
        this.f25340k = bVar;
        this.f25339j.setAdapter(bVar);
        this.f25340k.Z(new f());
        boolean zP0 = this.f25342m;
        if (zP0 && !TextUtils.isEmpty(this.p)) {
            File file = new File(this.p);
            if (!this.f25340k.l0() && file.exists()) {
                z = true;
            }
            zP0 = z;
        }
        for (c.h.a.g.c.c<c.h.a.g.c.a> cVar : list) {
            this.x.addAll(cVar.b());
            if (zP0) {
                zP0 = P0(cVar.b());
            }
        }
        Iterator<c.h.a.g.c.a> it = this.f25343n.iterator();
        while (it.hasNext()) {
            int iIndexOf = this.x.indexOf(it.next());
            if (iIndexOf != -1) {
                this.x.get(iIndexOf).E(true);
            }
        }
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.H.postDelayed(new g(), 1000L);
        }
    }

    @Override // c.h.a.k.a.k, a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 769 && i3 == -1) {
            if (intent.getData() != null) {
                this.p = intent.getData().getPath();
            }
            R0();
        }
    }

    @Override // c.h.a.k.a.k, a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.I = this;
        super.onCreate(bundle);
        setContentView(R.layout.vw_activity_audio_pick);
        if (new c.h.a.k.d.a.a(this.I).A().equals(c.h.a.h.n.a.s0)) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
        this.x = new ArrayList();
        this.f25337h = getIntent().getIntExtra("MaxNumber", 9);
        this.f25341l = getIntent().getBooleanExtra("IsNeedRecorder", false);
        this.f25342m = getIntent().getBooleanExtra("IsTakenAutoSelected", true);
        Q0();
        R0();
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.E;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.E.cancel(true);
        }
        try {
            if (this.F == 1) {
                this.G.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.B++;
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            if (this.F == 1) {
                this.G.c();
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.a.k
    public void y0() {
    }
}
