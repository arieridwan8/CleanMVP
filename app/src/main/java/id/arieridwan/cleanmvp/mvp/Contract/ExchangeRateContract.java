package id.arieridwan.cleanmvp.mvp.contract;

import id.arieridwan.cleanmvp.api.dao.ExchangeRateDao;

/**
 * Created by arieridwan on 16/03/2017.
 */

public interface ExchangeRateContract {
    interface View {
        void bindExchangeRate(ExchangeRateDao exchangeRateDao);
    }

    interface Presenter {
        void getExchangeRate();
    }
}
