package id.arieridwan.cleanmvp.api.dao;

/**
 * Created by arieridwan on 16/03/2017.
 */

public class ExchangeRateDao {

    public String base;
    public String date;
    public CountryCode rates;

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public CountryCode getRates() {
        return rates;
    }

    public class CountryCode {

        public float JPY;

        public float getJPY() {
            return JPY;
        }
    }
}
