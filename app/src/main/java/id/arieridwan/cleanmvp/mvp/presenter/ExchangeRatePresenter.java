package id.arieridwan.cleanmvp.mvp.presenter;

import android.util.Log;

import javax.inject.Inject;
import id.arieridwan.cleanmvp.api.ApiInterface;
import id.arieridwan.cleanmvp.api.dao.ExchangeRateDao;
import id.arieridwan.cleanmvp.mvp.contract.ExchangeRateContract;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by arieridwan on 16/03/2017.
 */

public class ExchangeRatePresenter implements ExchangeRateContract.Presenter{

    private Retrofit mRetrofit;
    private ExchangeRateContract.View mView;

    @Inject
    public ExchangeRatePresenter(Retrofit retrofit, ExchangeRateContract.View view) {
        this.mRetrofit = retrofit;
        this.mView = view;
    }

    @Override
    public void getExchangeRate() {
        mRetrofit.create(ApiInterface.class).getExchangeRate("USD", "JPY")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ExchangeRateDao>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("通信 -> ", "失敗" + e.toString());
                    }

                    @Override
                    public void onNext(ExchangeRateDao exchangeRateResponse) {
                        mView.bindExchangeRate(exchangeRateResponse);
                    }
                });
    }
}
