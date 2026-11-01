package com.transsion.ad.bidding.splash;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.gyf.immersionbar.ImmersionBar;
import com.transsion.ad.R$id;
import com.transsion.ad.R$string;
import com.transsion.ad.bidding.base.activity.AbsBiddingActivity;
import com.transsion.ad.bidding.splash.BiddingBuyOutSplashActivity;
import com.transsion.ad.view.SwipeUpOrTapForDetailsView;
import com.transsion.player.p007enum.ScaleMode;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import si.g;

/* compiled from: source.java */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0003J\u0011\u0010\"\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u0011\u0010#\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b#\u0010\u000eJ\u0011\u0010$\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b$\u0010\u000eJ\u0011\u0010%\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0003R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/transsion/ad/bidding/splash/BiddingBuyOutSplashActivity;", "Lcom/transsion/ad/bidding/base/activity/AbsBiddingActivity;", "<init>", "()V", "", "n1", "", "getLogTag", "()Ljava/lang/String;", "", "v0", "()I", "Landroid/view/View;", "I0", "()Landroid/view/View;", "Landroid/widget/FrameLayout;", "C0", "()Landroid/widget/FrameLayout;", "K0", "Landroid/widget/ImageView$ScaleType;", "z0", "()Landroid/widget/ImageView$ScaleType;", "Lcom/transsion/player/enum/ScaleMode;", "J0", "()Lcom/transsion/player/enum/ScaleMode;", "Lcom/gyf/immersionbar/ImmersionBar;", "with", "j1", "(Lcom/gyf/immersionbar/ImmersionBar;)V", "x0", "i", "U0", "(I)V", "N0", "s0", "D0", "E0", "H0", "b1", "Lsi/g;", "y", "Lsi/g;", "binding", "lib_ad_gpRelease"}, k = 1, mv = {2, 1, 0}, xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes7.dex */
public final class BiddingBuyOutSplashActivity extends AbsBiddingActivity {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private g binding;

    private final void n1() {
        SwipeUpOrTapForDetailsView swipeUpOrTapForDetailsView;
        g gVar = this.binding;
        if (gVar != null && (swipeUpOrTapForDetailsView = gVar.f78038c) != null) {
            swipeUpOrTapForDetailsView.post(new Runnable() { // from class: pi.b
                @Override // java.lang.Runnable
                public final void run() {
                    BiddingBuyOutSplashActivity.o1(BiddingBuyOutSplashActivity.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(final BiddingBuyOutSplashActivity biddingBuyOutSplashActivity) {
        SwipeUpOrTapForDetailsView swipeUpOrTapForDetailsView;
        SwipeUpOrTapForDetailsView swipeUpOrTapForDetailsView2;
        SwipeUpOrTapForDetailsView swipeUpOrTapForDetailsView3;
        if (biddingBuyOutSplashActivity.getIsAdMaterialShow().get()) {
            g gVar = biddingBuyOutSplashActivity.binding;
            if (gVar != null && (swipeUpOrTapForDetailsView3 = gVar.f78038c) != null) {
                swipeUpOrTapForDetailsView3.setSceneID(biddingBuyOutSplashActivity.getMSceneId());
            }
            g gVar2 = biddingBuyOutSplashActivity.binding;
            if (gVar2 != null && (swipeUpOrTapForDetailsView2 = gVar2.f78038c) != null) {
                swipeUpOrTapForDetailsView2.open();
                return;
            }
            return;
        }
        g gVar3 = biddingBuyOutSplashActivity.binding;
        if (gVar3 != null && (swipeUpOrTapForDetailsView = gVar3.f78038c) != null) {
            swipeUpOrTapForDetailsView.postDelayed(new Runnable() { // from class: pi.c
                @Override // java.lang.Runnable
                public final void run() {
                    BiddingBuyOutSplashActivity.p1(BiddingBuyOutSplashActivity.this);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(BiddingBuyOutSplashActivity biddingBuyOutSplashActivity) {
        biddingBuyOutSplashActivity.n1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q1(BiddingBuyOutSplashActivity biddingBuyOutSplashActivity, View view) {
        biddingBuyOutSplashActivity.r0();
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public FrameLayout C0() {
        g gVar = this.binding;
        if (gVar != null) {
            return gVar.f78040e;
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
    protected View H0() {
        g gVar = this.binding;
        if (gVar != null) {
            return gVar.f78042g;
        }
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public View I0() {
        g c11 = g.c(getLayoutInflater());
        this.binding = c11;
        if (c11 != null) {
            return c11.getRoot();
        }
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public ScaleMode J0() {
        return ScaleMode.SCALE_ASPECT_FILL;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public FrameLayout K0() {
        g gVar = this.binding;
        if (gVar != null) {
            return gVar.f78041f;
        }
        return null;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void N0() {
        r0();
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void U0(int i11) {
        AppCompatTextView appCompatTextView;
        g gVar = this.binding;
        if (gVar != null && (appCompatTextView = gVar.f78044i) != null) {
            appCompatTextView.setVisibility(0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f70045a;
            String string = getString(R$string.ad_skip_ad, Integer.valueOf(i11));
            Intrinsics.g(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            Intrinsics.g(format, "format(...)");
            appCompatTextView.setText(format);
        }
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void b1() {
        AppCompatTextView appCompatTextView;
        try {
            Result.Companion companion = Result.INSTANCE;
            FrameLayout frameLayout = (FrameLayout) findViewById(R$id.movieBoxLayout);
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                frameLayout.addView(LayoutInflater.from(this).inflate(getMAppLayoutId(), (ViewGroup) frameLayout, false));
            } else {
                frameLayout = null;
            }
            Result.m470constructorimpl(frameLayout);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m470constructorimpl(ResultKt.a(th2));
        }
        g gVar = this.binding;
        if (gVar != null && (appCompatTextView = gVar.f78044i) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: pi.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BiddingBuyOutSplashActivity.q1(BiddingBuyOutSplashActivity.this, view);
                }
            });
        }
        n1();
    }

    @Override // xi.b
    public String getLogTag() {
        return "ad_s";
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public void j1(ImmersionBar with) {
        Intrinsics.h(with, "with");
        super.j1(with);
        with.transparentStatusBar();
        with.transparentNavigationBar();
        with.navigationBarDarkIcon(true);
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public View s0() {
        return findViewById(R$id.adIcon);
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public int v0() {
        return 5;
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public int x0() {
        return com.transsion.ad.scene.a.f41766a.s(getMSceneId());
    }

    @Override // com.transsion.ad.bidding.base.activity.AbsBiddingActivity
    public ImageView.ScaleType z0() {
        return ImageView.ScaleType.CENTER_CROP;
    }
}
