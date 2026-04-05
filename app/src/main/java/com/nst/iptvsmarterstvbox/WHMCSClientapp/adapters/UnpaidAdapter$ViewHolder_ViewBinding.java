package com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class UnpaidAdapter$ViewHolder_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UnpaidAdapter$ViewHolder f24917b;

    public UnpaidAdapter$ViewHolder_ViewBinding(UnpaidAdapter$ViewHolder unpaidAdapter$ViewHolder, View view) {
        this.f24917b = unpaidAdapter$ViewHolder;
        unpaidAdapter$ViewHolder.iv_arrow_downward = (ImageView) c.c(view, R.id.iv_arrow_downward, "field 'iv_arrow_downward'", ImageView.class);
        unpaidAdapter$ViewHolder.layoutFocus = (LinearLayout) c.c(view, R.id.layout, "field 'layoutFocus'", LinearLayout.class);
        unpaidAdapter$ViewHolder.reply_ticket = (RelativeLayout) c.c(view, R.id.rl_reply_ticket, "field 'reply_ticket'", RelativeLayout.class);
        unpaidAdapter$ViewHolder.ll_expandable = (LinearLayout) c.c(view, R.id.ll_expandable, "field 'll_expandable'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        UnpaidAdapter$ViewHolder unpaidAdapter$ViewHolder = this.f24917b;
        if (unpaidAdapter$ViewHolder == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24917b = null;
        unpaidAdapter$ViewHolder.iv_arrow_downward = null;
        unpaidAdapter$ViewHolder.layoutFocus = null;
        unpaidAdapter$ViewHolder.reply_ticket = null;
        unpaidAdapter$ViewHolder.ll_expandable = null;
    }
}
