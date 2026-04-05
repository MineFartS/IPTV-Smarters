package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.AnonymousClass86;
import com.facebook.ads.redexgen.X.AnonymousClass87;
import com.facebook.ads.redexgen.X.EnumC05147s;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {AnonymousClass86.A0I, AnonymousClass86.A0C, AnonymousClass86.A04, AnonymousClass86.A06, AnonymousClass86.A08, AnonymousClass86.A0B, AnonymousClass86.A0E, AnonymousClass86.A0J, AnonymousClass86.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({EnumC05147s.A0B})
@DefaultFor({AnonymousClass87.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({AnonymousClass87.A0E, AnonymousClass87.A0C})
@Documented
public @interface NonNull {
}
