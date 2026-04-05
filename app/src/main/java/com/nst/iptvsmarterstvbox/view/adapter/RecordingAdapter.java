package minefarts.iptvsmarters.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.k.d.c.a.f;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass;
import minefarts.iptvsmarters.view.activity.RecordingActivity;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class RecordingAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c.h.a.k.d.a.a f27695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f27696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f27697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<ExternalPlayerModelClass> f27698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f27699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Date f27700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DateFormat f27701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SimpleDateFormat f27702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27703m = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecordingActivity f27705o;
    public ArrayList<File> p;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView iv_delete_recording;

        @BindView
        public LinearLayout ll_list_view;

        @BindView
        public TextView tv_date;

        @BindView
        public TextView tv_file_size;

        @BindView
        public TextView tv_recordings;

        @BindView
        public TextView tv_time;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27706b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27706b = myViewHolder;
            myViewHolder.tv_recordings = (TextView) b.c.c.c(view, R.id.tv_recordings, "field 'tv_recordings'", TextView.class);
            myViewHolder.tv_file_size = (TextView) b.c.c.c(view, R.id.tv_file_size, "field 'tv_file_size'", TextView.class);
            myViewHolder.tv_date = (TextView) b.c.c.c(view, R.id.tv_date, "field 'tv_date'", TextView.class);
            myViewHolder.tv_time = (TextView) b.c.c.c(view, R.id.tv_time, "field 'tv_time'", TextView.class);
            myViewHolder.iv_delete_recording = (ImageView) b.c.c.c(view, R.id.iv_delete_recording, "field 'iv_delete_recording'", ImageView.class);
            myViewHolder.ll_list_view = (LinearLayout) b.c.c.c(view, R.id.ll_list_view, "field 'll_list_view'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27706b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27706b = null;
            myViewHolder.tv_recordings = null;
            myViewHolder.tv_file_size = null;
            myViewHolder.tv_date = null;
            myViewHolder.tv_time = null;
            myViewHolder.iv_delete_recording = null;
            myViewHolder.ll_list_view = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27707b;

        public a(int i2) {
            this.f27707b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordingAdapter recordingAdapter = RecordingAdapter.this;
            recordingAdapter.p0(view, this.f27707b, recordingAdapter.p);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27711b;

        public c(ArrayList arrayList, int i2) {
            this.f27710a = arrayList;
            this.f27711b = i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            r5 = new android.content.Intent(r8.f27712c.f27705o, (java.lang.Class<?>) minefarts.iptvsmarters.view.activity.PlayExternalPlayerActivity.class);
            r5.putExtra("url", ((java.io.File) r8.f27710a.get(r8.f27711b)).getAbsolutePath());
            r5.putExtra("app_name", ((minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass) r8.f27712c.f27698h.get(r4)).a());
            r5.putExtra("packagename", ((minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass) r8.f27712c.f27698h.get(r4)).b());
            r8.f27712c.f27705o.startActivity(r5);
         */
        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onMenuItemClick(android.view.MenuItem r9) {
            /*
                Method dump skipped, instruction units count: 482
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.RecordingAdapter.c.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public class d implements PopupMenu.OnDismissListener {
        public d() {
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27714b;

        public e(View view) {
            this.f27714b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27714b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27714b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27714b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (z) {
                f2 = z ? 1.05f : 1.0f;
                b(f2);
                c(f2);
                Log.e("id is", BuildConfig.FLAVOR + this.f27714b.getTag());
                view2 = this.f27714b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.05f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f27714b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public RecordingAdapter(RecordingActivity recordingActivity, ArrayList<File> arrayList) {
        String str;
        String str2;
        this.f27699i = Boolean.TRUE;
        this.p = new ArrayList<>();
        this.p = arrayList;
        this.f27705o = recordingActivity;
        f27696f = recordingActivity.getApplicationContext().getPackageName();
        f27697g = m0(recordingActivity);
        this.f27704n = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        Locale locale = Locale.US;
        this.f27702l = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f27701k = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f27700j = new Date();
        SimpleDateFormat simpleDateFormat = this.f27702l;
        if (l0(simpleDateFormat, simpleDateFormat.format(new Date(f.a(recordingActivity))), this.f27701k.format(this.f27700j)) < c.h.a.k.d.c.a.d.p() || (str = this.f27703m) == null || this.f27704n == null) {
            return;
        }
        if (f27697g.equals(str) && (this.f27703m == null || (str2 = this.f27704n) == null || f27696f.equals(str2))) {
            return;
        }
        this.f27699i = Boolean.FALSE;
    }

    public static long l0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String m0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        File file;
        TextView textView;
        StringBuilder sb;
        String str;
        ArrayList<File> arrayList = this.p;
        if (arrayList == null || (file = arrayList.get(i2)) == null) {
            return;
        }
        String string = this.f27705o.getSharedPreferences("timeFormat", 0).getString("timeFormat", c.h.a.h.n.a.m0);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(string, locale);
        Date date = new Date(file.lastModified());
        Date date2 = new Date(file.lastModified());
        float length = (file.length() / 1024.0f) / 1024.0f;
        String name = file.getName();
        myViewHolder.tv_recordings.setText(name.substring(0, 1).toUpperCase() + name.substring(1));
        TextView textView2 = myViewHolder.tv_recordings;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        if (length > 1024.0f) {
            double d2 = length / 1024.0f;
            Double.isNaN(d2);
            double dRound = Math.round(d2 * 100.0d);
            Double.isNaN(dRound);
            textView = myViewHolder.tv_file_size;
            sb = new StringBuilder();
            sb.append((float) (dRound / 100.0d));
            str = " GB";
        } else {
            double d3 = length;
            Double.isNaN(d3);
            double dRound2 = Math.round(d3 * 100.0d);
            Double.isNaN(dRound2);
            textView = myViewHolder.tv_file_size;
            sb = new StringBuilder();
            sb.append((float) (dRound2 / 100.0d));
            str = " MB";
        }
        sb.append(str);
        textView.setText(sb.toString());
        myViewHolder.tv_date.setText(simpleDateFormat.format(date));
        myViewHolder.tv_time.setText(simpleDateFormat2.format(date2));
        LinearLayout linearLayout = myViewHolder.ll_list_view;
        linearLayout.setOnFocusChangeListener(new e(linearLayout));
        myViewHolder.ll_list_view.setOnClickListener(new a(i2));
        myViewHolder.iv_delete_recording.setOnClickListener(new b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recording_list, viewGroup, false));
    }

    public final void p0(View view, int i2, ArrayList<File> arrayList) {
        PopupMenu popupMenu = new PopupMenu(this.f27705o, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu_recordings, popupMenu.getMenu());
        this.f27698h = new ArrayList<>();
        ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.f27705o).l();
        this.f27698h = arrayListL;
        if (arrayListL != null && arrayListL.size() > 0) {
            for (int i3 = 0; i3 < this.f27698h.size(); i3++) {
                try {
                    popupMenu.getMenu().add(0, i3, i3, this.f27705o.getResources().getString(R.string.play_with) + " " + this.f27698h.get(i3).a());
                } catch (Exception unused) {
                }
            }
        }
        popupMenu.setOnMenuItemClickListener(new c(arrayList, i2));
        popupMenu.setOnDismissListener(new d());
        popupMenu.show();
    }
}
