package com.nst.iptvsmarterstvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.f.a.b.j3.z;
import c.h.a.h.l;
import c.h.a.k.a.k;
import c.h.a.k.b.a0;
import c.h.a.k.b.j;
import c.h.a.k.b.p;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.R;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoPickActivity extends k {
    public String A;
    public int E;
    public Context H;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26893g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f26895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f26896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26898l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<c.h.a.g.c.c<c.h.a.g.c.f>> f26900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ProgressBar f26901o;
    public TextView p;
    public TextView q;
    public LinearLayout r;
    public RelativeLayout s;
    public RelativeLayout t;
    public List<c.h.a.g.c.f> u;
    public long v;
    public String w;
    public String x;
    public int y;
    public int z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26894h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c.h.a.g.c.f> f26899m = new ArrayList<>();
    public ArrayList<c.h.a.i.k> B = new ArrayList<>();
    public int C = 0;
    public AsyncTask D = null;
    public l F = new l();
    public Handler G = new Handler();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("ResultPickVideo", VideoPickActivity.this.f26899m);
            VideoPickActivity.this.setResult(-1, intent);
            VideoPickActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPickActivity videoPickActivity = VideoPickActivity.this;
            videoPickActivity.f17367e.d(videoPickActivity.t);
        }
    }

    public class c implements j.b {
        public c() {
        }

        @Override // c.h.a.k.b.j.b
        public void a(c.h.a.g.c.c cVar) {
            if (VideoPickActivity.this.f26896j != null) {
                if (VideoPickActivity.this.D != null && VideoPickActivity.this.D.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    VideoPickActivity.this.D.cancel(true);
                }
                VideoPickActivity.this.B.clear();
                VideoPickActivity.this.f26895i.setAdapter(null);
                VideoPickActivity.this.f26896j.w();
            }
            VideoPickActivity videoPickActivity = VideoPickActivity.this;
            videoPickActivity.f17367e.d(videoPickActivity.t);
            VideoPickActivity.this.q.setText(cVar.c());
            VideoPickActivity.this.u.clear();
            if (TextUtils.isEmpty(cVar.d())) {
                VideoPickActivity videoPickActivity2 = VideoPickActivity.this;
                videoPickActivity2.T0(videoPickActivity2.f26900n);
                return;
            }
            for (c.h.a.g.c.c cVar2 : VideoPickActivity.this.f26900n) {
                if (cVar2.d().equals(cVar.d())) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(cVar2);
                    VideoPickActivity.this.T0(arrayList);
                    return;
                }
            }
        }
    }

    public class d implements c.h.a.g.b.b<c.h.a.g.c.f> {
        public d() {
        }

        @Override // c.h.a.g.b.b
        public void a(List<c.h.a.g.c.c<c.h.a.g.c.f>> list) {
            VideoPickActivity.this.f26901o.setVisibility(8);
            if (VideoPickActivity.this.f17368f) {
                ArrayList arrayList = new ArrayList();
                c.h.a.g.c.c cVar = new c.h.a.g.c.c();
                cVar.f(VideoPickActivity.this.getResources().getString(R.string.vw_all));
                arrayList.add(cVar);
                arrayList.addAll(list);
                VideoPickActivity.this.f17367e.a(arrayList);
            }
            VideoPickActivity.this.f26900n = list;
            VideoPickActivity videoPickActivity = VideoPickActivity.this;
            if (videoPickActivity.C == 0) {
                videoPickActivity.T0(list);
            }
        }
    }

    public class e implements p<c.h.a.g.c.f> {
        public e() {
        }

        @Override // c.h.a.k.b.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean z, c.h.a.g.c.f fVar) {
            if (z) {
                VideoPickActivity.this.f26899m.add(fVar);
                VideoPickActivity.O0(VideoPickActivity.this);
            } else {
                VideoPickActivity.this.f26899m.remove(fVar);
                VideoPickActivity.P0(VideoPickActivity.this);
            }
            VideoPickActivity.this.p.setText(VideoPickActivity.this.f26894h + "/" + VideoPickActivity.this.f26893g);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoPickActivity.this.D = VideoPickActivity.this.new g(0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    public class g extends AsyncTask<String, Integer, Boolean> {
        public g(int i2) {
            VideoPickActivity.this.E = 1;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            l lVar;
            StringBuilder sb;
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                VideoPickActivity.this.B.clear();
                int i2 = 0;
                int i3 = 0;
                while (i3 < VideoPickActivity.this.u.size()) {
                    l lVar2 = VideoPickActivity.this.F;
                    if (lVar2 != null) {
                        try {
                            lVar2.e();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                    if ((VideoPickActivity.this.D != null && VideoPickActivity.this.D.isCancelled()) || ((lVar = VideoPickActivity.this.F) != null && lVar.b())) {
                        z.b("hgsdfhg", "hgshf");
                        break;
                    }
                    c.h.a.g.c.f fVar = VideoPickActivity.this.u.get(i3);
                    long length = new File(fVar.q()).length();
                    VideoPickActivity.this.v = length / 1024;
                    float f2 = length / 1024;
                    if (f2 >= Constants.MB) {
                        String strValueOf = String.valueOf(Float.valueOf(decimalFormat.format(f2 / r7)).floatValue());
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
                    VideoPickActivity.this.w = fVar.q().substring(fVar.q().lastIndexOf("/") + 1);
                    VideoPickActivity.this.x = fVar.q().substring(fVar.q().lastIndexOf(InstructionFileId.DOT) + 1);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(fVar.q());
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    try {
                        VideoPickActivity.this.y = frameAtTime.getWidth();
                        VideoPickActivity.this.z = frameAtTime.getHeight();
                    } catch (Exception unused) {
                        VideoPickActivity videoPickActivity = VideoPickActivity.this;
                        videoPickActivity.y = i2;
                        videoPickActivity.z = i2;
                    }
                    long jLastModified = new File(fVar.q()).lastModified();
                    VideoPickActivity.this.A = c.h.a.d.d(fVar.H());
                    VideoPickActivity videoPickActivity2 = VideoPickActivity.this;
                    videoPickActivity2.B.add(new c.h.a.i.k(videoPickActivity2.w, jLastModified, string, videoPickActivity2.y, videoPickActivity2.z, videoPickActivity2.A, videoPickActivity2.x));
                    if (i3 == 10 || (i3 != 0 && i3 % 10 == 0)) {
                        publishProgress(Integer.valueOf(i3));
                    }
                    i3++;
                    i2 = 0;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            VideoPickActivity videoPickActivity = VideoPickActivity.this;
            videoPickActivity.E = 0;
            videoPickActivity.f26901o.setVisibility(8);
            VideoPickActivity.this.f26896j.i0(VideoPickActivity.this.B);
            VideoPickActivity.this.f26896j.w();
            VideoPickActivity.this.f26896j.W(VideoPickActivity.this.u);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            VideoPickActivity.this.f26901o.setVisibility(8);
            VideoPickActivity.this.f26896j.i0(VideoPickActivity.this.B);
            VideoPickActivity.this.f26896j.w();
            VideoPickActivity.this.f26896j.W(VideoPickActivity.this.u);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            VideoPickActivity.this.f26901o.setVisibility(0);
            if (VideoPickActivity.this.D == null || !VideoPickActivity.this.D.getStatus().equals(AsyncTask.Status.RUNNING)) {
                return;
            }
            VideoPickActivity.this.D.cancel(true);
        }
    }

    public static /* synthetic */ int O0(VideoPickActivity videoPickActivity) {
        int i2 = videoPickActivity.f26894h;
        videoPickActivity.f26894h = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int P0(VideoPickActivity videoPickActivity) {
        int i2 = videoPickActivity.f26894h;
        videoPickActivity.f26894h = i2 - 1;
        return i2;
    }

    public final boolean Q0(List<c.h.a.g.c.f> list) {
        for (c.h.a.g.c.f fVar : list) {
            if (fVar.q().equals(this.f26896j.f17385l)) {
                this.f26899m.add(fVar);
                int i2 = this.f26894h + 1;
                this.f26894h = i2;
                this.f26896j.n0(i2);
                this.p.setText(this.f26894h + "/" + this.f26893g);
                return true;
            }
        }
        return false;
    }

    public final void R0() {
        TextView textView = (TextView) findViewById(R.id.tv_count);
        this.p = textView;
        textView.setText(this.f26894h + "/" + this.f26893g);
        this.f26895i.setLayoutManager(new LinearLayoutManager(this));
        this.f26901o = (ProgressBar) findViewById(R.id.pb_video_pick);
        if (new File(getExternalCacheDir().getAbsolutePath() + File.separator + "FilePick").exists()) {
            this.f26901o.setVisibility(8);
        } else {
            this.f26901o.setVisibility(0);
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_done);
        this.s = relativeLayout;
        relativeLayout.setOnClickListener(new a());
        this.t = (RelativeLayout) findViewById(R.id.tb_pick);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_folder);
        this.r = linearLayout;
        if (this.f17368f) {
            linearLayout.setVisibility(0);
            this.r.setOnClickListener(new b());
            TextView textView2 = (TextView) findViewById(R.id.tv_folder);
            this.q = textView2;
            textView2.setText(getResources().getString(R.string.vw_all));
            try {
                this.f17367e.c(new c());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void S0() {
        c.h.a.g.a.b(this, new d());
    }

    @SuppressLint({"StaticFieldLeak"})
    public final void T0(List<c.h.a.g.c.c<c.h.a.g.c.f>> list) {
        boolean zQ0 = this.f26898l;
        a0 a0Var = new a0(this, this.f26897k, this.f26893g);
        this.f26896j = a0Var;
        this.f26895i.setAdapter(a0Var);
        if (zQ0 && !TextUtils.isEmpty(this.f26896j.f17385l)) {
            zQ0 = !this.f26896j.h0() && new File(this.f26896j.f17385l).exists();
        }
        this.u.clear();
        for (c.h.a.g.c.c<c.h.a.g.c.f> cVar : list) {
            this.u.addAll(cVar.b());
            if (zQ0) {
                zQ0 = Q0(cVar.b());
            }
        }
        Iterator<c.h.a.g.c.f> it = this.f26899m.iterator();
        while (it.hasNext()) {
            int iIndexOf = this.u.indexOf(it.next());
            if (iIndexOf != -1) {
                this.u.get(iIndexOf).E(true);
            }
        }
        this.f26896j.Z(new e());
        Handler handler = this.G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.G.postDelayed(new f(), 1000L);
        }
    }

    @Override // c.h.a.k.a.k, a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.H = this;
        super.onCreate(bundle);
        setContentView(R.layout.vw_activity_video_pick);
        if (new c.h.a.k.d.a.a(this.H).A().equals(c.h.a.h.n.a.s0)) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
        this.u = new ArrayList();
        this.f26893g = getIntent().getIntExtra("MaxNumber", 9);
        this.f26897k = getIntent().getBooleanExtra("IsNeedCamera", false);
        this.f26898l = getIntent().getBooleanExtra("IsTakenAutoSelected", true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_video_pick);
        this.f26895i = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        R0();
        S0();
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.D;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.D.cancel(true);
        }
        try {
            if (this.E == 1) {
                this.F.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.C++;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (this.E == 1) {
                this.F.d();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            if (this.E == 1) {
                this.F.c();
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.a.k
    public void y0() {
    }
}
