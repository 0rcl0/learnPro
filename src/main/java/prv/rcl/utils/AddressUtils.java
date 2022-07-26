package prv.rcl.utils;

public class AddressUtils {

    public static String getAddress(String ProvinceName, String cityName, String AreaName) {
        String temp = "";
        temp += ProvinceName.length() == 3 ? ProvinceName : ProvinceName + "市";
        temp += cityName.length() == 3 ? cityName : cityName + "省";
        temp += AreaName;
        return temp;
    }

}
