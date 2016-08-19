package pn.eric.microservice.imp;


import pn.eric.microservice.api.CustomerService;

/**
 * Created by lenovo on 2015/5/11.
 */
public class CustomerServiceImpl implements CustomerService {
    public String getAll() {
       return "getAll Customers";
    }
}
