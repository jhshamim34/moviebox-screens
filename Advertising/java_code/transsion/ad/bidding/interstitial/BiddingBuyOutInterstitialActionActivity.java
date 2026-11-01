package com.transsion.ad.bidding.interstitial;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.gyf.immersionbar.ImmersionBar;
import com.transsion.ad.bidding.base.activity.AbsBiddingActivity;
import com.transsion.ad.view.RoundedCornerLayout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: source.java */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u0011\u0010 \u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J\u0011\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b!\u0010\u0011J\u0011\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\"\u0010\u0011J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\tJ-\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/transsion/ad/bidding/interstitial/BiddingBuyOutInterstitialActionActivity;", "Lcom/transsion/ad/bidding/base/activity/AbsBiddingActivity;", "<init>", "()V", "", "width", "height", "", "n1", "(II)V", "v0", "()I", "", "getLogTag", "()Ljava/lang/String;", "Landroid/view/View;", "I0", "()Landroid/view/View;", "b1", "Lcom/gyf/immersionbar/ImmersionBar;", "with", "j1", "(Lcom/gyf/immersionbar/ImmersionBar;)V", "Landroid/widget/FrameLayout;", "C0", "()Landroid/widget/FrameLayout;", "K0", "x0", "i", "U0", "(I)V", "N0", "s0", "D0", "E0", "onVideoSizeChanged", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "P0", "(Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lsi/c;", "y", "Lsi/c;", "binding", "lib_ad_gpRelease"}, k = 1, mv = {2, 1, 0}, xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BiddingBuyOutInterstitialActionActivity extends AbsBiddingActivity {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private si.c binding;

    private final void n1(final int width, final int height) {
        final RoundedCornerLayout roundedCornerLayout;
        si.c cVar = this.binding;
        if (cVar != null && (roundedCornerLayout = cVar.f77984c) != null) {
            roundedCornerLayout.post(new Runnable() { // from class: com.transsion.ad.bidding.interstitial.h
                @Override // java.lang.Runnable
                public final void run() {
                    BiddingBuyOutInterstitialActionActivity.o1(BiddingBuyOutInterstitialActionActivity.this, roundedCornerLayout, height, width);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(BiddingBuyOutInterstitialActionActivity biddingBuyOutInterstitialActionActivity, RoundedCornerLayout roundedCornerLayout, int i11, int i12) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ViewGroup.LayoutParams layoutParams = roundedCornerLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (roundedCornerLayout.getWidth() * i11) / i12;
                roundedCornerLayout.setLayoutParams(layoutParams);
                Result.m470constructorimpl(Unit.f69817a);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m470constructorimpl(ResultKt.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(BiddingBuyOutInterstitialActionActivity biddingBuyOutInterstitialActionActivity, View view) {
        biddingBuyOutInterstitialActionActivity.r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q1(BiddingBuyOutInterstitialActionActivity biddingBuyOutInterstitialActionActivity) {
        AppCompatImageView appCompatImageView;
        si.c cVar = biddingBuyOutInterstitialActionActivity.binding;
        if (cVar != null && (appCompatImageView = cVar.f77983b) != null) {
            appCompatImageView.setVisibility(0);
        }
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public FrameLayout C0() {
        si.c cVar = this.binding;
        if (cVar != null) {
            return cVar.f77984c;
        }
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public View D0() {
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public View E0() {
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public View I0() {
        si.c c11 = si.c.c(getLayoutInflater());
        this.binding = c11;
        if (c11 != null) {
            return c11.getRoot();
        }
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public FrameLayout K0() {
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void P0(AppCompatImageView imageView, Integer width, Integer height) {
        super.P0(imageView, width, height);
        if (width != null && height != null) {
            n1(width.intValue(), height.intValue());
        }
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void b1() {
        LinearLayout root;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        si.c cVar = this.binding;
        if (cVar != null && (appCompatImageView2 = cVar.f77983b) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ad.bidding.interstitial.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BiddingBuyOutInterstitialActionActivity.p1(BiddingBuyOutInterstitialActionActivity.this, view);
                }
            });
        }
        si.c cVar2 = this.binding;
        if (cVar2 != null && (appCompatImageView = cVar2.f77983b) != null) {
            appCompatImageView.setVisibility(8);
        }
        si.c cVar3 = this.binding;
        if (cVar3 != null && (root = cVar3.getRoot()) != null) {
            root.postDelayed(new Runnable() { // from class: com.transsion.ad.bidding.interstitial.g
                @Override // java.lang.Runnable
                public final void run() {
                    BiddingBuyOutInterstitialActionActivity.q1(BiddingBuyOutInterstitialActionActivity.this);
                }
            }, y0() * 1000);
        }
    }

    @Override // xi.b
    public String getLogTag() {
        return "ad_int";
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void j1(ImmersionBar with) {
        Intrinsics.h(with, "with");
        super.j1(with);
        with.transparentStatusBar();
        with.transparentNavigationBar();
        with.navigationBarDarkIcon(true);
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity, com.transsion.player.orplayer.f
    public void onVideoSizeChanged(int width, int height) {
        super.onVideoSizeChanged(width, height);
        n1(width, height);
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public View s0() {
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public int v0() {
        return 4;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public int x0() {
        return 0;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void N0() {
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void U0(int i11) {
    }
}
