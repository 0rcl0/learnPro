package prv.rcl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import prv.rcl.dao.CityDao;
import prv.rcl.dao.RegionDao;
import prv.rcl.dao.StateDao;
import prv.rcl.entity.*;
import prv.rcl.service.MemberAddressService;
import prv.rcl.utils.AddressUtils;

import java.util.Map;

/**
 *
 */
@Slf4j
@RestController
@RequestMapping("/member")
public class MemberAddressController {

    private static final String ADDRESS = "address";
    private static final String CITY = "city";
    private static final String AREA = "area";
    private static final String PROV = "prov";

    @Autowired
    private MemberAddressService memberAddressService;
    @Autowired
    private CityDao cityDao;
    @Autowired
    private StateDao stateDao;
    @Autowired
    private RegionDao regionDao;

    /**
     * 新增 用户收货地址
     * @param jsonMap 请求体
     * @return 返回地址信息
     */
    @RequestMapping(value = "/address/", method = RequestMethod.POST)
    public Object addMemberAddress(@RequestBody Map<String, Object> jsonMap) {
        MemberAddress memberAddress = new MemberAddress();
        if (jsonMap.containsKey(ADDRESS)) {
            String address = (String) jsonMap.get(ADDRESS);
            Region region = regionDao.queryByCode(address);
            Cities cities = cityDao.queryByCityId(region.getCityId());
            State state = stateDao.selectById(cities.getStateId());
            log.info("各级 stateId:{},regionId:{},cityId:{}",state.getCodeFull(),region.getCodeFull(),cities.getCodeFull());
            memberAddress.setArea(((int) region.getId()));
            memberAddress.setCity(((int) state.getId()));
            memberAddress.setProv(((int) cities.getId()));
            String temp = AddressUtils.getAddress(cities.getCname(), state.getCname(), region.getCname());
            memberAddress.setAddress(temp);
        }
        return memberAddress;
    }


}
