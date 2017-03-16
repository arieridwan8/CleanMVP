package id.arieridwan.cleanmvp.dagger.module;

import dagger.Module;
import dagger.Provides;
import id.arieridwan.cleanmvp.mvp.contract.ExchangeRateContract;

/**
 * Created by arieridwan on 16/03/2017.
 */

@Module
public class ExchangeRateModule {

    private final ExchangeRateContract.View mView;

    public ExchangeRateModule(ExchangeRateContract.View mView) {
        this.mView = mView;
    }

    @Provides
    ExchangeRateContract.View provideExchangeRateView() {
        return mView;
    }

}
