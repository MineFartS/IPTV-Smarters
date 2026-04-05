package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class df implements BaseDisplayContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f21624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection<CompanionAdSlot> f21625c = aty.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, CompanionAdSlot> f21626d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<FriendlyObstruction> f21627e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private de f21628f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21629g = false;

    public df(ViewGroup viewGroup) {
        this.f21624b = viewGroup;
    }

    public final Map<String, CompanionAdSlot> a() {
        return this.f21626d;
    }

    public final Set<FriendlyObstruction> b() {
        return new HashSet(this.f21627e);
    }

    public final void c(de deVar) {
        this.f21628f = deVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void claim() {
        ars.b(!this.f21629g, "A given DisplayContainer may only be used once");
        this.f21629g = true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void destroy() {
        ViewGroup viewGroup = this.f21624b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final ViewGroup getAdContainer() {
        return this.f21624b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final Collection<CompanionAdSlot> getCompanionSlots() {
        return this.f21625c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction) {
        if (friendlyObstruction == null || this.f21627e.contains(friendlyObstruction)) {
            return;
        }
        this.f21627e.add(friendlyObstruction);
        de deVar = this.f21628f;
        if (deVar != null) {
            ((es) deVar).c(friendlyObstruction);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerVideoControlsOverlay(View view) {
        if (view == null) {
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.av avVarBuilder = com.google.ads.interactivemedia.v3.impl.data.aw.builder();
        avVarBuilder.view(view);
        avVarBuilder.purpose(FriendlyObstructionPurpose.VIDEO_CONTROLS);
        com.google.ads.interactivemedia.v3.impl.data.aw awVarBuild = avVarBuilder.build();
        if (this.f21627e.contains(awVarBuild)) {
            return;
        }
        this.f21627e.add(awVarBuild);
        de deVar = this.f21628f;
        if (deVar != null) {
            ((es) deVar).c(awVarBuild);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setAdContainer(ViewGroup viewGroup) {
        ars.g(viewGroup);
        this.f21624b = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setCompanionSlots(Collection<CompanionAdSlot> collection) {
        if (collection == null) {
            collection = aty.n();
        }
        aub aubVar = new aub();
        for (CompanionAdSlot companionAdSlot : collection) {
            if (companionAdSlot != null) {
                int i2 = f21623a;
                f21623a = i2 + 1;
                StringBuilder sb = new StringBuilder(20);
                sb.append("compSlot_");
                sb.append(i2);
                aubVar.b(sb.toString(), companionAdSlot);
            }
        }
        this.f21626d = aubVar.a();
        this.f21625c = collection;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllFriendlyObstructions() {
        this.f21627e.clear();
        de deVar = this.f21628f;
        if (deVar != null) {
            ((es) deVar).g();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllVideoControlsOverlays() {
        this.f21627e.clear();
        de deVar = this.f21628f;
        if (deVar != null) {
            ((es) deVar).g();
        }
    }
}
