package c.h.a.k.b;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.AnnouncementsResponsePojo;
import minefarts.iptvsmarters.view.activity.AnnouncementAlertActivity;
import minefarts.iptvsmarters.view.activity.AnnouncementsActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes2.dex */
public class a extends RecyclerView.h<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f17371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<AnnouncementsResponsePojo> f17372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AnnouncementsActivity f17373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17374h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f17375i;

    /* JADX INFO: renamed from: c.h.a.k.b.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0234a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17377c;

        public ViewOnClickListenerC0234a(String str, String str2) {
            this.f17376b = str;
            this.f17377c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(a.this.f17373g, (Class<?>) AnnouncementAlertActivity.class);
            intent.putExtra("Title", this.f17376b);
            intent.putExtra("Description", this.f17377c);
            a.this.f17373g.startActivity(intent);
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17379b;

        public b(View view) {
            this.f17379b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17379b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17379b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17379b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            View view2;
            int i2;
            if (z) {
                b(1.0f);
                c(1.0f);
                view2 = this.f17379b;
                i2 = R.drawable.shape_checkbox_focused;
            } else {
                if (z) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(z);
                view2 = this.f17379b;
                i2 = R.color.transparent;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public class c extends RecyclerView.e0 {
        public TextView u;
        public TextView v;
        public TextView w;
        public View x;
        public CardView y;

        public c(View view) {
            super(view);
            this.x = view;
            this.u = (TextView) view.findViewById(R.id.tv_message_header);
            this.v = (TextView) view.findViewById(R.id.tv_message);
            this.w = (TextView) view.findViewById(R.id.tv_created_date);
            this.y = (CardView) view.findViewById(R.id.card_notification);
            a.this.f17371e = (RelativeLayout) view.findViewById(R.id.rl_notification);
            a.this.f17375i = (ImageView) view.findViewById(R.id.iv_divider);
        }
    }

    public a(List<AnnouncementsResponsePojo> list, AnnouncementsActivity announcementsActivity) {
        this.f17373g = announcementsActivity;
        this.f17372f = list;
    }

    public String Z(String str) {
        String string = BuildConfig.FLAVOR;
        try {
            String str2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            string = Long.toString(Math.abs(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime()) / TimeChart.DAY);
            Log.e("HERE", "HERE: " + string);
            return string;
        } catch (Exception e2) {
            Log.e("DIDN'T WORK", "exception " + e2);
            return string;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void F(c cVar, int i2) {
        TextView textView;
        String str;
        AnnouncementsResponsePojo announcementsResponsePojo = this.f17372f.get(i2);
        cVar.u.setText(announcementsResponsePojo.c());
        String strC = announcementsResponsePojo.c();
        String strB = announcementsResponsePojo.b();
        cVar.v.setText(announcementsResponsePojo.b());
        String strZ = Z(announcementsResponsePojo.a());
        if (strZ.equalsIgnoreCase("0")) {
            textView = cVar.w;
            str = "Today";
        } else {
            if (!strZ.equalsIgnoreCase("1")) {
                cVar.w.setText(strZ + " days ago");
                cVar.y.setOnClickListener(new ViewOnClickListenerC0234a(strC, strB));
                cVar.y.setOnFocusChangeListener(new b(cVar.y));
                if (i2 == 0 || !this.f17374h) {
                }
                cVar.y.requestFocus();
                this.f17374h = false;
                return;
            }
            textView = cVar.w;
            str = "Yesterday";
        }
        textView.setText(str);
        cVar.y.setOnClickListener(new ViewOnClickListenerC0234a(strC, strB));
        cVar.y.setOnFocusChangeListener(new b(cVar.y));
        if (i2 == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public c H(ViewGroup viewGroup, int i2) {
        return new c(LayoutInflater.from(this.f17373g).inflate(R.layout.layout_announcements, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f17372f.size();
    }
}
